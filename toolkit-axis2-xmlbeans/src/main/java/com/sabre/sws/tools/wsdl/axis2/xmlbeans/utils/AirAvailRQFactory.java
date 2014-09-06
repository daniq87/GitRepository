package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.webservices.sabrexml._2011._10.OTAAirAvailRQDocument;

/**
 * Created by SG0221139 on 9/6/2014.
 */
public class AirAvailRQFactory {

    private AirAvailRQFactory() {}
    private static final String serviceVersion = ServicesVersionsProvider.getOtaAirAvailVersion();

    public static OTAAirAvailRQDocument getOTAAirAvailRequest( IConfigurationProvider configuration, AirAvailRequests requestType ) {
        OTAAirAvailRQDocument instance = OTAAirAvailRQDocument.Factory.newInstance();
        OTAAirAvailRQDocument.OTAAirAvailRQ otaAirAvailRQ = instance.addNewOTAAirAvailRQ();

        otaAirAvailRQ.setVersion(serviceVersion);

        switch( requestType ) {

            case TWO_POINTS_WITH_DEPARTURE_DATE:
                getTwoPointWithDepartureDateRequest( otaAirAvailRQ );
                break;

            case TWO_POINTS_WITH_DEPARTURE_HOUR:
                getTwoPointsWithDepartureHourRequest( otaAirAvailRQ );
                break;

            case TWO_POINTS_WITH_VENDOR_PREFS:
                getTwoPointsWithVendorPrefsRequest( otaAirAvailRQ );
                break;

            case MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS:
                getMultilegFlightSegmentWithVendorPrefsRequest( otaAirAvailRQ );
                break;
        }

        return instance;
    }

    private static void getTwoPointWithDepartureDateRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

    }

    private static void getTwoPointsWithDepartureHourRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

    }

    private static void getTwoPointsWithVendorPrefsRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

    }

    private static void getMultilegFlightSegmentWithVendorPrefsRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

    }

}
