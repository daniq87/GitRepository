package com.sabre.sws.tools.wsdl.springws.callbacks;

import com.sabre.sws.tools.wsdl.springws.soap.MessageHeader;
import com.sabre.sws.tools.wsdl.springws.soap.Security;
import com.sabre.sws.tools.wsdl.springws.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.springws.utils.SecurityFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by SG0221139 on 8/14/2014.
 *
 * This is a callback class for working with Spring Web Services.
 * It plays a crucial role in consuming Sabre Web Services using Spring WS framework.
 * By default, Spring WS has no mechanism that would allow to compose custom headers
 * into the message. This callback inserts wsse:Security and eb:MessageHeader headers
 * into processed message.
 * The doWithMessage() method marshals proper header objects into the message.
 */

public class HeaderComposingCallback implements WebServiceMessageCallback {

    private final String actionString;
    private final boolean creatingSession;

    private final static String messageHeaderPackage = MessageHeader.class.getPackage().getName();
    private final static String securityPackage = Security.class.getPackage().getName();

    private final MessageHeader header;
    private final Security security;

    private static final Jaxb2Marshaller marshaller;

    static {
        marshaller = new Jaxb2Marshaller();
        StringBuffer buffer = new StringBuffer().append( messageHeaderPackage ).append( ":" ).append( securityPackage );
        String contextPath = buffer.toString();
        marshaller.setContextPath( contextPath );
    }

    public HeaderComposingCallback(String actionString) {
        this.actionString = actionString;
        this.creatingSession = actionString.equalsIgnoreCase( "SessionCreateRQ" );

        header = MessageHeaderFactory.getMessageHeader( this.actionString );
        if( this.creatingSession ) {
            security = SecurityFactory.getCredentialsSecurity();
        } else {
            security = SecurityFactory.getTokenSecurity();
        }
    }

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {

        SoapHeader soapHeaderElement = ((SoapMessage)webServiceMessage).getSoapHeader();

        marshaller.marshal(header, soapHeaderElement.getResult());
        marshaller.marshal(security, soapHeaderElement.getResult());

    }


}
