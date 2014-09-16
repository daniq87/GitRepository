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
 * Created by SG0221139 on 9/1/2014.
 *
 * This is a handler class for working with wsimport Sabre Web Services client.
 * It's responsibility is to intercept incoming SessionCreateRQ response message,
 * read session data (session token and conversation ID) and register
 * new session in SessionManager's instance.
 *
 */
public class SessionCreateIncomingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateIncomingHandler.class );

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {

        boolean inbound = isMessageInbound(context);

        if( inbound ) {
            try {
                String token = getTokenFromContext(context);
                String conversationId = getConversationIdFromContext(context);
                tryOpenSessionWithTokenAndConvIdIfNoneActive(token, conversationId);
            } catch (SOAPException e) {
                LOGGER.fatal( "Couldn't open session", e );
                throw new RuntimeException( "Couldn't open session", e );
            }
        }
        return true;
    }

    private void tryOpenSessionWithTokenAndConvIdIfNoneActive(String token, String conversationId) {

        if( SessionManager.getInstance().isSessionActive() ) {
            throw new RuntimeException( "Session is already opened" );
        }
        if( noneIsNull( token, conversationId ) ) {
            openSessionWithTokenAndConvId(token, conversationId);
        } else {
            throw new RuntimeException( "Session information was not found in response" );
        }
    }

    private String getConversationIdFromContext(MessageContext context) throws SOAPException {
        SOAPBody body = ((SOAPMessageContext)context).getMessage().getSOAPBody();
        return getConversationIdFromSOAPBody(body);
    }

    private String getTokenFromContext(MessageContext context) throws SOAPException {
        SOAPHeader header = ((SOAPMessageContext) context).getMessage().getSOAPHeader();
        NodeList nodeList = header.getChildNodes();
        Node securityNode = getSecurityNodeFromList(nodeList);
        return getTokenFromNode(securityNode);
    }

    private void openSessionWithTokenAndConvId(String token, String conversationId) {
        SessionManager.getInstance().startSession( token );
        SessionManager.getInstance().setConversationID( conversationId );
        LOGGER.debug( "Session was successfully opened. Session token:\n" + token );
    }

    private boolean noneIsNull( Object ... objects ) {
        for( Object o : objects ) {
            if( o == null ) {
                return false;
            }
        }
        return true;
    }

    private String getConversationIdFromSOAPBody(SOAPBody body) {
        Node responseBodyNode = body.getFirstChild();
        Node conversationIdNode = responseBodyNode.getFirstChild();
        return conversationIdNode.getTextContent();
    }

    private String getTokenFromNode(Node node) {
        return node.getFirstChild().getTextContent();
    }

    private Node getSecurityNodeFromList( NodeList nodeList ) {
        for( int i = 0; i < nodeList.getLength(); ++i ) {
            Node node = nodeList.item(i);
            if(node.getLocalName().equalsIgnoreCase("Security")) {
                return node;
            }
        }
        return null;
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
}
