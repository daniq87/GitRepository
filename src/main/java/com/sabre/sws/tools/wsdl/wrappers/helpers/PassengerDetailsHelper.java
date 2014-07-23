package com.sabre.sws.tools.wsdl.wrappers.helpers;

import com.sabre.sws.tools.wsdl.stubs.PassengerDetailsServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.SessionManager;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

import static com.sabre.sws.tools.wsdl.stubs.PassengerDetailsServiceStub.*;

/**
 * Created by SG0221139 on 7/21/2014.
 */
public class PassengerDetailsHelper {

    private final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );
    private final static String actionString = "PassengerDetailsRQ";
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

        PassengerDetailsServiceStub.NonEmptyString instance = new NonEmptyString();
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

        instance.setVersion( toNonEmptyString( "2.2.1" ) );     // TODO: This should be stored somewhere else

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

    public PassengerDetailsRQ getRequestBody( IConfigurationProvider configuration ) {
        PassengerDetailsRQ requestBody = new PassengerDetailsRQ();
        requestBody.setVersion( versionString );

        requestBody.setVersion( "2.2.1" );  // TODO
        return requestBody;
    }

}
