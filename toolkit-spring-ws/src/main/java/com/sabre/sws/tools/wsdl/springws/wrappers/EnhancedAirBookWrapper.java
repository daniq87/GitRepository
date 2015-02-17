package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.enhancedairbook.EnhancedAirBookRQ;
import com.sabre.sws.tools.wsdl.springws.enhancedairbook.EnhancedAirBookRS;
import com.sabre.sws.tools.wsdl.springws.interceptors.FaultInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
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

    public EnhancedAirBookWrapper() {
        super();
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
        requestBody.setHaltOnError( false );
        requestBody.setVersion( ServicesVersionsProvider.getEnhancedAirBookVersion() );

        requestBody.setOTAAirBookRQ( getOTAAirBookRQ() );
        requestBody.setOTAAirPriceRQ( getOTAAirPriceRQ() );
        requestBody.setPostProcessing( getPostProcessing() );

        return requestBody;
    }

    private EnhancedAirBookRQ.OTAAirBookRQ getOTAAirBookRQ() {

        EnhancedAirBookRQ.OTAAirBookRQ airBookRQ = new EnhancedAirBookRQ.OTAAirBookRQ();

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
