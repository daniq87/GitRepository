package com.sabre.sws.tools.wsdl.cxf.jaxb.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.*;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class MessageHeaderFactory {

    private MessageHeaderFactory() {

    }

    public static MessageHeader getMessageHeader( IConfigurationProvider configuration, String action ) {

        MessageHeader instance = new MessageHeader();
        instance.setConversationId( getConversationID() );

        From from = new From();
        PartyId partyId = new PartyId();
        partyId.setValue( Util.getFromString() );
        from.getPartyId().add( partyId );
        from.setRole( Util.getFromString() );
        instance.setFrom(from);

        To to = new To();
        to.setRole( Util.getToString() );
        PartyId toPartyId = new PartyId();
        toPartyId.setValue( Util.getToString() );
        to.getPartyId().add( toPartyId );
        instance.setTo( to );

        instance.setCPAId( configuration.getPCC() );

        instance.setAction( Util.getServiceTypeString() );

        instance.setAction( action );

        MessageData messageData = new MessageData();
        messageData.setMessageId( "Some msg ID" );  // TODO
        messageData.setTimestamp( Util.getTimestamp() );
        instance.setMessageData( messageData );

        return instance;
    }

    private static String getConversationID() {

        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );

        return buffer.toString();
    }

}
