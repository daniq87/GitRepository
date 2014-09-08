package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.webservices.sabrexml._2011._10.OTAAirAvailRQDocument;

/**
 * Created by SG0221139 on 9/6/2014.
 *
 * This class provides a method, that produces four distinct request bodies for OTA_AirAvailLLSRQ service.
 * For each of four possible parameter value (enum AirAvailRequests) a corresponding request object is return.
 *
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
                makeTwoPointWithDepartureDateRequest( otaAirAvailRQ );
                break;

            case TWO_POINTS_WITH_DEPARTURE_HOUR:
                makeTwoPointsWithDepartureHourRequest( otaAirAvailRQ );
                break;

            case TWO_POINTS_WITH_VENDOR_PREFS:
                makeTwoPointsWithVendorPrefsRequest( otaAirAvailRQ );
                break;

            case MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS:
                makeMultilegFlightSegmentWithVendorPrefsRequest( otaAirAvailRQ );
                break;
        }

        return instance;
    }

    private static void makeTwoPointWithDepartureDateRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = request.addNewOriginDestinationInformation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = originDestinationInformation.addNewFlightSegment();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = flightSegment.addNewDestinationLocation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = flightSegment.addNewOriginLocation();

        destinationLocation.setLocationCode( "FRA" );
        originLocation.setLocationCode( "DFW" );

        flightSegment.setDepartureDateTime("12-21");

        originDestinationInformation.setFlightSegment( flightSegment );
    }

    private static void makeTwoPointsWithDepartureHourRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = request.addNewOriginDestinationInformation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = originDestinationInformation.addNewFlightSegment();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = flightSegment.addNewDestinationLocation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = flightSegment.addNewOriginLocation();

        destinationLocation.setLocationCode( "FRA" );
        originLocation.setLocationCode( "DFW" );

        flightSegment.setDepartureDateTime( "12-21T18:00" );
    }

    private static void makeTwoPointsWithVendorPrefsRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = request.addNewOriginDestinationInformation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = originDestinationInformation.addNewFlightSegment();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = flightSegment.addNewDestinationLocation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = flightSegment.addNewOriginLocation();

        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers optionalQualifiers = request.addNewOptionalQualifiers();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers flightQualifiers = optionalQualifiers.addNewFlightQualifiers();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs vendorPrefs = flightQualifiers.addNewVendorPrefs();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline airline = vendorPrefs.addNewAirline();

        airline.setCode("AA");

        flightSegment.setDepartureDateTime("12-21");
        originLocation.setLocationCode("LHR");
        destinationLocation.setLocationCode("DFW");

    }

    private static void makeMultilegFlightSegmentWithVendorPrefsRequest( OTAAirAvailRQDocument.OTAAirAvailRQ request ) {

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = request.addNewOriginDestinationInformation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = originDestinationInformation.addNewFlightSegment();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = flightSegment.addNewDestinationLocation();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = flightSegment.addNewOriginLocation();

        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers optionalQualifiers = request.addNewOptionalQualifiers();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers flightQualifiers = optionalQualifiers.addNewFlightQualifiers();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs vendorPrefs = flightQualifiers.addNewVendorPrefs();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations connectionLocations = flightSegment.addNewConnectionLocations();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay carrierSpecificDisplay = connectionLocations.addNewCarrierSpecificDisplay();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation connectionLocation = connectionLocations.addNewConnectionLocation();

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne legOne = carrierSpecificDisplay.addNewLegOne();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs vendorPrefsLegOne = legOne.addNewVendorPrefs();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline airlineALegOne = vendorPrefs.addNewAirline();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline airlineBLegOne = vendorPrefs.addNewAirline();

        airlineALegOne.setCode("AA");
        airlineBLegOne.setCode("BA");

        vendorPrefsLegOne.setExcludeCodeshares( true );

        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo legTwo = carrierSpecificDisplay.addNewLegTwo();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs vendorPrefsLegTwo = legTwo.addNewVendorPrefs();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline airlineALegTwo = vendorPrefsLegTwo.addNewAirline();
        OTAAirAvailRQDocument.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline airlineBLegTwo = vendorPrefsLegTwo.addNewAirline();

        airlineALegTwo.setCode("AA");
        airlineBLegTwo.setCode("BA");
        vendorPrefsLegTwo.setExcludeCodeshares( true );

        connectionLocation.setLocationCode("LAX");
        flightSegment.setDepartureDateTime( "12-21T18:00" );

        destinationLocation.setLocationCode( "SYD" );
        originLocation.setLocationCode( "DFW" );

    }

}
