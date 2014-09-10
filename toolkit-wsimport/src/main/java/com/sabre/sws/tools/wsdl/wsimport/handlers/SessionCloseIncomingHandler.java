package com.sabre.sws.tools.wsdl.wsimport.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by SG0221139 on 9/2/2014.
 */
public class SessionCloseIncomingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( SessionCloseIncomingHandler.class );

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {

        boolean outbound = ((Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();
        boolean inbound = !outbound;

        if( inbound ) {
            try {
                SOAPHeader header = ((SOAPMessageContext) context).getMessage().getSOAPHeader();
                SOAPBody body = ((SOAPMessageContext)context).getMessage().getSOAPBody();

                NodeList nodeList = header.getChildNodes();
                for( int i = 0; i < nodeList.getLength(); ++i ) {
                    Node node = nodeList.item(i);
                    if(node.getLocalName().equalsIgnoreCase("Security")) {
                        String token = node.getFirstChild().getTextContent();

                        if( ! SessionManager.getInstance().isSessionActive() || ! SessionManager.getInstance().getToken().equals( token ) ) {
                            throw new RuntimeException( "Closed session is not the active one" );
                        }
                        SessionManager.getInstance().endSession();
                    }
                }

            } catch (SOAPException e) {
                LOGGER.error( "Error getting content from SOAP message", e );
            }
        }

        return true;
    }

    @Override
    public boolean handleFault(MessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
