package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SoapMessageUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
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

/**
 * Created by SG0221139 on 8/12/2014.
 *
 * This is an interceptor class for Sabre Web Services' CXF client application.
 * It checks whether the response from the Sabre Orchestrated Services contains
 * any error sections, and if so, the error information is formatted and logged.
 *
 */
public class SWSOResponseInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger(SWSOResponseInterceptor.class.getName());

    public SWSOResponseInterceptor() {
        super( Phase.RECEIVE );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        CachedOutputStream messageCopyStream;
        try {
            messageCopyStream = SoapMessageUtils.copyMessageIntoStream(message);
            try {
                XMLStreamReader streamReader = XMLInputFactory.newInstance().createXMLStreamReader(messageCopyStream.getInputStream());
                findAndHandleErrors( streamReader );
            } catch (XMLStreamException e) {
                Throwable t = new Throwable( "Couldn't parse service response" );
                throw new Fault( t );
            }
        } catch (IOException e) {
            throw new Fault(e);
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

        StringBuffer errorMessageBuffer = new StringBuffer( "Error in response:\n" );

        String errorMessage = null;
        String errorShortText = null;
        String errorElement = null;

        do {
            if( isCurrentTagMessage(streamReader) ) {
                errorMessage = streamReader.getElementText();
            } else if( isCurrentTagShortText(streamReader) ) {
                errorShortText = streamReader.getElementText();
            } else if( isCurrentTagElement( streamReader) ) {
                errorElement = streamReader.getElementText();
            }
            streamReader.next();
        } while( isNotYetEndOfDocument(streamReader) && isCurrentErrorSectionNotEnded(streamReader));

        if( errorMessage != null ) {
            errorMessageBuffer.append("Error message: ").append( errorMessage ).append( "\n" );
        }
        if( errorShortText != null ) {
            errorMessageBuffer.append("Short text: ").append( errorShortText ).append( "\n" );
        }
        if( errorElement != null ) {
            errorMessageBuffer.append("In element: ").append( errorElement ).append( "\n" );
        }
        LOGGER.error(errorMessageBuffer.toString());

    }

    private boolean isNotYetEndOfDocument( XMLStreamReader streamReader ) {
        return streamReader.getEventType() != XMLStreamConstants.END_ELEMENT;
    }

    private boolean isCurrentErrorSectionNotEnded(XMLStreamReader streamReader) {
        return streamReader.hasName() && !streamReader.getName().getLocalPart().equalsIgnoreCase( "Error" );
    }

    private boolean isCurrentTagMessage( XMLStreamReader streamReader ) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "message" );
    }

    private boolean isCurrentTagShortText( XMLStreamReader streamReader ) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "shorttext" );
    }

    private boolean isCurrentTagElement( XMLStreamReader streamReader ) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "element" );
    }

}
