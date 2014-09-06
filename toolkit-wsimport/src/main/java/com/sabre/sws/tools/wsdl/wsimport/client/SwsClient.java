package com.sabre.sws.tools.wsdl.wsimport.client;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.wsimport.wrappers.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );

    public static void main( String ... args ) {

        LOGGER.error( "Starting client action..." );
        try {
            new SessionCreateWrapper().openSession();

            invokeAirAvailRequests();
            invokeTravelItineraryRequest();
            invokeEnhancedAirBookRequest();
            invokePassengerDetailsRequest();

        } catch ( Exception e ) {
            LOGGER.error( e );
        } finally {
            if( SessionManager.getInstance().isSessionActive() ) {
                new SessionCloseWrapper().closeSession();
            }
        }
    }

    private static void invokeAirAvailRequests() {

        AirAvailWrapper airAvailWrapper = new AirAvailWrapper();

        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_DATE);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_HOUR);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_VENDOR_PREFS);
        airAvailWrapper.executeSampleRequest( AirAvailRequests.MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS );

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
