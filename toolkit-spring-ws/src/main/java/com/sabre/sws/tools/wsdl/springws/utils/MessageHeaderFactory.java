package com.sabre.sws.tools.wsdl.springws.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.soap.*;

/**
 * Created by SG0221139 on 8/14/2014.
 */
public class MessageHeaderFactory {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static MessageHeader getMessageHeader( String actionString ) {

        MessageHeader header = new MessageHeader();

        header.setAction( actionString );
        header.setConversationId( getConversationId() );
        header.setCPAId( configuration.getPCC() );

        header.setFrom( getFrom() );
        header.setTo( getTo() );

        header.setService( new Service() );

        return header;
    }

    private static From getFrom() {
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setValue( Util.getFromString() );
        from.getPartyId().add( fromPartyId );
        return from;
    }

    private static To getTo() {
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setValue( Util.getToString() );
        to.getPartyId().add( toPartyId );
        return to;
    }

    private static String getConversationId() {

        String id;

        if(SessionManager.getInstance().isSessionActive()) {
            id = SessionManager.getInstance().getConversationID();
        } else {
            StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
            buffer.append( "-" );
            buffer.append( Util.longRandomHexString() );
            id = buffer.toString();
        }
        return id;
    }

}
