package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.LLSErrorInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.SessionCreateIncomingInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SessionCreateFactory;
import https.webservices_sabre_com.websvc.SessionCreatePortType;
import https.webservices_sabre_com.websvc.SessionCreateRQService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

/**
 * Created by SG0221139 on 8/5/2014.
 */

public class SessionCreateWrapper {

    private static final Logger LOGGER = LogManager.getLogger(SessionCreateWrapper.class);

    public SessionCreateRS openSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader(Util.getConfigurationProvider(), "SessionCreateRQ" );
        Security security = SecurityFactory.getSecurity(Util.getConfigurationProvider(), true);
        SessionCreateRQ body = SessionCreateFactory.getSessionCreate(Util.getConfigurationProvider());

        Holder<MessageHeader> headerHolder = new Holder<>( header );
        Holder<Security> securityHolder = new Holder<> ( security );

        SessionCreateRQService service = new SessionCreateRQService();
        SessionCreatePortType stub = service.getSessionCreatePortType();

        setEndpointUrl((BindingProvider) stub);
        setInterceptors(stub);

        SessionCreateRS rs = stub.sessionCreateRQ( headerHolder, securityHolder, body );

        LOGGER.info( "Token from returned header: " + securityHolder.value.getBinarySecurityToken() );
        LOGGER.info( "Token from session manager: " + SessionManager.getInstance().getToken() );

        return rs;
    }

    private void setEndpointUrl(BindingProvider stub) {
        // Redirect service call to endpoint defined in connection.properties
        // This is important, as the default endpoint is https://webservices.sabre.com/websvc
        BindingProvider bindingProvider = stub;
        bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Util.getConfigurationProvider().getEndpoint() );
    }

    private void setInterceptors(SessionCreatePortType stub) {
        Client client = ClientProxy.getClient(stub);
        Endpoint endpoint = client.getEndpoint();

        endpoint.getOutInterceptors().add( new LoggingOutInterceptor(Phase.PRE_STREAM) );
        endpoint.getInInterceptors().add( new SessionCreateIncomingInterceptor() );
        endpoint.getInInterceptors().add( new LoggingInInterceptor() );
        endpoint.getInInterceptors().add( new LLSErrorInterceptor() );
    }
}
