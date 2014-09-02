package com.sabre.sws.tools.wsdl.springws.callbacks;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import com.sabre.sws.tools.wsdl.springws.soap.MessageHeader;
import com.sabre.sws.tools.wsdl.springws.soap.Security;
import com.sabre.sws.tools.wsdl.springws.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.springws.utils.SecurityFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by SG0221139 on 8/14/2014.
 */
public class HeaderComposingCallback implements WebServiceMessageCallback {

    private static final Logger LOGGER = LogManager.getLogger( HeaderComposingCallback.class );

    private final String actionString;
    private final boolean creatingSession;

    private final MessageHeader header;
    private final Security security;

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

        SoapHeader soapHeader = ((SoapMessage)webServiceMessage).getSoapHeader();

        try {

            JAXBContext context = JAXBContext.newInstance( MessageHeader.class, Security.class );

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal( header, soapHeader.getResult() );
            marshaller.marshal( security, soapHeader.getResult() );

//            logMessage( webServiceMessage );

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private void logMessage(WebServiceMessage webServiceMessage) {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            webServiceMessage.writeTo( outputStream );
            String log = XMLPrettifier.pretify( outputStream.toString( "UTF-8" ) );
            LOGGER.debug("\n\n" + log + "\n" );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
