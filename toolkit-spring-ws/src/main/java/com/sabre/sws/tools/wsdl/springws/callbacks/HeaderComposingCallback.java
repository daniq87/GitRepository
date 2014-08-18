package com.sabre.sws.tools.wsdl.springws.callbacks;

import com.sabre.sws.tools.wsdl.springws.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.springws.utils.SecurityFactory;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.w3c.dom.Document;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import java.io.IOException;

/**
 * Created by SG0221139 on 8/14/2014.
 */
public class HeaderComposingCallback implements WebServiceMessageCallback {

    private final String actionString;
    private final boolean creatingSession;

    private final MessageHeader header;
    private final Security security;

    public HeaderComposingCallback(String actionString) {
        this.actionString = actionString;
        this.creatingSession = actionString.equalsIgnoreCase( "SessionCreateRQ" );

        header = MessageHeaderFactory.getMessageHeader( actionString );
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

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document securityDocument = builder.newDocument();
            Document headerDocument = builder.newDocument();

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal( header, headerDocument );
            marshaller.marshal( security, securityDocument );

            Transformer t = TransformerFactory.newInstance().newTransformer();

            DOMSource headerSource = new DOMSource( headerDocument );
            DOMSource securitySource = new DOMSource( securityDocument );

            t.transform( headerSource, soapHeader.getResult() );
            t.transform( securitySource, soapHeader.getResult() );

            webServiceMessage.writeTo( System.out );

        } catch (JAXBException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

}
