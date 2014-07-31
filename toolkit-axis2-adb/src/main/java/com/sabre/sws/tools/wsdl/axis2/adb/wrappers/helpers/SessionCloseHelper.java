package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.sabre.sws.tools.wsdl.stubs.adb.SessionCloseRQServiceStub.*;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionCloseHelper {

    private final static Logger LOGGER = LogManager.getLogger(SessionCloseHelper.class.getName());

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
        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );
        String conversationID = buffer.toString();

//        instance.setConversationId( toNonEmptyString( conversationID ) );
        instance.setConversationId( toNonEmptyString( SessionManager.getInstance().getConversationID() ) );

        // Set SERVICE element
        Service_type0 service_type0 = new Service_type0();
        service_type0.setString( "SessionCloseRQ" );

        instance.setService( service_type0 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( "SessionCloseRQ" ) );


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

}
