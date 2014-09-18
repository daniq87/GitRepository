package com.sabre.sws.tools.wsdl.wsimport.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

/**
 * Created by SG0221139 on 9/2/2014.
 *
 * This is a handler class for working with wsimport Sabre Web Services client.
 * It's a logging handler, that logs formatted SOAP message using standard logger.
 *
 */
public class LoggingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( LoggingHandler.class );

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {

        try {
            String logMessage = composeLogMessage(context);
            LOGGER.debug( logMessage );

        } catch (SOAPException | IOException e) {
            LOGGER.error( e );
        }
        return true;
    }

    @Override
    public boolean handleFault(MessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }

    private String composeLogMessage(MessageContext messageContext) throws SOAPException, IOException {

        SOAPMessageContext soapMessageContext = (SOAPMessageContext) messageContext;

        boolean outbound = isMessageOutbound(soapMessageContext);

        StringBuffer logMessageBuffer = new StringBuffer("\n\n");
        if( outbound ) {
            logMessageBuffer.append("Outgoing message:").append( "\n\n" );
        } else {
            logMessageBuffer.append("Ingoing message:").append( "\n\n" );
        }
        String rawMessage = getRawMessage(soapMessageContext);
        String formattedMessage = XMLPrettifier.pretify(rawMessage);
        logMessageBuffer.append(formattedMessage).append("\n\n");
        return logMessageBuffer.toString();
    }

    private String getRawMessage(SOAPMessageContext context) throws SOAPException, IOException {
        ByteArrayOutputStream messageContentStream = new ByteArrayOutputStream();
        context.getMessage().writeTo(messageContentStream);
        String messageText = new String(messageContentStream.toByteArray());
        return messageText;
    }

    private boolean isMessageOutbound(MessageContext context) {
        return ((Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();
    }
}
