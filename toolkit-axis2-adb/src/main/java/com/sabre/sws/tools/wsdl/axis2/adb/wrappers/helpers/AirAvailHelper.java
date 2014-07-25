package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;


import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import static com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub.*;

/**
 * Created by SG0221139 on 7/14/2014.
 */
public class AirAvailHelper {

    private final static String actionString = "OTA_AirAvailLLSRQ";
    private final static String versionString = "2.0.0";

    private NonEmptyString toNonEmptyString( String param ) {
        NonEmptyString instance = new NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    public Security7 getSecuirityInstance( IConfigurationProvider configuration ) {
        Security7 instance = new Security7();
        instance.setBinarySecurityToken(SessionManager.getInstance().getToken());

        return instance;
    }

    public MessageHeader getMessageHeaderInstance( IConfigurationProvider configuration ) {
        MessageHeader instance = new MessageHeader();

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
        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );
        String conversationID = buffer.toString();

//        instance.setConversationId( toNonEmptyString( conversationID ) );
        instance.setConversationId( toNonEmptyString( "conv-ID" ) );

        // Set SERVICE element
        Service_type0 service_type0 = new Service_type0();
        service_type0.setString( actionString );

        instance.setService( service_type0 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = Util.longRandomHexString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        Timestamp timestamp = new Timestamp();
        timestamp.setTimestamp( Util.getTimestamp() );
        messageData.setTimestamp( Util.getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ) );

        instance.setMessageData( messageData );
        return instance;
    }

    public OTA_AirAvailRQ geEmptytAirAvailRQInstance( IConfigurationProvider configuration ) {

        OTA_AirAvailRQ instance = new OTA_AirAvailRQ();

        // Populate "OptionalQualifiers" field
        /*instance.setOptionalQualifiers( new OptionalQualifiers_type0() );
        instance.getOptionalQualifiers().setAdditionalAvailability(new AdditionalAvailability_type0());
        instance.getOptionalQualifiers().setFlightQualifiers(new FlightQualifiers_type0());
        instance.getOptionalQualifiers().getFlightQualifiers().setVendorPrefs(new VendorPrefs_type0());
        instance.getOptionalQualifiers().setTimeQualifiers(new TimeQualifiers_type0());
        instance.getOptionalQualifiers().getTimeQualifiers().setArrivalTime(new ArrivalTime_type0());
        instance.getOptionalQualifiers().getTimeQualifiers().getArrivalTime().setWindowAfter(new Time());
        instance.getOptionalQualifiers().getTimeQualifiers().getArrivalTime().setWindowBefore(new Time());
        instance.getOptionalQualifiers().getTimeQualifiers().setDepartureTime( new DepartureTime_type0() );
        instance.getOptionalQualifiers().getTimeQualifiers().getDepartureTime().setWindowAfter( new Time() {{ setTime( new String() ); }} );
        instance.getOptionalQualifiers().getTimeQualifiers().getDepartureTime().setWindowBefore( new Time() {{ setTime( new String() ); }} );
*/
        // Populate "OriginDestinationInformation" filed
        instance.setOriginDestinationInformation( new OriginDestinationInformation_type0() );
        instance.getOriginDestinationInformation().setFlightSegment( new FlightSegment_type0() );
//        instance.getOriginDestinationInformation().getFlightSegment().setConnectionLocations( new ConnectionLocations_type0() );
//        instance.getOriginDestinationInformation().getFlightSegment().getConnectionLocations().addConnectionLocation( new ConnectionLocation_type0() );
        instance.getOriginDestinationInformation().getFlightSegment().setDestinationLocation( new DestinationLocation_type0() );
        instance.getOriginDestinationInformation().getFlightSegment().setOriginLocation( new OriginLocation_type0() );

        // Set "Version" field (required)
        instance.setVersion( versionString );

        return instance;
    }

}
