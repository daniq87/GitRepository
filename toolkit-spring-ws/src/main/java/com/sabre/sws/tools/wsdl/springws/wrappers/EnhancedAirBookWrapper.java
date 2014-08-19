package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.enhancedairbook.EnhancedAirBookRQ;
import com.sabre.sws.tools.wsdl.springws.enhancedairbook.EnhancedAirBookRS;
import com.sabre.sws.tools.wsdl.springws.interceptors.FaultInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/19/2014.
 */
public class EnhancedAirBookWrapper extends WebServiceGatewaySupport {

    private static final String serviceAction = "EnhancedAirBookRQ";
    private static final String serviceVersion = ServicesVersionsProvider.getEnhancedAirBookVersion();

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    public EnhancedAirBookWrapper( Jaxb2Marshaller marshaller ) {
        super();
        marshaller.setContextPath( "com.sabre.sws.tools.wsdl.springws.enhancedairbook" );
        this.setMarshaller( marshaller );
        addInterceptors();
    }

    private void addInterceptors() {
        interceptors.add( new LoggingInterceptor() );
        interceptors.add( new FaultInterceptor() );

        this.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    public EnhancedAirBookRS executeSampleRequest() {

        return (EnhancedAirBookRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody(),
                new HeaderComposingCallback(serviceAction)
        );

    }

    private EnhancedAirBookRQ getRequestBody() {

        EnhancedAirBookRQ requestBody = new EnhancedAirBookRQ();
        requestBody.setVersion( ServicesVersionsProvider.getEnhancedAirBookVersion() );

        // Populate and set OTAAirBookRQ
        EnhancedAirBookRQ.OTAAirBookRQ airBookRQ = new EnhancedAirBookRQ.OTAAirBookRQ();

        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation originDestinationInformation = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation();
        EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment flightSegment = new EnhancedAirBookRQ.OTAAirBookRQ.OriginDestinationInformation.FlightSegment();

        airBookRQ.setHaltOnError( false );
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

        originDestinationInformation.getFlightSegment().add( flightSegment );
        airBookRQ.setOriginDestinationInformation( originDestinationInformation );

        requestBody.setOTAAirBookRQ( airBookRQ );


        // Populate and set OTAAirPrice
        EnhancedAirBookRQ.OTAAirPriceRQ airPriceRQ = new EnhancedAirBookRQ.OTAAirPriceRQ();

        airPriceRQ.setHaltOnError( true );

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation priceRequestInformation = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation();
        priceRequestInformation.setRetain( true );

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers optionalQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers();
        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers pricingQualifiers = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers();

        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType passengerType1 = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();
        EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType passengerType2 = new EnhancedAirBookRQ.OTAAirPriceRQ.PriceRequestInformation.OptionalQualifiers.PricingQualifiers.PassengerType();

        passengerType1.setCode( "ADT" );
        passengerType2.setCode( "ADR" );

        passengerType1.setQuantity( "1" );
        passengerType2.setQuantity( "1" );

        pricingQualifiers.getPassengerType().add( passengerType1 );
//        pricingQualifiers.getPassengerType().add( passengerType2 );

        optionalQualifiers.setPricingQualifiers( pricingQualifiers );
        priceRequestInformation.setOptionalQualifiers( optionalQualifiers );
        airPriceRQ.setPriceRequestInformation( priceRequestInformation );

        requestBody.setOTAAirPriceRQ( airPriceRQ );

        EnhancedAirBookRQ.PostProcessing postProcessing = new EnhancedAirBookRQ.PostProcessing();
        EnhancedAirBookRQ.PostProcessing.RedisplayReservation redisplayReservation = new EnhancedAirBookRQ.PostProcessing.RedisplayReservation();

        redisplayReservation.setWaitInterval( new BigInteger( "2000" ) );
        postProcessing.setRedisplayReservation( redisplayReservation );

        requestBody.setPostProcessing( postProcessing );

        return requestBody;

    }

}
