package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionManager {

    private static final Logger LOGGER = LogManager.getLogger( SessionManager.class.getName() );

    private static final SessionManager soleInstance = new SessionManager();

    private boolean sessionIsActive = false;
    private String sessionToken;

    private String conversationID;

    private SessionManager() {}

    public static SessionManager getInstance() {
        return soleInstance;
    }

    public boolean isSessionActive() {
        return sessionIsActive;
    }

    public void startSession( String token ) {

        this.sessionIsActive = true;
        this.sessionToken = token;
    }

    public void endSession() {
        this.sessionIsActive = false;
        this.sessionToken = null;
        this.conversationID = null;
    }

    public String getToken() {
        return this.sessionToken;
    }

    public String getConversationID() {
        if( ! sessionIsActive ) {
            LOGGER.error( "There is no active session" );
            throw new RuntimeException( "Cannot get conversation ID while there is no session" );
        }
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }
}
