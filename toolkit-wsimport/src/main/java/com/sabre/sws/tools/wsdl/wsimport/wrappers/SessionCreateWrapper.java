package com.sabre.sws.tools.wsdl.wsimport.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.wsimport.handlers.LoggingHandler;
import com.sabre.sws.tools.wsdl.wsimport.handlers.SessionCreateIncomingInterceptor;
import com.sabre.sws.tools.wsdl.wsimport.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.wsimport.utils.SecurityFactory;
import https.webservices_sabre_com.websvc.SessionCreatePortType;
import https.webservices_sabre_com.websvc.SessionCreateRQService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SessionCreateWrapper {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateWrapper.class );

    private final SessionCreatePortType port;
    private final IConfigurationProvider configuration = Util.getConfigurationProvider();
    private final static String serviceAction = "SessionCreateRQ";

    public SessionCreateWrapper() {

        port = new SessionCreateRQService().getSessionCreatePortType();

        String endpointURL = Util.getConfigurationProvider().getEndpoint();
        ((BindingProvider) port).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL );
    }

    public SessionCreateRS openSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader( serviceAction );
        Security security = SecurityFactory.getCredentialsSecurity();

        addHandlers(port);

        LOGGER.debug( "Opening session..." );

        Holder<Security> securityHolder = new Holder<>(security);
        Holder<MessageHeader> headerHolder = new Holder<>(header);

        SessionCreateRS sessionCreateRS = port.sessionCreateRQ(
                headerHolder,
                securityHolder,
                getRequestBody()
        );

        LOGGER.info( "Session was successfully opened" );
        LOGGER.info( "Token from returned header: " + securityHolder.value.getBinarySecurityToken());
        LOGGER.info( "Token from session manager: " + SessionManager.getInstance().getToken() );
        return sessionCreateRS;
    }

    private SessionCreateRQ getRequestBody() {

        SessionCreateRQ requestBody = new SessionCreateRQ();

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        String pcc = configuration.getPCC();
        source.setPseudoCityCode( pcc );
        pos.setSource( source );

        requestBody.setPOS( pos );

        return requestBody;
    }

    private void addHandlers(SessionCreatePortType port) {
        List<Handler> handlers = ((BindingProvider)port).getBinding().getHandlerChain();

        if( handlers == null ) {
            handlers = new ArrayList<>();
        }

        handlers.add( new SessionCreateIncomingInterceptor() );
        handlers.add( new LoggingHandler() );

        ((BindingProvider)port).getBinding().setHandlerChain( handlers );
    }

}
