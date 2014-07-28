package com.sabre.sws.tools.wsdl.commons.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.handlers.AbstractHandler;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
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

        LOGGER.log( Level.INFO, "MustUnderstandHandler invoke" );

        SOAPEnvelope envelope = msgContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();

        if( header == null ) {
            return InvocationResponse.CONTINUE;
        }

        if( envelope.getBody().hasFault() ) {
            return InvocationResponse.ABORT;
        }

        XMLStreamReader streamReader =  header.getXMLStreamReader();

        try {

            boolean isSessionCreateRS = false;

            while( streamReader.hasNext() ) {
                if( streamReader.getEventType() == XMLStreamConstants.START_ELEMENT && streamReader.hasName() ) {
                    if( streamReader.getName().getLocalPart().equals( "Action" ) ) {
                        String elementText = streamReader.getElementText();
                        if( elementText.equals( "ErrorRS" ) ) {
//                            continueErrorProcessing( envelope.getBody().getXMLStreamReader() ); // TODO
                        } else if( elementText.equals( "SessionCreateRS" ) ) {
                            isSessionCreateRS = true;
                        } else if( elementText.equals( "SessionCloseRS" ) ) {
                            SessionManager.getInstance().endSession();
                        }
                    }
                    if( isSessionCreateRS && streamReader.getName().getLocalPart().equals( "BinarySecurityToken" ) ) {
                        SessionManager.getInstance().startSession( streamReader.getElementText() );
                        LOGGER.log( Level.INFO, "Started session" );
                        LOGGER.log( Level.INFO, "Acquired session token from service " );
                    }
                }
                streamReader.next();
            }
        } catch( XMLStreamException e ) {
            LOGGER.log( Level.SEVERE, "Error parsing message header", e );
        }

        Iterator headerBlocksIterator = header.getHeadersToProcess(null);
        while( headerBlocksIterator.hasNext() ) {
            ((SOAPHeaderBlock) headerBlocksIterator.next()).setProcessed();
        }

        return InvocationResponse.CONTINUE;

    }
}
