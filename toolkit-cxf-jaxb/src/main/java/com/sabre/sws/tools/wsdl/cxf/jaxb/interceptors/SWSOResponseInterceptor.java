package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by SG0221139 on 8/12/2014.
 */
public class SWSOResponseInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger(SWSOResponseInterceptor.class.getName());

    public SWSOResponseInterceptor() {
        super( Phase.RECEIVE );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        InputStream is = message.getContent(InputStream.class);
        if (is != null) {
            CachedOutputStream bos = new CachedOutputStream();
            try {
                IOUtils.copy(is, bos);

                bos.flush();
                is.close();
                message.setContent(InputStream.class,
                        bos.getInputStream());
                bos.close();

                try {
                    XMLStreamReader streamReader = XMLInputFactory.newInstance().createXMLStreamReader(bos.getInputStream());
                    findAndHandleErrors( streamReader );
                } catch (XMLStreamException e) {
                    Throwable t = new Throwable( "Couldn't parse service response" );
                    throw new Fault( t );
                }

            } catch (IOException e) {
                throw new Fault(e);
            }
        }

    }

    private void findAndHandleErrors( XMLStreamReader streamReader ) throws XMLStreamException {

        while( streamReader.hasNext() ) {

            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "error" ) ) {
                handleSingleError( streamReader );
            }
            streamReader.next();
        }

    }

    private void handleSingleError( XMLStreamReader streamReader ) throws XMLStreamException {

        StringBuffer buffer = new StringBuffer( "Error in response:\n" );

        String message = null;
        String shortText = null;
        String element = null;

        do {
            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "message" ) ) {
                message = new String( streamReader.getElementText() );
            } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "shorttext" ) ) {
                shortText = new String( streamReader.getElementText() );
            } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "element" ) ) {
                element = new String( streamReader.getElementText() );
            }

            streamReader.next();
        } while( streamReader.getEventType() != XMLStreamConstants.END_ELEMENT
                || !streamReader.hasName()
                || !streamReader.getName().getLocalPart().equalsIgnoreCase( "Error" ) );

        if( message != null ) {
            buffer.append( "Error message: " ).append( message ).append( "\n" );
        }

        if( shortText != null ) {
            buffer.append( "Short text: " ).append( shortText ).append( "\n" );
        }

        if( element != null ) {
            buffer.append( "In element: " ).append( element ).append( "\n" );
        }

        LOGGER.error( buffer.toString() );

    }

}
