package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.ebxml.www.namespaces.messageheader.*;

import java.util.GregorianCalendar;

/**
 * Created by SG0221139 on 7/29/2014.
 *
 * This is a helper class with static method, that returns an instance of MessageHeaderDocument.
 * It is used by wrapper classes to construct full SOAP message and make web service call
 * using Apache Axis2 framework and XMLBeans data binding.
 *
 */
public class MessageHeaderFactory {

    private static String getConversationID() {

        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );

        return buffer.toString();
    }

    public static MessageHeaderDocument getMessageHeader( IConfigurationProvider configuration, String action ) {

        MessageHeaderDocument instance = MessageHeaderDocument.Factory.newInstance();
        MessageHeaderDocument.MessageHeader header = instance.addNewMessageHeader();

        header.setConversationId( getConversationID() );

        FromDocument.From from = FromDocument.From.Factory.newInstance();
        PartyIdDocument.PartyId partyId = from.addNewPartyId();
        partyId.setType(Util.getFromString());
        header.setFrom( from );

        ToDocument.To to = ToDocument.To.Factory.newInstance();
        PartyIdDocument.PartyId partyIdTo = to.addNewPartyId();
        partyIdTo.setType( Util.getToString() );
        header.setTo( to );

        header.setCPAId( configuration.getPCC() );
        ServiceDocument.Service service = header.addNewService();
        service.setType( Util.getServiceTypeString() );

        header.setAction( action );

        MessageDataDocument.MessageData messageData = header.addNewMessageData();
        messageData.setMessageId( getMessageId(action) );
        messageData.setTimestamp( Util.getTimestamp() );
        messageData.setTimeToLive( new GregorianCalendar( 2014, 12, 12 ));

        System.out.println( instance.toString() );

        return instance;
    }

    private static String getMessageId( String seed ) {
        return new StringBuilder( seed ).append( Util.longRandomHexString() ).toString();
    }

}
