package com.sabre.sws.tools.wsdl.cxf.jaxb.client;

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

        airAvailWrapper.executeSampleRequest( 0 );
        airAvailWrapper.executeSampleRequest( 1 );
        airAvailWrapper.executeSampleRequest( 2 );
        airAvailWrapper.executeSampleRequest( 3 );

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
