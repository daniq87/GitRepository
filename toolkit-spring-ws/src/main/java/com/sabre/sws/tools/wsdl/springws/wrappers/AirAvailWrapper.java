package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.springws.airavail.OTAAirAvailRQ;
import com.sabre.sws.tools.wsdl.springws.airavail.OTAAirAvailRS;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.interceptors.FaultInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class AirAvailWrapper extends WebServiceGatewaySupport {

    private static final String serviceAction = "OTA_AirAvailLLSRQ";
    private static final String serviceVersion = ServicesVersionsProvider.getOtaAirAvailVersion();

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    private void addInterceptors() {
        interceptors.add( new FaultInterceptor() );
        interceptors.add( new LoggingInterceptor() );
        super.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    public OTAAirAvailRS executeSampleRequest( int requestIndex ) {

        addInterceptors();

        return (OTAAirAvailRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody( requestIndex ),
                new HeaderComposingCallback( serviceAction )
        );
    }

    private OTAAirAvailRQ getRequestBody( int requestIndex ) {

        if( requestIndex > 3 || requestIndex < 0 ) {
            throw new IllegalArgumentException( "Invalid request index" );
        }

        OTAAirAvailRQ requestBody = null;

        switch( requestIndex ) {
            case 0:
                requestBody = getRequestBody0();
                break;
            case 1:
                requestBody = getRequestBody1();
                break;
            case 2:
                requestBody = getRequestBody2();
                break;
            case 3:
                requestBody = getRequestBody3();
                break;
        }

        return requestBody;

    }

    private OTAAirAvailRQ getRequestBody0() {

        OTAAirAvailRQ requestBody = new OTAAirAvailRQ();
        requestBody.setVersion( serviceVersion );

        OTAAirAvailRQ.OriginDestinationInformation destInfo = new OTAAirAvailRQ.OriginDestinationInformation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();

        destinationLocation.setLocationCode( "FRA" );
        originLocation.setLocationCode( "DFW" );

        flightSegment.setDepartureDateTime( "12-21" );
        flightSegment.setOriginLocation(originLocation);
        flightSegment.setDestinationLocation( destinationLocation );

        destInfo.setFlightSegment( flightSegment );
        requestBody.setOriginDestinationInformation( destInfo );

        return requestBody;
    }

    private OTAAirAvailRQ getRequestBody1() {
        OTAAirAvailRQ requestBody = new OTAAirAvailRQ();
        requestBody.setVersion( serviceVersion );

        OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();

        flightSegment.setDepartureDateTime( "12-21T18:00" );
        destinationLocation.setLocationCode( "FRA" );
        originLocation.setLocationCode("DFW");

        flightSegment.setOriginLocation( originLocation );
        flightSegment.setDestinationLocation( destinationLocation );

        originDestinationInformation.setFlightSegment( flightSegment );

        requestBody.setOriginDestinationInformation( originDestinationInformation );

        return requestBody;
    }

    private OTAAirAvailRQ getRequestBody2() {
        OTAAirAvailRQ requestBody = new OTAAirAvailRQ();
        requestBody.setVersion( serviceVersion );

        OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
        OTAAirAvailRQ.OptionalQualifiers optionalQualifiers = new OTAAirAvailRQ.OptionalQualifiers();
        OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers flightQualifiers = new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers();

        OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs vendorPrefs = new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs();
        OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline airline = new OTAAirAvailRQ.OptionalQualifiers.FlightQualifiers.VendorPrefs.Airline();

        airline.setCode("AA");
        vendorPrefs.getAirline().add(airline);
        flightQualifiers.setVendorPrefs(vendorPrefs);
        flightSegment.setDepartureDateTime("12-21");
        optionalQualifiers.setFlightQualifiers(flightQualifiers);
        requestBody.setOptionalQualifiers(optionalQualifiers);
        originLocation.setLocationCode( "LHR" );
        destinationLocation.setLocationCode( "DFW" );
        flightSegment.setDestinationLocation( destinationLocation );
        flightSegment.setOriginLocation( originLocation );
        originDestinationInformation.setFlightSegment( flightSegment );

        return requestBody;
    }

    private OTAAirAvailRQ getRequestBody3() {
        OTAAirAvailRQ requestBody = new OTAAirAvailRQ();
        requestBody.setVersion( serviceVersion );

        OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations connectionLocations = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation connectionLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.ConnectionLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay carrierSpecificDisplay = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay();

        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne legOne = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs vendorPrefsLegOne = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline airlineAALegOne = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline airlineBALegOne = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegOne.VendorPrefs.Airline();

        airlineAALegOne.setCode("AA");
        airlineBALegOne.setCode("BA");
        vendorPrefsLegOne.getAirline().add(airlineAALegOne);
        vendorPrefsLegOne.getAirline().add( airlineBALegOne );
        vendorPrefsLegOne.setExcludeCodeshares(true);
        legOne.setVendorPrefs( vendorPrefsLegOne );

        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo legTwo = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs vendorPrefsLegTwo = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline airlineAALegTwo = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline airlineBALegTwo = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.ConnectionLocations.CarrierSpecificDisplay.LegTwo.VendorPrefs.Airline();

        airlineAALegTwo.setCode( "AA" );
        airlineBALegTwo.setCode( "BA" );
        vendorPrefsLegTwo.getAirline().add(airlineAALegTwo);
        vendorPrefsLegTwo.getAirline().add( airlineBALegTwo );
        vendorPrefsLegTwo.setExcludeCodeshares( true );
        legTwo.setVendorPrefs( vendorPrefsLegTwo );

        carrierSpecificDisplay.setLegOne( legOne );
        carrierSpecificDisplay.setLegTwo(legTwo);
        connectionLocations.setCarrierSpecificDisplay( carrierSpecificDisplay );
        connectionLocation.setLocationCode( "LAX" );
        connectionLocations.getConnectionLocation().add( connectionLocation );
        flightSegment.setConnectionLocations( connectionLocations );
        flightSegment.setDepartureDateTime( "12-21T18:00" );

        destinationLocation.setLocationCode( "SYD" );
        originLocation.setLocationCode( "DFW" );
        flightSegment.setDestinationLocation( destinationLocation );
        flightSegment.setOriginLocation( originLocation );
        originDestinationInformation.setFlightSegment( flightSegment );
        requestBody.setOriginDestinationInformation( originDestinationInformation );

        return requestBody;
    }

}
