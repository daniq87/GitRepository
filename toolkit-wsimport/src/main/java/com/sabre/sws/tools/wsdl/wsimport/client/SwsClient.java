package com.sabre.sws.tools.wsdl.wsimport.client;

import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.wsimport.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.wsimport.wrappers.SessionCreateWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );

    public static void main( String ... args ) {

        try {
            new SessionCreateWrapper().openSession();
        } catch ( Exception e ) {
            LOGGER.error( e );
        } finally {
            if( SessionManager.getInstance().isSessionActive() ) {
                new SessionCloseWrapper().closeSession();
            }
        }
    }

}
