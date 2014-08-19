package com.sabre.sws.tools.wsdl.springws.interceptors;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.ByteArrayOutputStream;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class FaultInterceptor implements ClientInterceptor {

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
            byte[] charData = out.toByteArray();
            String str = new String(charData, "ISO-8859-1");
        } catch(Exception e){
            e.printStackTrace();
        }

        if(messageContext.hasResponse()){
            try{
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                messageContext.getResponse().writeTo(out);
                byte[] charData = out.toByteArray();
                String str = new String(charData, "ISO-8859-1");
                System.out.println( "\nFault response:\n" + str );
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
