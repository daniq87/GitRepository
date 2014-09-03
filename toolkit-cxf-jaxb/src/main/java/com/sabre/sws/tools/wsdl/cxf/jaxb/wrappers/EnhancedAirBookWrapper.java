package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.SWSOResponseInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SecurityFactory;
import com.sabre.webservices.sabrexml._2011._10.EnhancedAirBookRQ;
import com.sabre.webservices.sabrexml._2011._10.EnhancedAirBookRS;
import https.webservices_sabre_com.websvc.EnhancedAirBookPortType;
import https.webservices_sabre_com.websvc.EnhancedAirBookService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.math.BigInteger;

/**
 * Created by SG0221139 on 8/8/2014.
 */
public class EnhancedAirBookWrapper {

    private static final String actionString = "EnhancedAirBookRQ";

    public EnhancedAirBookRS executeSampleRequest() {

        IConfigurationProvider configuration = Util.getConfigurationProvider();

        Security security = SecurityFactory.getSecurity( configuration, false );
        MessageHeader header = MessageHeaderFactory.getMessageHeader( configuration, actionString );
        EnhancedAirBookRQ requestBody = getRequestBody();

        EnhancedAirBookPortType port = getConfiguredPort();

        EnhancedAirBookRS responseBody = port.enhancedAirBookRQ( new Holder<>(header), new Holder<>(security), requestBody );

        return responseBody;
    }

    private EnhancedAirBookPortType getConfiguredPort() {

        EnhancedAirBookService service = new EnhancedAirBookService();
        EnhancedAirBookPortType port = service.getEnhancedAirBookPortType();

        setEndpointFromConfiguration( port );
        addInterceptors( port );

        return port;
    }

    private void setEndpointFromConfiguration( EnhancedAirBookPortType port ) {

        String endpointURL = Util.getConfigurationProvider().getEndpoint();

        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL );
    }

    private void addInterceptors( EnhancedAirBookPortType port ) {

        Client client = ClientProxy.getClient( port );
        Endpoint endpoint = client.getEndpoint();

        endpoint.getOutInterceptors().add( new LoggingOutInterceptor() );

        endpoint.getInInterceptors().add( new LoggingInInterceptor() );
        endpoint.getInInterceptors().add( new SWSOResponseInterceptor() );
    }

    private EnhancedAirBookRQ getRequestBody() {

        EnhancedAirBookRQ requestBody = new EnhancedAirBookRQ();
        requestBody.setVersion( ServicesVersionsProvider.getEnhancedAirBookVersion() );

        requestBody.setOTAAirBookRQ( getOTAAirBookRQ() );
        requestBody.setOTAAirPriceRQ( getOTAAirPriceRQ() );
        requestBody.setPostProcessing( getPostProcessing() );

        return requestBody;
    }

    private EnhancedAirBookRQ.OTAAirBookRQ getOTAAirBookRQ() {

        EnhancedAirBookRQ.OTAAirBookRQ airBookRQ = new EnhancedAirBookRQ.OTAAirBookRQ();
        airBookRQ.setHaltOnError( false );

        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation originDestinationInformation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
        originDestinationInformation.getFlightSegment().add( getFlightSegment() );
        airBookRQ.setOriginDestinationInformation( originDestinationInformation );

        return airBookRQ;
    }

    private EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment getFlightSegment() {

        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment flightSegment = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment();

        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment equipment = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.Equipment();
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirline = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline operatingAirline = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OperatingAirline();
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment.OriginLocation();

        destinationLocation.setLocationCode( "FRA" );
        equipment.setAirEquipType( "343" );
        marketingAirline.setCode( "UA" );
        marketingAirline.setFlightNumber( "8865" );
        operatingAirline.setCode( "LH" );
        originLocation.setLocationCode( "DFW" );

        flightSegment.setDestinationLocation( destinationLocation );
        flightSegment.setEquipment(equipment);
        flightSegment.setOperatingAirline(operatingAirline);
        flightSegment.setMarketingAirline( marketingAirline );
        flightSegment.setOriginLocation( originLocation );

        flightSegment.setFlightNumber( "8865" );
        flightSegment.setDepartureDateTime("2014-12-21T16:10");
        flightSegment.setNumberInParty("1");
        flightSegment.setStatus("GK");
        flightSegment.setResBookDesigCode("Y");

        return flightSegment;
    }

    private EnhancedAirBookRQ.OTAAirPriceRQ getOTAAirPriceRQ() {

        EnhancedAirBookRQ.OTAAirPriceRQ airPriceRQ = new EnhancedAirBookRQ.OTAAirPriceRQ();
        airPriceRQ.setHaltOnError( true );

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation priceRequestInformation = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation();
        priceRequestInformation.setRetain( true );

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType passengerType = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();

        passengerType.setCode("ADT");
        passengerType.setQuantity("1");
        pricingQualifiers.getPassengerType().add( passengerType );

        optionalQualifiers.setPricingQualifiers( pricingQualifiers );
        priceRequestInformation.setOptionalQualifiers( optionalQualifiers );
        airPriceRQ.setPriceRequestInformation( priceRequestInformation );

        return airPriceRQ;
    }

    private EnhancedAirBookRQ.PostProcessing getPostProcessing() {

        EnhancedAirBookRQ.PostProcessing postProcessing = new EnhancedAirBookRQ.PostProcessing();
        EnhancedAirBookRQ.PostProcessing.RedisplayReservation redisplayReservation = new EnhancedAirBookRQ.PostProcessing.RedisplayReservation();

        redisplayReservation.setWaitInterval( new BigInteger( "2000" ) );
        postProcessing.setRedisplayReservation( redisplayReservation );

        return postProcessing;
    }

}
