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
public class LLSErrorInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LLSErrorInterceptor.class.getName() );

    public LLSErrorInterceptor() {
        super( Phase.RECEIVE );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage( SoapMessage message ) {

        InputStream is = message.getContent(InputStream.class);
        if (is != null) {
            CachedOutputStream cos = new CachedOutputStream();
            try {
                IOUtils.copy(is, cos);

                cos.flush();
                is.close();
                message.setContent(InputStream.class,
                        cos.getInputStream());
                cos.close();
                try {
                    XMLStreamReader streamReader = XMLInputFactory.newInstance().createXMLStreamReader(cos.getInputStream());
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

        if( headerHasError( streamReader ) ) {
            handleMessageFault( streamReader );
        }

    }

    private boolean headerHasError( XMLStreamReader streamReader ) throws XMLStreamException {

        boolean errorInHeader = false;

        while( streamReader.hasNext() ) {
            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "header" ) && ( streamReader.getEventType() == XMLStreamConstants.END_ELEMENT ) ) {
                break;
            }
            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "action" ) && new String( streamReader.getElementText() ).equalsIgnoreCase( "errorrs" ) ) {
                errorInHeader = true;
            }
            streamReader.next();
        }
        return errorInHeader;
    }

    private void handleMessageFault( XMLStreamReader streamReader ) throws XMLStreamException {

        StringBuffer buffer = new StringBuffer( "SOAP Message contains Fault section\n" );

        String faultCode = null;
        String faultString = null;
        String stackTrace = null;

        while( streamReader.hasNext()
                && ! ( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "fault" ) && ( streamReader.getEventType() == XMLStreamConstants.END_ELEMENT ) ) ) {

            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultcode" ) ) {
                faultCode = new String( streamReader.getElementText() );
            }
            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultstring" )) {
                faultString = new String( streamReader.getElementText() );
            }
            if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "stacktrace" )) {
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

}
