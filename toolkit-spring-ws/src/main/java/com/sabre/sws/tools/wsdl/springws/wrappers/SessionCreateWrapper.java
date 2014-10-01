package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.SessionCreateInterceptor;
import com.sabre.sws.tools.wsdl.springws.session.SessionCreateRQ;
import com.sabre.sws.tools.wsdl.springws.session.SessionCreateRS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class SessionCreateWrapper extends WebServiceGatewaySupport {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateWrapper.class );

    private final ClientInterceptor clientInterceptor = new LoggingInterceptor();
    private final SessionCreateInterceptor sessionCreateInterceptor = new SessionCreateInterceptor();

    private final IConfigurationProvider configurationProvider = Util.getConfigurationProvider();
    private final List<ClientInterceptor> interceptors = new ArrayList<>();

    public SessionCreateWrapper() {
        super();
        addInterceptors();
    }

    private void addInterceptors() {
        interceptors.add( clientInterceptor );
        interceptors.add( sessionCreateInterceptor );

        this.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    private SessionCreateRQ getRequestBody() {

        SessionCreateRQ requestBody = new SessionCreateRQ();

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        source.setPseudoCityCode(configurationProvider.getPCC());
        pos.setSource(source);
        requestBody.setPOS(pos);

        return requestBody;
    }

    public SessionCreateRS openSession() {

        LOGGER.info( "Opening session..." );
        SessionCreateRS sessionCreateRQ = (SessionCreateRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody(),
                new HeaderComposingCallback("SessionCreateRQ")
        );

        LOGGER.info( "Session successfully opened" );

        return sessionCreateRQ;
    }
}
