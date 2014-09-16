package com.sabre.sws.tools.wsdl.wsimport.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by SG0221139 on 9/2/2014.
 *
 * This is a handler class for working with wsimport Sabre Web Services client.
 * It's responsibility is to intercept and handle incoming SessionCloseRQ response message.
 * It reads session data (session token and conversation ID), and if they match
 * currently open session's, it closes it in SessionManager instance.
 *
 */
public class SessionCloseIncomingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( SessionCloseIncomingHandler.class );

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {

        boolean inbound = isMessageInbound(context);

        if( inbound ) {
            try {
                String tokenFromMessage = getTokenFromMessageContext(context);
                if( !stringMatchesCurrentSessionToken(tokenFromMessage)  ) {
                    throw new RuntimeException( "Closed session is not the active one" );
                }
                SessionManager.getInstance().endSession();

            } catch (SOAPException e) {
                LOGGER.error( "Error getting content from SOAP message", e );
            }
        }
        return true;
    }

    private boolean isMessageInbound(MessageContext context) {
        boolean outbound = ((Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue();
        return !outbound;
    }

    @Override
    public boolean handleFault(MessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }

    private boolean stringMatchesCurrentSessionToken(String inputString) {
        return SessionManager.getInstance().isSessionActive() &&
                SessionManager.getInstance().getToken().equals( inputString );
    }

    private String getTokenFromMessageContext(MessageContext context) throws SOAPException {
        Node securityNode = getSecurityNodeFromContext(context);
        String token = securityNode.getFirstChild().getTextContent();
        return token;
    }

    private Node getSecurityNodeFromContext(MessageContext context) throws SOAPException {
        SOAPHeader header = ((SOAPMessageContext) context).getMessage().getSOAPHeader();

        NodeList nodeList = header.getChildNodes();
        for( int i = 0; i < nodeList.getLength(); ++i ) {
            Node node = nodeList.item(i);
            if (node.getLocalName().equalsIgnoreCase("Security")) {
                return node;
            }
        }
        return null;
    }
}
