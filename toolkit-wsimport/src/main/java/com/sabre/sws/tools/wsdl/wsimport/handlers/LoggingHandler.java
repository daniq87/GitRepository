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
 */
public class LoggingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( LoggingHandler.class );

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {

        boolean outbound = ((Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();

        StringBuffer buffer = new StringBuffer("\n\n");
        if( outbound ) {
            buffer.append( "Outgoing message:" ).append( "\n\n" );
        } else {
            buffer.append( "Ingoing message:" ).append( "\n\n" );
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ((SOAPMessageContext) context).getMessage().writeTo(bos);
            String messageText = XMLPrettifier.pretify( new String(bos.toByteArray()) );
            buffer.append( messageText ).append( "\n\n" );

            LOGGER.debug( buffer.toString() );

        } catch (SOAPException | IOException e) {
            e.printStackTrace();
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
}
