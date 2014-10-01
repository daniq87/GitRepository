package com.sabre.sws.tools.wsdl.springws.client;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.springws.configuration.BeansConfiguration;
import com.sabre.sws.tools.wsdl.springws.wrappers.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by SG0221139 on 8/13/2014.
 *
 * This is sample Sabre Web Services client application, provided for Sabre Clients as an example
 * on how to consume Sabre Web Services using Spring Web Services framework and JAXB data binding.
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
 *
 */
public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );
    private static ApplicationContext context;

    public static void main( String ... args ) {

        addCloseSessionOnExitShutdownHook();

        context = SpringApplication.run(BeansConfiguration.class, args);

        openSession();

        try {

            executeAirAvailRequests();
            executeTravelItineraryRequest();
            executeEnhancedAirBookRequest();
            executePassengerDetailsRequest();

        } catch ( Exception e ) {
            LOGGER.error( "Error executing request", e );
        } finally {
            if(SessionManager.getInstance().isSessionActive()) {
                closeSession();
            }
        }

    }

    private static void addCloseSessionOnExitShutdownHook() {
        Runtime.getRuntime().addShutdownHook( new Thread( new Runnable() {
            @Override
            public void run() {
                if( SessionManager.getInstance().isSessionActive() ) {
                    closeSession();
                }
            }
        }));
    }

    private static void openSession() {
        SessionCreateWrapper sessionCreateWrapper = context.getBean( SessionCreateWrapper.class );
        sessionCreateWrapper.openSession();
    }

    private static void closeSession() {
        SessionCloseWrapper sessionCloseWrapper = context.getBean( SessionCloseWrapper.class );
        sessionCloseWrapper.closeSession();
    }

    private static void executeAirAvailRequests() {
        AirAvailWrapper airAvailWrapper = context.getBean( AirAvailWrapper.class );

        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_VENDOR_PREFS);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_HOUR);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_DATE);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS );
    }

    private static void executeTravelItineraryRequest() {

        TravelItineraryReadWrapper wrapper = context.getBean( TravelItineraryReadWrapper.class );
        wrapper.executeSampleRequest();
    }

    private static void executeEnhancedAirBookRequest() {

        EnhancedAirBookWrapper wrapper = context.getBean( EnhancedAirBookWrapper.class );
        wrapper.executeSampleRequest();
    }

    private static void executePassengerDetailsRequest() {

        PassengerDetailsWrapper wrapper = context.getBean( PassengerDetailsWrapper.class );
        wrapper.executeSampleRequest();
    }

}
