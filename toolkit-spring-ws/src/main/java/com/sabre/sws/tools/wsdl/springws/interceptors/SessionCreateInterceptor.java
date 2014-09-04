package com.sabre.sws.tools.wsdl.springws.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.springws.soap.MessageHeader;
import com.sabre.sws.tools.wsdl.springws.soap.Security;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class SessionCreateInterceptor implements ClientInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateInterceptor.class );

    private static final String securityNs = "http://schemas.xmlsoap.org/ws/2002/12/secext";
    private static final String securityLocalName = "Security";

    private static final String headerNs = "http://www.ebxml.org/namespaces/messageHeader";
    private static final String headerLocalName = "MessageHeader";

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {

        QName securityQName = new QName( securityNs, securityLocalName );
        QName headerQName = new QName( headerNs, headerLocalName );

        String token = null;
        String conversationId = null;

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath( getContextPath() );

        SoapMessage message = (SoapMessage) messageContext.getResponse();
        Source securitySource = message.getSoapHeader().examineHeaderElements( securityQName ).next().getSource();
        Source headerSource = message.getSoapHeader().examineHeaderElements( headerQName ).next().getSource();

        Security security = (Security) marshaller.unmarshal( securitySource );
        MessageHeader header = (MessageHeader) marshaller.unmarshal( headerSource );

        if( !header.getAction().equalsIgnoreCase( "SessionCreateRS" ) ) {
            throw new UnsupportedOperationException( "This interceptors works with SessionCreateRQ only" );
        }

        LOGGER.info( "Creating session..." );

        token = security.getBinarySecurityToken();
        conversationId = header.getConversationId();

        if( token == null | conversationId == null ) {
            throw new WebServiceClientException( "Couldn't retrieve session token from message" ) {
            };
        }

        StringBuffer logBuffer = new StringBuffer("Session Successfully created").append("\n");
        logBuffer.append("Session Token: ").append(token).append("\n");
        logBuffer.append("Conversation ID: ").append(conversationId);
        LOGGER.info(logBuffer.toString());

        SessionManager.getInstance().startSession( token );
        SessionManager.getInstance().setConversationID( conversationId );

        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }

    private String getContextPath() {
        StringBuilder builder = new StringBuilder();

        builder.append(Security.class.getPackage().getName()).append(":");
        builder.append(MessageHeader.class.getPackage().getName()).append(":");

        return builder.toString();
    }
}
