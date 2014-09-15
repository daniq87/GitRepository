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
 */
public class LLSErrorInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LLSErrorInterceptor.class.getName() );

    public LLSErrorInterceptor() {
        super( Phase.RECEIVE );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage( SoapMessage message ) {

        try {
            CachedOutputStream messageCopyStream = SoapMessageUtils.copyMessageIntoStream(message);
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

        if( headerHasError( streamReader ) ) {
            handleMessageFault( streamReader );
        }

    }

    private boolean headerHasError( XMLStreamReader streamReader ) throws XMLStreamException {

        boolean errorInHeader = false;

        while( streamReader.hasNext() ) {
            if( headerHasEnded(streamReader) ) {
                break;
            }
            if( currentElementIsError(streamReader) ) {
                errorInHeader = true;
            }
            streamReader.next();
        }
        return errorInHeader;
    }

    private boolean headerHasEnded(XMLStreamReader streamReader) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "header" ) && ( streamReader.getEventType() == XMLStreamConstants.END_ELEMENT );
    }

    private boolean currentElementIsError(XMLStreamReader streamReader) throws XMLStreamException {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "action" ) && new String( streamReader.getElementText() ).equalsIgnoreCase( "ErrorRS" );
    }

    private void handleMessageFault( XMLStreamReader streamReader ) throws XMLStreamException {

        StringBuffer buffer = new StringBuffer( "SOAP Message contains Fault section\n" );

        String faultCode = null;
        String faultString = null;
        String stackTrace = null;

        while( streamReader.hasNext() && !isFaultEnd(streamReader) ) {

            if(isCurrentElementFaultcode(streamReader)) {
                faultCode = new String( streamReader.getElementText() );
            }
            if(isCurrentElementFaultString(streamReader)) {
                faultString = new String( streamReader.getElementText() );
            }
            if(isCurrentElementStacktrace(streamReader)) {
                stackTrace = new String( streamReader.getElementText() );
            }

            streamReader.next();
        }

        if( faultCode != null ) {
            buffer.append( "Fault code: " ).append( faultCode ).append("\n");
        }

        if( faultString != null ) {
            buffer.append( "Fault String: " ).append( faultString ).append("\n");
        }

        if( stackTrace != null ) {
            buffer.append( "Stack Trace: ").append( stackTrace ).append("\n");
        }

        LOGGER.error( buffer.toString() );

        throw new Fault( new Throwable( "Message has fault" ) );
    }

    private boolean isCurrentElementStacktrace(XMLStreamReader streamReader) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "stacktrace" );
    }

    private boolean isCurrentElementFaultString(XMLStreamReader streamReader) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultstring" );
    }

    private boolean isCurrentElementFaultcode(XMLStreamReader streamReader) {
        return streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultcode" );
    }

    private boolean isFaultEnd(XMLStreamReader streamReader) {
        return streamReader.hasName()
                && streamReader.getName().getLocalPart().equalsIgnoreCase( "fault" )
                && streamReader.getEventType() == XMLStreamConstants.END_ELEMENT;
    }

}
