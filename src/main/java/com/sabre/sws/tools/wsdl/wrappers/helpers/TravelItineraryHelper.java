package com.sabre.sws.tools.wsdl.wrappers.helpers;

import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.SessionManager;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import java.security.InvalidParameterException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

import static com.sabre.sws.tools.wsdl.stubs.TravelItineraryReadServiceStub.*;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class TravelItineraryHelper {

    private final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );
    private final static String actionString = "TravelItineraryReadLLSRQ";
    private final static String versionString = "2.0.0";

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

    public Security3 getSecuirityInstance( IConfigurationProvider configuration ) {
        Security3 instance = new Security3();
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
        StringBuffer buffer = new StringBuffer( getTimestamp() );
        buffer.append( "-" );
        buffer.append( longRandomHexString() );
        String conversationID = buffer.toString();

//        instance.setConversationId( toNonEmptyString( conversationID ) );
        instance.setConversationId( toNonEmptyString( "conv-ID" ) );

        // Set SERVICE element
        Service_type1 service_type1 = new Service_type1();
        service_type1.setType(toNonEmptyString(actionString));
        service_type1.setString( "Dummy?" );

        instance.setService( service_type1 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = longRandomHexString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        Timestamp timestamp = new Timestamp();
        timestamp.setTimestamp( getTimestamp() );
        messageData.setTimestamp( getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ));

        instance.setMessageData( messageData );
        return instance;
    }

    public TravelItineraryReadRQ getTravelItineraryRQ( String id ) {

        if( id.length() != 6 ) {
            throw new InvalidParameterException( "PNR must be 6 characters long" );
        }

        TravelItineraryReadRQ instance = new TravelItineraryReadRQ();

        instance.setVersion( "2.2.0" );         // TODO: this and other versionings should be external dependency

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
