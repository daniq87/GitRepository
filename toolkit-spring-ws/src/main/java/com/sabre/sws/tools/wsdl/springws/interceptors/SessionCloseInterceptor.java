package com.sabre.sws.tools.wsdl.springws.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.springws.soap.MessageHeader;
import com.sabre.sws.tools.wsdl.springws.soap.Security;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.context.MessageContext;

import javax.xml.bind.JAXBException;

/**
 * Created by SG0221139 on 8/18/2014.
 *
 * This is an interceptor class for working with Spring Web Services framework.
 * It's responsibility is to ensure that processed message is a SessionCloseRQ response
 * message, validate if session being closed is the active one and inform SessionManager
 * instance about closing session.
 */
public class SessionCloseInterceptor extends AbstractSessionInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( SessionCloseInterceptor.class );

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {

        String token = null;
        String conversationId = null;

        try {
            Security security = extractSecurityFromMessageContext(messageContext);
            MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

            if( !isSessionCloseRS(header)) {
                throw new UnsupportedOperationException( "This interceptors works with SessionCloseRQ only" );
            }

            token = security.getBinarySecurityToken();
            conversationId = header.getConversationId();

        } catch (JAXBException | NullPointerException e) {
            LOGGER.fatal( "Error occurred during retrieving session token", e );
        }

        if( token == null | conversationId == null ) {
            throw new WebServiceClientException( "Couldn't retrieve session token from message" ) {};
        }

        if( !tokenAndConvIdFromMessageMatchCurrentSessions(token, conversationId)) {
            throw new WebServiceClientException( "SessionClose request was not invoked for current session" ) {};
        }

        logTokenAndConversationIdFromMessage(token, conversationId);
        SessionManager.getInstance().endSession();

        return true;
    }

}
