package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.SessionCloseInterceptor;
import com.sabre.sws.tools.wsdl.springws.session.SessionCloseRQ;
import com.sabre.sws.tools.wsdl.springws.session.SessionCloseRS;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class SessionCloseWrapper extends WebServiceGatewaySupport {

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    public SessionCloseWrapper() {
        super();
        addInterceptors();
    }

    private void addInterceptors() {
        interceptors.add( new LoggingInterceptor() );
        interceptors.add( new SessionCloseInterceptor() );

        this.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    private SessionCloseRQ getRequestBody() {

        SessionCloseRQ requestBody = new SessionCloseRQ();

        SessionCloseRQ.POS pos = new SessionCloseRQ.POS();
        SessionCloseRQ.POS.Source source = new SessionCloseRQ.POS.Source();
        source.setPseudoCityCode(Util.getConfigurationProvider().getPCC());
        pos.setSource( source );
        requestBody.setPOS( pos );

        return requestBody;
    }

    public SessionCloseRS closeSession() {

        return (SessionCloseRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody(),
                new HeaderComposingCallback( "SessionCloseRQ" )
        );
    }

}
