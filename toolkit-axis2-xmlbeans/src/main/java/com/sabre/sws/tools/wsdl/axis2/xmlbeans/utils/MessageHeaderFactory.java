package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.ebxml.www.namespaces.messageheader.*;

import java.util.GregorianCalendar;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class MessageHeaderFactory {

    private static String getConversationID() {

        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );

        return buffer.toString();
    }

    public static MessageHeaderDocument getMessageHeader( IConfigurationProvider configuration ) {

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

        header.setCPAId( configuration.getPCC() );
        ServiceDocument.Service service = header.addNewService();
        service.setType( Util.getServiceTypeString() );

        header.setAction( "SessionCreateRQ" );

        MessageDataDocument.MessageData messageData = header.addNewMessageData();
        messageData.setMessageId( "TestCase" ); // TODO
        messageData.setTimestamp( Util.getTimestamp() );
        messageData.setTimeToLive( new GregorianCalendar( 2014, 12, 12 ));

        return instance;
    }

}
