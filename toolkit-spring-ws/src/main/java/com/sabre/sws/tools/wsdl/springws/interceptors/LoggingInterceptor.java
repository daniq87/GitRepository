package com.sabre.sws.tools.wsdl.springws.interceptors;

import org.apache.logging.log4j.Level;
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
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            messageContext.getResponse().writeTo( outputStream );
            String responseText = outputStream.toString( "UTF-8" );
            LOGGER.log(Level.INFO, "\nResponse:\n" + responseText );
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
