package com.sabre.sws.tools.wsdl.wsimport.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.wsimport.handlers.LoggingHandler;
import com.sabre.sws.tools.wsdl.wsimport.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.wsimport.utils.SecurityFactory;
import com.sabre.webservices.sabrexml._2011._10.OTAAirAvailRQ;
import com.sabre.webservices.sabrexml._2011._10.OTAAirAvailRS;
import https.webservices_sabre_com.websvc.OTAAirAvailPortType;
import https.webservices_sabre_com.websvc.OTAAirAvailService;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 9/2/2014.
 */
public class AirAvailWrapper {

    private static final String serviceAction = "OTA_AirAvailLLSRQ";
    private static final String serviceVersion = ServicesVersionsProvider.getOtaAirAvailVersion();

    public OTAAirAvailRS executeSampleRequest( AirAvailRequests requestType ) {

        Security security = SecurityFactory.getTokenSecurity();
        MessageHeader header = MessageHeaderFactory.getMessageHeader(serviceAction);
        OTAAirAvailRQ requestBody = getRequestBody( requestType );

        OTAAirAvailPortType port = getConfiguredPort();

        Holder<MessageHeader> headerHolder = new Holder<>(header);
        Holder<Security> securityHolder = new Holder<>(security);

        return port.otaAirAvailRQ(headerHolder, securityHolder, requestBody );
    }

    private OTAAirAvailRQ getRequestBody( AirAvailRequests requestType ) {

        OTAAirAvailRQ requestBody = null;

        switch( requestType ) {
            case TWO_POINTS_WITH_DEPARTURE_DATE:
                requestBody = getRequestBodyWithTwoPointsAndDepartureDate();
                break;
            case TWO_POINTS_WITH_DEPARTURE_HOUR:
                requestBody = getRequestBodyWithTwoPointsAndDepartureHour();
                break;
            case TWO_POINTS_WITH_VENDOR_PREFS:
                requestBody = getRequestBodyWithTwoPointsAndVendorPrefs();
                break;
            case MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS:
                requestBody = getRequestBodyWithMultilegFlightSegmentAndVendorPrefs();
                break;
        }

        return requestBody;

    }

    private OTAAirAvailRQ getRequestBodyWithTwoPointsAndDepartureDate() {

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

    private OTAAirAvailRQ getRequestBodyWithTwoPointsAndDepartureHour() {

        OTAAirAvailRQ requestBody = new OTAAirAvailRQ();
        requestBody.setVersion( serviceVersion );

        OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment flightSegment = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.OriginLocation();

        flightSegment.setDepartureDateTime("12-21T18:00");
        destinationLocation.setLocationCode( "FRA" );
        originLocation.setLocationCode("DFW");

        flightSegment.setOriginLocation( originLocation );
        flightSegment.setDestinationLocation( destinationLocation );

        originDestinationInformation.setFlightSegment( flightSegment );

        requestBody.setOriginDestinationInformation( originDestinationInformation );

        return requestBody;
    }

    private OTAAirAvailRQ getRequestBodyWithTwoPointsAndVendorPrefs() {

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
        originDestinationInformation.setFlightSegment(flightSegment);
        requestBody.setOriginDestinationInformation( originDestinationInformation );

        return requestBody;
    }

    private OTAAirAvailRQ getRequestBodyWithMultilegFlightSegmentAndVendorPrefs() {

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

    private OTAAirAvailPortType getConfiguredPort() {

        OTAAirAvailService service = new OTAAirAvailService();
        OTAAirAvailPortType port = service.getOTAAirAvailPortType();

        setEndpointFromConfiguration( port );
        addHandlers(port);

        return port;
    }

    private void setEndpointFromConfiguration( OTAAirAvailPortType port ) {

        String endpointURL = Util.getConfigurationProvider().getEndpoint();

        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
    }

    private void addHandlers(OTAAirAvailPortType port) {

        List<Handler> handlers = ((BindingProvider)port).getBinding().getHandlerChain();

        if( handlers == null ) {
            handlers = new ArrayList<>();
        }

        handlers.add( new LoggingHandler() );

        ((BindingProvider)port).getBinding().setHandlerChain( handlers );
    }

}
