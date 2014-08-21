package com.sabre.sws.tools.wsdl.cxf.jaxb.client;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers.*;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class SwsClient {

    public static void main( String ... args ) {

        openSession();

        invokeTravelItineraryRequest();
        invokeAirAvailRequests();
        invokeEnhancedAirBookRequest();
        invokePassengerDetailsRequest();

        closeSession();
    }

    private static void openSession() {
        new SessionCreateWrapper().openSession();
    }

    private static void closeSession() {
        new SessionCloseWrapper().closeSession();
    }

    private static void invokeAirAvailRequests() {

        AirAvailWrapper airAvailWrapper = new AirAvailWrapper();

        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_DEPARTURE_DATE );
        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_DEPARTURE_HOUR );
        airAvailWrapper.executeSampleRequest( AirAvailRequests.BETWEEN_TWO_POINTS_WITH_VENDOR_PREFS );
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
