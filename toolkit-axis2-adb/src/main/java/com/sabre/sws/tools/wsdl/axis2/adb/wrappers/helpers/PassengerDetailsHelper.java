package com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.stubs.adb.PassengerDetailsServiceStub;
import org.apache.axis2.databinding.types.NonNegativeInteger;


/**
 * Created by SG0221139 on 7/21/2014.
 *
 * The purpose of helper classes in this package is to provide ready-to-use elements
 * for corresponding wrapper classes. These are mostly session and authentication objects,
 * that represent custom SOAP headers used by Sabre Web Services.
 *
 * This is due to code redundancy caused by the way ADB framework maps schema objects
 * to Java classes. The issue is described in documentation, distributed with this project.
 *
 */
public class PassengerDetailsHelper {

    private final static String actionString = "PassengerDetailsRQ";
    private final static String versionString = ServicesVersionsProvider.getPassengerDetailsVersion();

    public PassengerDetailsServiceStub.NonEmptyString toNonEmptyString( String param ) {

        PassengerDetailsServiceStub.NonEmptyString instance = new PassengerDetailsServiceStub.NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    public PassengerDetailsServiceStub.Security getSecurityInstance( IConfigurationProvider configuration ) {

        PassengerDetailsServiceStub.Security instance = new PassengerDetailsServiceStub.Security();

        instance.setBinarySecurityToken( SessionManager.getInstance().getToken() );
        return instance;
    }

    public PassengerDetailsServiceStub.MessageHeader getMessageHeaderInstance( IConfigurationProvider configuration ) {

        PassengerDetailsServiceStub.MessageHeader instance = new PassengerDetailsServiceStub.MessageHeader();

        instance.setVersion( toNonEmptyString( versionString ) );

        // Instantiate and set FROM element
        PassengerDetailsServiceStub.From_type0 from = new PassengerDetailsServiceStub.From_type0();
        PassengerDetailsServiceStub.PartyId_type0 partyId_type0 = new PassengerDetailsServiceStub.PartyId_type0();
        partyId_type0.setString( Util.getFromString() );
        from.addPartyId( partyId_type0 );

        instance.setFrom( from );

        // Instantiate and set TO element
        PassengerDetailsServiceStub.To_type0 to_type0 = new PassengerDetailsServiceStub.To_type0();
        PassengerDetailsServiceStub.PartyId_type0 toParty = new PassengerDetailsServiceStub.PartyId_type0();
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
        PassengerDetailsServiceStub.Service_type2 service_type2 = new PassengerDetailsServiceStub.Service_type2();
        service_type2.setString( "" );
        service_type2.setType( toNonEmptyString( Util.getServiceTypeString() ) );

        instance.setService( service_type2 );

        // Set ACTION element
        instance.setAction( toNonEmptyString( actionString ) );


        // Populate and set MESSAGE_DATA element
        PassengerDetailsServiceStub.MessageData_type0 messageData = new PassengerDetailsServiceStub.MessageData_type0();

        String messageID = new StringBuffer("PassengerDetails-").append(Util.longRandomHexString()).toString();
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
        PassengerDetailsServiceStub.Version_type0 version = new PassengerDetailsServiceStub.Version_type0();
        version.setVersion_type0( versionString );
        requestBody.setVersion( version );
        return requestBody;
    }

}
