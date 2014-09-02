package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;


import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import static com.sabre.sws.tools.wsdl.stubs.adb.SessionCreateRQServiceStub.*;
/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionCreateHelper {

    public NonEmptyString toNonEmptyString( String param ) {
        NonEmptyString instance = new NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    private String getConversationID() {

        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );

        return buffer.toString();
    }

    public SessionCreateRQ getSessionCreateRQInstance( IConfigurationProvider configuration) {

        POS_type0 pos = new POS_type0();

        Source_type0 source = new Source_type0();
        source.setPseudoCityCode( configuration.getPCC() );

        pos.setSource( source );

        SessionCreateRQ instance = new SessionCreateRQ();
        instance.setPOS( pos );

        return instance;
    }

    public Security getSecurityInstance( IConfigurationProvider configuration ) {

        Security security = new Security();
        UsernameToken_type0 usernameToken = new UsernameToken_type0();

        // Set credentials
        usernameToken.setDomain( configuration.getDomain() );
        usernameToken.setPassword( configuration.getPassword() );
        usernameToken.setUsername( configuration.getUsername() );
        usernameToken.setOrganization( configuration.getOrganization() );

        security.setUsernameToken( usernameToken );

        return security;
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
        To_type0 to_type0 = new To_type0();
        PartyId_type0 toParty = new PartyId_type0();
        toParty.setString( Util.getToString() );
        to_type0.addPartyId( partyId_type0 );

        instance.setTo( to_type0 );


        // Set CPA_ID element
        instance.setCPAId( toNonEmptyString( configuration.getOrganization() ) );

        // Generate and set CONVERSATION_ID element
        String conversationID = getConversationID();

        instance.setConversationId( toNonEmptyString( conversationID ) );

        // Set SERVICE element
        Service_type0 service_type0 = new Service_type0();
        service_type0.setString( "SessionCreateRQ" );

        instance.setService( service_type0 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( "SessionCreateRQ" ) );


        // Populate and set MESSAGE_DATA element
        MessageData_type0 messageData = new MessageData_type0();

        String messageID = new StringBuffer("SessionCreate-").append(Util.longRandomHexString()).toString();
        messageData.setMessageId( toNonEmptyString(messageID ) );

        Timestamp timestamp = new Timestamp();
        timestamp.setTimestamp( Util.getTimestamp() );
        messageData.setTimestamp( Util.getTimestamp() );

        messageData.setTimeout( new NonNegativeInteger( "50" ) );

        instance.setMessageData( messageData );
        return instance;
    }

}
