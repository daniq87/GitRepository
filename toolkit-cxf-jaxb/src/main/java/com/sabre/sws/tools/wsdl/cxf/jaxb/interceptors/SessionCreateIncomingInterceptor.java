package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;

/**
 * Created by SG0221139 on 8/7/2014.
 *
 * This is an interceptor class for Sabre Web Services' CXF client application.
 * It traverses the message header's structure and checks if the current message
 * is a part of the SessionCreateRQ response. If so, the session information
 * (session token and conversation ID) is retrieved from the header and
 * and stored in SessionManager's instance.
 *
 */

public class SessionCreateIncomingInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger(SessionCreateIncomingInterceptor.class);

    private static final String securityNs = "http://schemas.xmlsoap.org/ws/2002/12/secext";
    private static final String securityLocalName = "Security";

    private static final String headerNs = "http://www.ebxml.org/namespaces/messageHeader";
    private static final String headerLocalName = "MessageHeader";
    private static final QName securityQName = new QName( securityNs, securityLocalName );;
    private static final QName headerQName = new QName( headerNs, headerLocalName );

    public SessionCreateIncomingInterceptor() {
        super( Phase.PROTOCOL );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        openSessionUsingTokenFromMessage(message);
    }

    private void openSessionUsingTokenFromMessage(SoapMessage message) {
        String token = getTokenFromMessage( message );
        String conversationId = getConversationIdFromMessage( message );

        if( anyIsNull( token, conversationId ) ){
            Throwable t = new RuntimeException( "Authentication failed - no session information found in response" );
            throw new Fault( t );
        }

        SessionManager.getInstance().startSession( token );
        SessionManager.getInstance().setConversationID( conversationId );
    }

    private String getTokenFromMessage(SoapMessage message) {

        String token = null;

        if( message.hasHeader(securityQName) ) {
            Header header = message.getHeader(securityQName);
            Element securityHeaderElement = (Element) header.getObject();
            Node tokenNode = securityHeaderElement.getFirstChild();
            if (tokenNode != null) {
                token = tokenNode.getTextContent();
            }
        }
        return token;
    }

    private String getConversationIdFromMessage( SoapMessage message ) {

        String conversationId = null;

        Header messageHeader = message.getHeader(headerQName);
        Element messageHeaderElement = (Element) messageHeader.getObject();
        Node messageHeaderNode = messageHeaderElement.getFirstChild();

        if( messageHeaderNode != null ) {
            conversationId = messageHeaderNode.getTextContent();
        }
        return conversationId;
    }

    private boolean anyIsNull( Object ... objects ) {
        for( Object o : objects ) {
            if( o == null ) {
                return true;
            }
        }
        return false;
    }

}
