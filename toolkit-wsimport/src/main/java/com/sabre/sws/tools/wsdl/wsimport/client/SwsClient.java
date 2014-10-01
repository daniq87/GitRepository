package com.sabre.sws.tools.wsdl.wsimport.client;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.wsimport.wrappers.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SG0221139 on 8/22/2014.
 *
 * This is sample Sabre Web Services client application, provided for Sabre Clients as an example
 * on how to consume Sabre Web Services using wsimport.
 *
 * SwsClient's class main() method is an entry point of this application.
 * It subsequently calls methods to make 6 Sabre Web Services calls:
 *
 *  - SessionCreateRQ           (session management service)
 *  - OTA_AirAvailLLSRQ         (low level service)
 *  - TravelItineraryReadLLSRQ  (low level service)
 *  - EnhancedAirBookRQ         (orchestrated service)
 *  - PassengerDetailsRQ        (orchestrated service)
 *  - SessionCloseRQ            (session management service)
 *
 * For each service call a request body is constructed, proper SOAP headers are set (using callback class)
 * and a response body is retrieved.
 *
 * One may use this template to make own Sabre Web Services calls and process their result
 * to implement any business logic that is needed.
 */

public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );

    public static void main( String ... args ) {

        addCloseSessionOnExitShutdownHook();

        LOGGER.info( "Starting client action..." );
        try {
            openSession();
            invokeServicesRequests();
        } catch ( Exception e ) {
            LOGGER.error(e);
        } finally {
            closeSessionIfActive();
        }
    }

    private static void closeSessionIfActive() {
        if( SessionManager.getInstance().isSessionActive() ) {
            closeSession();
        }
    }

    private static void invokeServicesRequests() {
        invokeAirAvailRequests();
        invokeTravelItineraryRequest();
        invokeEnhancedAirBookRequest();
        invokePassengerDetailsRequest();
    }

    private static void addCloseSessionOnExitShutdownHook() {
        Runtime.getRuntime().addShutdownHook( new Thread( new Runnable() {
            @Override
            public void run() {
                closeSessionIfActive();
            }
        }));
    }

    private static void openSession() { new SessionCreateWrapper().openSession(); }

    private static void closeSession() {
        new SessionCloseWrapper().closeSession();
    }

    private static void invokeAirAvailRequests() {

        AirAvailWrapper airAvailWrapper = new AirAvailWrapper();

        for( AirAvailRequests requestType : AirAvailRequests.values() ) {
            airAvailWrapper.executeSampleRequest( requestType );
        }
    }

    private static void invokeTravelItineraryRequest() {
        new TravelItineraryWrapper().executeSampleRequest();
    }

    private static void invokeEnhancedAirBookRequest() {
        new EnhancedAirBookWrapper().executeSampleRequest();
    }

    private static void invokePassengerDetailsRequest() {
        new PassengerDetailsWrapper().executeSampleRequest();
    }

}
