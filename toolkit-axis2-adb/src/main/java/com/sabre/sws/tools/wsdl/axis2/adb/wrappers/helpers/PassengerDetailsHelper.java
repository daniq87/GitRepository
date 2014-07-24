package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.stubs.PassengerDetailsServiceStub;
import org.apache.axis2.databinding.types.NonNegativeInteger;


/**
 * Created by SG0221139 on 7/21/2014.
 */
public class PassengerDetailsHelper {

    private final static String actionString = "PassengerDetailsRQ";
    private final static String versionString = "2.2.1";

    public PassengerDetailsServiceStub.NonEmptyString toNonEmptyString( String param ) {

        PassengerDetailsServiceStub.NonEmptyString instance = new PassengerDetailsServiceStub.NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    public PassengerDetailsServiceStub.Security3 getSecurityInstance( IConfigurationProvider configuration ) {

        PassengerDetailsServiceStub.Security3 instance = new PassengerDetailsServiceStub.Security3();

        instance.setBinarySecurityToken( SessionManager.getInstance().getToken() );
        return instance;
    }

    public PassengerDetailsServiceStub.MessageHeader getMessageHeaderInstance( IConfigurationProvider configuration ) {

        PassengerDetailsServiceStub.MessageHeader instance = new PassengerDetailsServiceStub.MessageHeader();

        instance.setVersion( toNonEmptyString( "2.2.1" ) );     // TODO: This should be stored somewhere else

        // Instantiate and set FROM element
        PassengerDetailsServiceStub.From_type0 from = new PassengerDetailsServiceStub.From_type0();
        PassengerDetailsServiceStub.PartyId_type0 partyId_type0 = new PassengerDetailsServiceStub.PartyId_type0();
        partyId_type0.setString( "SomeString" );    // TODO: Set this value properly
        from.addPartyId( partyId_type0 );

        instance.setFrom( from );

        // Instantiate and set TO element
        PassengerDetailsServiceStub.To to = new PassengerDetailsServiceStub.To();
        PassengerDetailsServiceStub.To_type0 to_type0 = new PassengerDetailsServiceStub.To_type0();
        PassengerDetailsServiceStub.PartyId_type0 toParty = new PassengerDetailsServiceStub.PartyId_type0();
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
        PassengerDetailsServiceStub.Service_type2 service_type2 = new PassengerDetailsServiceStub.Service_type2();
        service_type2.setString( actionString );
        service_type2.setType( toNonEmptyString( "Dummy?" ) );  // TODO: Self-explaining

        instance.setService( service_type2 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        PassengerDetailsServiceStub.MessageData_type0 messageData = new PassengerDetailsServiceStub.MessageData_type0();

        String messageID = Util.longRandomHexString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        PassengerDetailsServiceStub.Timestamp timestamp = new PassengerDetailsServiceStub.Timestamp();
        timestamp.setTimestamp( Util.getTimestamp() );
        messageData.setTimestamp( Util.getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ) );

        instance.setMessageData( messageData );
        return instance;

    }

    public PassengerDetailsServiceStub.PassengerDetailsRQ getRequestBody( IConfigurationProvider configuration ) {
        PassengerDetailsServiceStub.PassengerDetailsRQ requestBody = new PassengerDetailsServiceStub.PassengerDetailsRQ();
        requestBody.setVersion( versionString );

        requestBody.setVersion( "2.2.1" );  // TODO
        return requestBody;
    }

}
