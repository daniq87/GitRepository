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
 */
public class SessionCreateIncomingHandler implements SOAPHandler {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateIncomingHandler.class );

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
                        Node responseBodyNode = body.getFirstChild();
                        Node conversationIdNode = responseBodyNode.getFirstChild();
                        String conversationId = conversationIdNode.getTextContent();

                        if(!( token == null || conversationId == null)) {
                            if( SessionManager.getInstance().isSessionActive() ) {
                                throw new RuntimeException( "Session is already opened" );
                            } else {
                                SessionManager.getInstance().startSession( token );
                                SessionManager.getInstance().setConversationID( conversationId );
                                LOGGER.debug( "Session was successfully opened. Session token:\n" + token );
                            }
                        } else {
                            throw new RuntimeException( "Session information was not found in response" );
                        }
                    }
                }

            } catch (SOAPException e) {
                LOGGER.fatal( "Couldn't open session", e );
                throw new RuntimeException( "Couldn't open session", e );
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
