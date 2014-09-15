package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;

/**
 * Created by SG0221139 on 8/7/2014.
 *
 * This is an interceptor class for Sabre Web Services' CXF client application.
 * It traverses the message header's structure and checks if the current message
 * is a part of the SessionCloseRQ response. If so, the session information
 * (session token and conversation ID) is removed from the SessionManager's instance.
 *
 */
public class SessionCloseIncomingInterceptor extends AbstractSoapInterceptor {

    private static final String securityNs = "http://schemas.xmlsoap.org/ws/2002/12/secext";
    private static final String securityLocalName = "Security";

    public SessionCloseIncomingInterceptor() {
        super( Phase.READ );
        addAfter( SoapActionInInterceptor.class.getName() );
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

                if( ! SessionManager.getInstance().isSessionActive() || ! SessionManager.getInstance().getToken().equals( token ) ) {
                    Throwable t = new RuntimeException( "Can't close session that isn't currently open" );
                    throw new Fault( t );
                }

                SessionManager.getInstance().endSession();

            } else {
                Throwable e = new RuntimeException( "There is no open session" );
                throw new Fault( e );
            }
        }

    }
}
