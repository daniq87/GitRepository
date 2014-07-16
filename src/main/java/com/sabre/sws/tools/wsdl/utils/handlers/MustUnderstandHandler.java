package com.sabre.sws.tools.wsdl.utils.handlers;

import com.sabre.sws.tools.wsdl.utils.SessionManager;
import org.apache.axiom.soap.RolePlayer;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.handlers.AbstractHandler;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by SG0221139 on 7/11/2014.
 */

public class MustUnderstandHandler extends AbstractHandler {

    private static final Logger LOGGER = Logger.getLogger( MustUnderstandHandler.class.getName() );

    @Override
    public Handler.InvocationResponse invoke(MessageContext msgContext) throws AxisFault {

        SOAPEnvelope envelope = msgContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();

        if( header == null ) {
            return InvocationResponse.CONTINUE;
        }

        RolePlayer rolePlayer = (RolePlayer) msgContext.getConfigurationContext().getAxisConfiguration().getParameterValue( "rolePlayer" );

        Iterator headerBlocks = header.getHeadersToProcess( rolePlayer );

        // XMLStreamReader parser = envelope.getXMLStreamReader();
        // StAXStreamBuilder builder = new StAXStreamBuilder();

        while( headerBlocks.hasNext() ) {
            SOAPHeaderBlock headerBlock = (SOAPHeaderBlock) headerBlocks.next();

            XMLStreamReader streamReader =  headerBlock.getXMLStreamReader();

            try {                   // TODO: Should check, if it is SessionCreateRQ
                while( streamReader.hasNext() ) {
                    if( streamReader.getEventType() == XMLStreamConstants.START_ELEMENT ) {
                        if( streamReader.hasName() ) {
                            if( streamReader.getName().getLocalPart().equals( "BinarySecurityToken" ) ) {
                                SessionManager.getInstance().startSession( streamReader.getElementText() );
                                LOGGER.log( Level.INFO,
                                            "Acquired session token from service",
                                            SessionManager.getInstance().getToken()
                                );
                            } else if( streamReader.getName().getLocalPart().equals( "Action" ) ) {
                                LOGGER.log( Level.INFO, streamReader.getElementText() );
                            }
                        }

                    }
                    streamReader.next();
                }
            } catch( Exception e ) {    // TODO: Catch less generic exception
                e.printStackTrace();
                LOGGER.log( Level.SEVERE, "Error parsing message header", e );
            }
            headerBlock.setProcessed();
        }

        return InvocationResponse.CONTINUE;

    }
}
