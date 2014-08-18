package com.sabre.sws.tools.wsdl.springws.client;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.IOException;

/**
 * Created by SG0221139 on 8/13/2014.
 */
public class SwsClient extends WebServiceGatewaySupport {

    public SessionCreateRS createSession() {

        ClientInterceptor clientInterceptor = new ClientInterceptor() {
            @Override
            public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
                return false;
            }

            @Override
            public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
                try {
                    System.out.println( "\nResponse:" );
                    messageContext.getResponse().writeTo( System.out );
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
        };

        IConfigurationProvider configurationProvider = Util.getConfigurationProvider();

        SessionCreateRQ request = new SessionCreateRQ();

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        source.setPseudoCityCode( configurationProvider.getPCC() );
        pos.setSource( source );
        request.setPOS( pos );

        this.setInterceptors( new ClientInterceptor[] {clientInterceptor} );

        SessionCreateRS response = (SessionCreateRS)getWebServiceTemplate().marshalSendAndReceive(request, new HeaderComposingCallback( "SessionCreateRQ" ) );

        return response;
    }

}
