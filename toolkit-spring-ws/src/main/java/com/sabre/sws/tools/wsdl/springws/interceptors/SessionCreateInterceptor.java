package com.sabre.sws.tools.wsdl.springws.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.springws.soap.MessageHeader;
import com.sabre.sws.tools.wsdl.springws.soap.Security;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.context.MessageContext;

import javax.xml.bind.JAXBException;

/**
 * Created by SG0221139 on 8/18/2014.
 *
 * This is an interceptor class for working with Spring Web Services framework.
 * It's responsibility is to ensure that processed message is a SessionCreateRQ response
 * message and inform SessionManager instance about open session and it's parameters.
 *
 */
public class SessionCreateInterceptor extends AbstractSessionInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( SessionCreateInterceptor.class );


    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {

        String token = null;
        String conversationId = null;

        try {
            Jaxb2Marshaller marshaller = getUnmarshaller();
            Security security = extractSecurityFromMessageContext(messageContext);
            MessageHeader header = extractMessageHeaderFromMessageContext(messageContext);

            if (!header.getAction().equalsIgnoreCase("SessionCreateRS")) {
                throw new UnsupportedOperationException("This interceptors works with SessionCreateRQ only");
            }
            token = security.getBinarySecurityToken();
            conversationId = header.getConversationId();

        } catch (JAXBException | NullPointerException e) {
            LOGGER.fatal( "Error occurred during retrieving session token", e );
        }

        LOGGER.info( "Creating session..." );

        if( token == null | conversationId == null ) {
            throw new WebServiceClientException( "Couldn't retrieve session token from message" ) {
            };
        }

        logTokenAndConversationIdFromMessage(token, conversationId);

        SessionManager.getInstance().startSession( token );
        SessionManager.getInstance().setConversationID( conversationId );

        return true;
    }
}
