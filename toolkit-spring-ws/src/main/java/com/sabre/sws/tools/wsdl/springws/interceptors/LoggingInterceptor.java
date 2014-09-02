package com.sabre.sws.tools.wsdl.springws.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class LoggingInterceptor implements ClientInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LoggingInterceptor.class );

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            messageContext.getRequest().writeTo( outputStream );
            String responseText = outputStream.toString( "UTF-8" );
            LOGGER.debug("\nOutgoing request message:\n" + XMLPrettifier.pretify(responseText));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            messageContext.getResponse().writeTo( outputStream );
            String responseText = outputStream.toString( "UTF-8" );
            LOGGER.debug("\nIncoming response message:\n" + XMLPrettifier.pretify(responseText));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }

}
