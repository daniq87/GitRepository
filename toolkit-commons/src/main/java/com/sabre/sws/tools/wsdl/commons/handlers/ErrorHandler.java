package com.sabre.sws.tools.wsdl.commons.handlers;

import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * Created by SG0221139 on 7/15/2014.
 */
public class ErrorHandler extends AbstractHandler {

    Logger LOGGER = LogManager.getLogger( ErrorHandler.class.getName() );

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {

        LOGGER.info( "ErrorHandler invoke" );

        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader  header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        if( ! envelope.hasFault() ) {
            return InvocationResponse.CONTINUE;
        }

        LOGGER.error( "Service responsed with error code" );

        XMLStreamReader streamReader = body.getXMLStreamReader();

        try {
            while( streamReader.hasNext() ) {

                if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultcode" ) ) {
                    LOGGER.info( "faultcode: " + streamReader.getElementText() );
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultstring" ) ) {
                    LOGGER.info( "faultstring: " + streamReader.getElementText() );
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "stacktrace" ) ) {
                    LOGGER.info( "stacktrace: " + streamReader.getElementText() );
                }
                streamReader.next();
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return InvocationResponse.ABORT;
    }
}
