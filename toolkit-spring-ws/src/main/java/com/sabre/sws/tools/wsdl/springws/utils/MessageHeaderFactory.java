package com.sabre.sws.tools.wsdl.springws.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;

/**
 * Created by SG0221139 on 8/14/2014.
 */
public class MessageHeaderFactory {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static MessageHeader getMessageHeader( String actionString ) {

        MessageHeader header = new MessageHeader();
        header.setAction( actionString );
        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );
        header.setConversationId(buffer.toString());
        header.setCPAId( configuration.getPCC() );
        From from = new From();
        from.setRole( Util.getFromString() );
        header.setFrom( from );
        To to = new To();
        to.setRole( Util.getToString() );
        header.setTo( to );
        header.setService( new Service());

        return header;
    }

}
