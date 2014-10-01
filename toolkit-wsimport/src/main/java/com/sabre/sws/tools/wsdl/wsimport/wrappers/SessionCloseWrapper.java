package com.sabre.sws.tools.wsdl.wsimport.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.wsimport.handlers.LoggingHandler;
import com.sabre.sws.tools.wsdl.wsimport.handlers.SessionCloseIncomingHandler;
import com.sabre.sws.tools.wsdl.wsimport.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.wsimport.utils.SecurityFactory;
import https.webservices_sabre_com.websvc.SessionClosePortType;
import https.webservices_sabre_com.websvc.SessionCloseRQService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCloseRQ;
import org.opentravel.ota._2002._11.SessionCloseRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SessionCloseWrapper {

    private static final Logger LOGGER = LogManager.getLogger( SessionCloseWrapper.class );

    private final SessionClosePortType port;
    private final IConfigurationProvider configuration = Util.getConfigurationProvider();
    private final static String serviceAction = "SessionCloseRQ";

    public SessionCloseWrapper() {

        port = new SessionCloseRQService().getSessionClosePortType();

        String endpointURL = Util.getConfigurationProvider().getEndpoint();
//        endpointURL = "http://localhost:8088/mockSessionCloseSoapBinding";
        ((BindingProvider) port).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL );
    }

    public SessionCloseRS closeSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader(serviceAction);
        Security security = SecurityFactory.getTokenSecurity();

        addHandler( port );

        LOGGER.info( "Closing session..." );

        SessionCloseRS sessionCloseRS = port.sessionCloseRQ(
                new Holder<>(header),
                new Holder<>(security),
                getRequestBody()
        );

        LOGGER.info( "Session was successfully closed" );

        return sessionCloseRS;
    }

    private SessionCloseRQ getRequestBody() {

        SessionCloseRQ requestBody = new SessionCloseRQ();

        SessionCloseRQ.POS pos = new SessionCloseRQ.POS();
        SessionCloseRQ.POS.Source source = new SessionCloseRQ.POS.Source();
        String pcc = configuration.getPCC();
        source.setPseudoCityCode( pcc );
        pos.setSource( source );

        requestBody.setPOS( pos );

        return requestBody;
    }

    private void addHandler( SessionClosePortType port ) {
        List<Handler> handlers = ((BindingProvider)port).getBinding().getHandlerChain();


        if( handlers == null ) {
            handlers = new ArrayList<>();
        }

        handlers.add( new SessionCloseIncomingHandler() );
        handlers.add( new LoggingHandler() );

        ((BindingProvider)port).getBinding().setHandlerChain( handlers );
    }
}
