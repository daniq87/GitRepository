package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.LoggingInInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.LoggingOutInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.SessionCloseIncomingInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SessionCloseFactory;
import https.webservices_sabre_com.websvc.SessionClosePortType;
import https.webservices_sabre_com.websvc.SessionCloseRQService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCloseRQ;
import org.opentravel.ota._2002._11.SessionCloseRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class SessionCloseWrapper {

    public SessionCloseRS closeSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader( Util.getConfigurationProvider(), "SessionCloseRQ");
        Security security = SecurityFactory.getSecurity( Util.getConfigurationProvider(), false );
        SessionCloseRQ body = SessionCloseFactory.getSessionClose( Util.getConfigurationProvider() );

        Holder<MessageHeader> headerHolder = new Holder<>( header );
        Holder<Security> securityHolder = new Holder<>( security );

        SessionCloseRQService service = new SessionCloseRQService();
        SessionClosePortType stub = service.getSessionClosePortType();

        // Redirect service call to endpoint defined in connection.properties
        // This is important, as the default endpoint is https://webservices.sabre.com/websvc
        BindingProvider bindingProvider = (BindingProvider) stub;
        bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Util.getConfigurationProvider().getEndpoint() );

        // Set Interceptors
        Client client = ClientProxy.getClient( stub );
        Endpoint endpoint = client.getEndpoint();
        endpoint.getInInterceptors().add( new SessionCloseIncomingInterceptor() );
        endpoint.getInInterceptors().add( new LoggingInInterceptor() );
        endpoint.getOutInterceptors().add( new LoggingOutInterceptor() );

        // Invoke
        SessionCloseRS response = stub.sessionCloseRQ( headerHolder, securityHolder, body );

        return response;
    }

}
