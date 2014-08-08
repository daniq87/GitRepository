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
 */

public class SessionCreateIncomingInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger(SessionCreateIncomingInterceptor.class);

    private static final String securityNs = "http://schemas.xmlsoap.org/ws/2002/12/secext";
    private static final String securityLocalName = "Security";

    private static final String headerNs = "http://www.ebxml.org/namespaces/messageHeader";
    private static final String headerLocalName = "MessageHeader";

    public SessionCreateIncomingInterceptor() {
        super( Phase.PROTOCOL );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        QName securityQName = new QName( securityNs, securityLocalName );
        if( message.hasHeader( securityQName ) ) {
            Header header = message.getHeader( securityQName );
            Element securityHeaderElement = (Element) header.getObject();
            Node tokenNode = securityHeaderElement.getFirstChild();
            if( tokenNode != null ) {
                String token = tokenNode.getTextContent();
                SessionManager.getInstance().startSession( token );

                QName headerQName = new QName( headerNs, headerLocalName );
                Header messageHeader = message.getHeader( headerQName );
                Element messageHeaderElement = (Element) messageHeader.getObject();
                Node messageHeaderNode = messageHeaderElement.getFirstChild();

                if( messageHeaderNode != null ) {
                    String conversationId = messageHeaderNode.getTextContent();
                    SessionManager.getInstance().setConversationID( conversationId );
                }

            } else {
                Throwable t = new RuntimeException( "Authentication failed - no token found in response" );
                throw new Fault( t );
            }
        } else {
            Throwable t = new RuntimeException( "Invalid response - no wsse:Security header was found" );
            throw new Fault( t );
        }

    }

}
