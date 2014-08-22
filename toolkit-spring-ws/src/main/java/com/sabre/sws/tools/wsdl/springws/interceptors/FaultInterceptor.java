package com.sabre.sws.tools.wsdl.springws.interceptors;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.ByteArrayOutputStream;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class FaultInterceptor implements ClientInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( FaultInterceptor.class );

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {

        try{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            messageContext.getRequest().writeTo(out);
            String faultRequest = out.toString("ISO-8859-1");
            LOGGER.log(Level.ERROR, "\nFault response:\n" + faultRequest );
        } catch(Exception e){
            e.printStackTrace();
        }

        if(messageContext.hasResponse()){
            try{
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                messageContext.getResponse().writeTo(out);
                String faultResponse = out.toString("ISO-8859-1");
                LOGGER.log(Level.ERROR, "\nFault response:\n" + faultResponse );

            } catch(Exception e){
                e.printStackTrace();
            }
        }

        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }
}
