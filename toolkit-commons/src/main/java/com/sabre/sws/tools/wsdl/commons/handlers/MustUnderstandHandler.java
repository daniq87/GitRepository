package com.sabre.sws.tools.wsdl.commons.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.Iterator;

/**
 * Created by SG0221139 on 7/11/2014.
 *
 * This is a handler class for Apache Axis2 framework.
 * It processes header elements marked with the mustUnderstand="1" attribute
 * and takes care of session management (it reads header action and
 * tests if it concerns session management.
 *
 */

public class MustUnderstandHandler extends AbstractHandler {

    private static final Logger LOGGER = LogManager.getLogger(MustUnderstandHandler.class.getName());

    @Override
    public Handler.InvocationResponse invoke(MessageContext msgContext) throws AxisFault {

        LOGGER.info( "MustUnderstandHandler invoke: " + this.getClass().getCanonicalName() );

        SOAPEnvelope envelope = msgContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();

        String conversationID = null;

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
                        } else if( elementText.equals( "SessionCreateRS" ) ) {
                            isSessionCreateRS = true;
                        } else if( elementText.equals( "SessionCloseRS" ) ) {
                            SessionManager.getInstance().endSession();
                        }
                    } else if( streamReader.getName().getLocalPart().equals( "ConversationId" ) ) {
                        conversationID = streamReader.getElementText();
                    }
                    if( isSessionCreateRS && streamReader.getName().getLocalPart().equals( "BinarySecurityToken" ) ) {
                        isSessionCreateRS = false;
                        LOGGER.info( "Opening new session..." );
                        SessionManager.getInstance().startSession( streamReader.getElementText() );
                        SessionManager.getInstance().setConversationID( conversationID );
                        LOGGER.info( "Started session" );
                        LOGGER.info( "Acquired session token from service " );
                    }
                }
                streamReader.next();
            }
        } catch( XMLStreamException e ) {
            LOGGER.error( "Error parsing message header", e );
        }

        Iterator headerBlocksIterator = header.getHeadersToProcess(null);
        while( headerBlocksIterator.hasNext() ) {
            SOAPHeaderBlock next = (SOAPHeaderBlock) headerBlocksIterator.next();
            next.setProcessed();
        }

        return InvocationResponse.CONTINUE;

    }
}
