package com.sabre.sws.tools.wsdl.utils;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionManager {

    private static final SessionManager soleInstance = new SessionManager();
    private boolean sessionIsActive = false;
    private String sessionToken;

    private IConfigurationProvider configurationProvider;

    private SessionManager() {}

    public static SessionManager getInstance() {
        return soleInstance;
    }

    public boolean isSessionActive() {
        return sessionIsActive;
    }

    public void startSession( String token ) {
        this.sessionToken = token;
    }

    public void endSession() {
        this.sessionIsActive = false;
        this.sessionToken = null;
    }

    public String getToken() {
        return this.sessionToken;
    }

}
