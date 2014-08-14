package com.sabre.sws.tools.wsdl.springws.client;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by SG0221139 on 8/13/2014.
 */
public class SwsClient extends WebServiceGatewaySupport {

    public SessionCreateRS createSession() {

        WebServiceMessageCallback callback = new WebServiceMessageCallback() {
            @Override
            public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
                SaajSoapMessage message = (SaajSoapMessage) webServiceMessage;
                SoapHeader header = message.getSoapHeader();
                QName qName = new QName( "http://schemas.xmlsoap.org/ws/2002/12/secext", "Security", "wsse" );
                header.addHeaderElement( qName );
                webServiceMessage.writeTo( System.out );
            }
        };

        SessionCreateRQ request = new SessionCreateRQ();

        Security security = new Security();
        Security.UsernameToken usernameToken = new Security.UsernameToken();

        IConfigurationProvider configurationProvider = Util.getConfigurationProvider();

        usernameToken.setDomain(configurationProvider.getDomain());
        usernameToken.setOrganization(configurationProvider.getOrganization());
        usernameToken.setPassword(configurationProvider.getPassword());
        usernameToken.setUsername(configurationProvider.getUsername());

        security.setUsernameToken(usernameToken);

        // Message Header
        MessageHeader header = new MessageHeader();
        header.setAction( "SessionCreateRQ" );
        StringBuffer buffer = new StringBuffer( Util.getTimestamp() );
        buffer.append( "-" );
        buffer.append( Util.longRandomHexString() );
        header.setConversationId(buffer.toString());
        header.setCPAId( configurationProvider.getPCC() );
        From from = new From();
        from.setRole( Util.getFromString() );
        header.setFrom( from );
        To to = new To();
        to.setRole( Util.getToString() );
        header.setTo( to );
        header.setService( new Service());

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        source.setPseudoCityCode( configurationProvider.getPCC() );
        pos.setSource( source );
        request.setPOS( pos );

        SessionCreateRS response = (SessionCreateRS)getWebServiceTemplate().marshalSendAndReceive(request, callback);

        return response;
    }

}
