package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;


import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

import static com.sabre.sws.tools.wsdl.stubs.EnhancedAirBookServiceStub.*;

/**
 * Created by SG0221139 on 7/21/2014.
 */
public class EnhancedAirBookHelper {

    private final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );
    private final static String actionString = "EnhancedAirBookRQ";
    private final static String versionString = "2.2.1";

    private String getTimestamp() {

        java.util.Date now = new java.util.Date();
        DateFormatSymbols symbols = DateFormatSymbols.getInstance( new Locale( "PL" ));
        SimpleDateFormat formatter = new SimpleDateFormat( timestampFormat, symbols );
        return formatter.format( now );
    }

    private String longRandomHexString() {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for( int i = 0; i < 3; ++i ) {
            buffer.append( Integer.toHexString(random.nextInt(10000000)) );
        }
        return buffer.toString();
    }


    public NonEmptyString toNonEmptyString( String param ) {

        NonEmptyString instance = new NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    public Security1 getSecurityInstance( IConfigurationProvider configuration ) {

        Security1 instance = new Security1();

        instance.setBinarySecurityToken( SessionManager.getInstance().getToken() );
        return instance;
    }

    public MessageHeader getMessageHeaderInstance( IConfigurationProvider configuration ) {

        MessageHeader instance = new MessageHeader();

        instance.setVersion( toNonEmptyString( "2.5.0" ) );     // TODO: This should be stored somewhere else

        // Instantiate and set FROM element
        From_type0 from = new From_type0();
        PartyId_type0 partyId_type0 = new PartyId_type0();
        partyId_type0.setString( "SomeString" );    // TODO: Set this value properly
        from.addPartyId( partyId_type0 );

        instance.setFrom( from );

        // Instantiate and set TO element
        To to = new To();
        To_type0 to_type0 = new To_type0();
        PartyId_type0 toParty = new PartyId_type0();
        toParty.setString( "yetAnother" );          // TODO: Set this value properly
        to_type0.addPartyId( partyId_type0 );

        instance.setTo( to_type0 );

        // Set CPA_ID element
        instance.setCPAId( toNonEmptyString( configuration.getOrganization() ) );

        // Generate and set CONVERSATION_ID element
        StringBuffer buffer = new StringBuffer( getTimestamp() );
        buffer.append( "-" );
        buffer.append( longRandomHexString() );
        String conversationID = buffer.toString();

//        instance.setConversationId( toNonEmptyString( conversationID ) );
        instance.setConversationId( toNonEmptyString( "conv-ID" ) );

        // Set SERVICE element
        Service_type2 service_type2 = new Service_type2();
        service_type2.setString( actionString );
        service_type2.setType( toNonEmptyString( "Dummy?" ) );  // TODO: Self-explaining

        instance.setService( service_type2 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = longRandomHexString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        Timestamp timestamp = new Timestamp();
        timestamp.setTimestamp( getTimestamp() );
        messageData.setTimestamp( getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ) );

        instance.setMessageData( messageData );
        return instance;

    }

    public EnhancedAirBookRQ getRequestBody( IConfigurationProvider configuration ) {

        EnhancedAirBookRQ instance = new EnhancedAirBookRQ();

        instance.setVersion( "2.5.0" ); // TODO

        // Create and populate OTA_AirBookRQ
        OTA_AirBookRQ_type0 airBookRQ = new OTA_AirBookRQ_type0();
        OriginDestinationInformation_type0 originDestInfo = new OriginDestinationInformation_type0();
        FlightSegment_type1 flightSegment = new FlightSegment_type1();

        airBookRQ.setHaltOnError( false );

        DestinationLocation_type0 destLocation = new DestinationLocation_type0();
        Equipment_type1 equipment = new Equipment_type1();
        MarketingAirline_type1 marketingAirline = new MarketingAirline_type1();
        OperatingAirline_type1 operatingAirline = new OperatingAirline_type1();
        OriginLocation_type0 originLocation = new OriginLocation_type0();

        destLocation.setLocationCode( "FRA" );
        equipment.setAirEquipType( "343" );
        marketingAirline.setCode( "UA" );
        marketingAirline.setFlightNumber( "8865" );
        operatingAirline.setCode( "LH" );
        originLocation.setLocationCode( "DFW" );

        flightSegment.setDestinationLocation( destLocation );
        flightSegment.setEquipment( equipment );
        flightSegment.setMarketingAirline( marketingAirline );
        flightSegment.setOperatingAirline( operatingAirline );
        flightSegment.setOriginLocation( originLocation );

        flightSegment.setFlightNumber( "8865" );
//        flightSegment.setArrivalDateTime( "12-22T11:45" );
        flightSegment.setDepartureDateTime( new DateTime() {{ setDateTime( "2014-12-21T16:10" ); }} ); // does not work without specifying a year
        flightSegment.setNumberInParty( "1" );
        flightSegment.setStatus( "GK" );
        flightSegment.setResBookDesigCode( "Y" );

        originDestInfo.addFlightSegment( flightSegment );
        airBookRQ.setOriginDestinationInformation( originDestInfo );
        instance.setOTA_AirBookRQ( airBookRQ );


        //  Create and populate OTA_AirPriceRQ

        OTA_AirPriceRQ_type0 airPriceRQ = new OTA_AirPriceRQ_type0();
        airPriceRQ.setHaltOnError( true );

        PriceRequestInformation_type0 priceRequestInfo = new PriceRequestInformation_type0();
        priceRequestInfo.setRetain( true );
        OptionalQualifiers_type0 optionalQualifiers = new OptionalQualifiers_type0();
        PricingQualifiers_type0 pricingQualifiers = new PricingQualifiers_type0();

        PassengerType_type1 passenger1 = new PassengerType_type1();
        PassengerType_type1 passenger2 = new PassengerType_type1();

        passenger1.setCode( "ADT" );
        passenger2.setCode( "ADR" );

        passenger1.setQuantity( "1" );
        passenger2.setQuantity( "1" );

        pricingQualifiers.addPassengerType( passenger1 );
//        pricingQualifiers.addPassengerType( passenger2 );

        optionalQualifiers.setPricingQualifiers( pricingQualifiers );
        priceRequestInfo.setOptionalQualifiers(optionalQualifiers);
        airPriceRQ.setPriceRequestInformation( priceRequestInfo );
        instance.setOTA_AirPriceRQ( airPriceRQ );

        // Redisplay reservation
        PostProcessing_type0 postProcessing = new PostProcessing_type0();
        RedisplayReservation_type1 redisplay = new RedisplayReservation_type1();
        redisplay.setWaitInterval(  new BigInteger( "4000" ) );
        postProcessing.setRedisplayReservation( redisplay );

        // Populate remaining fields to avoid NullPointerExceptions

        return instance;
    }

}