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
 */
public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );
    private static ApplicationContext context;

    public static void main( String ... args ) {

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

        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_VENDOR_PREFS );
        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_DEPARTURE_HOUR );
        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_DEPARTURE_DATE );
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
