package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;


import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import static com.sabre.sws.tools.wsdl.stubs.adb.OTA_AirAvailServiceStub.*;

/**
 * Created by SG0221139 on 7/14/2014.
 *
 * The purpose of helper classes in this package is to provide ready-to-use elements
 * for corresponding wrapper classes. These are mostly session and authentication objects,
 * that represent custom SOAP headers used by Sabre Web Services.
 *
 * This is due to code redundancy caused by the way ADB framework maps schema objects
 * to Java classes. The issue is described in documentation, distributed with this project.
 *
 */
public class AirAvailHelper {

    private final static String actionString = "OTA_AirAvailLLSRQ";
    private final static String versionString = ServicesVersionsProvider.getOtaAirAvailVersion();

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
        partyId_type0.setString( Util.getToString() );
        from.addPartyId( partyId_type0 );

        instance.setFrom( from );

        // Instantiate and set TO element
        To to = new To();
        To_type0 to_type0 = new To_type0();
        PartyId_type0 toParty = new PartyId_type0();
        toParty.setString( Util.getToString() );
        to_type0.addPartyId( partyId_type0 );

        instance.setTo( to_type0 );

        // Set CPA_ID element
        instance.setCPAId( toNonEmptyString( configuration.getOrganization() ) );

        // Generate and set CONVERSATION_ID element
        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );
        String conversationID = buffer.toString();

        instance.setConversationId( toNonEmptyString( SessionManager.getInstance().getConversationID() ) );

        // Set SERVICE element
        Service_type0 service_type0 = new Service_type0();
        service_type0.setString( actionString );

        instance.setService( service_type0 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = new StringBuffer("OTA_AirAvail-").append(Util.longRandomHexString()).toString();
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

        // Populate "OriginDestinationInformation" filed
        instance.setOriginDestinationInformation( new OriginDestinationInformation_type0() );
        instance.getOriginDestinationInformation().setFlightSegment( new FlightSegment_type0() );
        instance.getOriginDestinationInformation().getFlightSegment().setDestinationLocation( new DestinationLocation_type0() );
        instance.getOriginDestinationInformation().getFlightSegment().setOriginLocation( new OriginLocation_type0() );

        // Set "Version" field (required)
        instance.setVersion( versionString );

        return instance;
    }

}
