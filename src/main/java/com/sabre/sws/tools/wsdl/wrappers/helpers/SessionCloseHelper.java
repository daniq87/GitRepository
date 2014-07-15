package com.sabre.sws.tools.wsdl.wrappers.helpers;

import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.SessionManager;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;

import static com.sabre.sws.tools.wsdl.stubs.SessionCloseRQServiceStub.*;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionCloseHelper {

    private final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );

    private final static Logger LOGGER = Logger.getLogger( SessionCloseHelper.class.getName() );

    private String getTimestamp() {

        Date now = new Date();
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

    public Security getSecurityInstance( IConfigurationProvider configuration ) {

        Security security = new Security();

        security.setBinarySecurityToken(SessionManager.getInstance().getToken());

        return security;
    }

    public SessionCloseRQ getSessionCloseRQInstance(IConfigurationProvider configuration) {

        POS_type0 pos = new POS_type0();

        Source_type0 source = new Source_type0();
        source.setPseudoCityCode( configuration.getPCC() );

        pos.setSource( source );

        SessionCloseRQ instance = new SessionCloseRQ();
        instance.setPOS( pos );

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
//        To to = new To();
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
        instance.setConversationId( toNonEmptyString( "conv-ID" ) );    // TODO: this should be shared

        // Set SERVICE element
        Service_type0 service_type0 = new Service_type0();
        service_type0.setString( "SessionCloseRQ" );

        instance.setService( service_type0 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( "SessionCloseRQ" ) );


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

}
