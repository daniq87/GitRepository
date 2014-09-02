package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.stubs.adb.TravelItineraryReadServiceStub;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import java.security.InvalidParameterException;

import static com.sabre.sws.tools.wsdl.stubs.adb.TravelItineraryReadServiceStub.*;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class TravelItineraryHelper {


    private final static String actionString = "TravelItineraryReadLLSRQ";
    private final static String versionString = ServicesVersionsProvider.getTravelItineraryVersion();

    public NonEmptyString toNonEmptyString( String param ) {
        NonEmptyString instance = new NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    public TravelItineraryReadServiceStub.Security5 getSecuirityInstance( IConfigurationProvider configuration ) {
        TravelItineraryReadServiceStub.Security5 instance = new TravelItineraryReadServiceStub.Security5();
        instance.setBinarySecurityToken(SessionManager.getInstance().getToken());

        return instance;
    }

    public MessageHeader getMessageHeaderInstance( IConfigurationProvider configuration ) {
        MessageHeader instance = new MessageHeader();

        // Instantiate and set FROM element
        From_type0 from = new From_type0();
        PartyId_type0 partyId_type0 = new PartyId_type0();
        partyId_type0.setString( Util.getFromString() );
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
        instance.setConversationId( toNonEmptyString( SessionManager.getInstance().getConversationID() ) );

        // Set SERVICE element
        Service_type1 service_type1 = new Service_type1();
        service_type1.setType(toNonEmptyString(actionString));
        service_type1.setString( Util.getServiceTypeString() );

        instance.setService( service_type1 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = new StringBuffer("TravelItinerary-").append(Util.longRandomHexString()).toString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        Timestamp timestamp = new Timestamp();
        timestamp.setTimestamp( Util.getTimestamp() );
        messageData.setTimestamp( Util.getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ));

        instance.setMessageData( messageData );
        return instance;
    }

    public TravelItineraryReadRQ getTravelItineraryRQ( String id ) {

        if( id.length() != 6 ) {
            throw new InvalidParameterException( "PNR must be 6 characters long" );
        }

        TravelItineraryReadRQ instance = new TravelItineraryReadRQ();

        instance.setVersion( versionString );

        MessagingDetails_type0 msgDetails = new MessagingDetails_type0();
        Transaction_type0 transaction = new Transaction_type0();
        Code_type0 code = Code_type0.PNR;
        transaction.setCode( code );

        msgDetails.addTransaction( transaction );

        instance.setMessagingDetails( msgDetails );
        UniqueID_type0 uid = new UniqueID_type0();
        uid.setID( id );
        instance.setUniqueID( uid );

        return instance;
    }

}
