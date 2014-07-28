package com.sabre.sws.tools.wsdl.commons.handlers;

import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by SG0221139 on 7/15/2014.
 */
public class ErrorHandler extends AbstractHandler {

    Logger LOGGER = Logger.getLogger( ErrorHandler.class.getName() );

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {

        LOGGER.log( Level.INFO, "ErrorHandler invoke" );

        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader  header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        if( ! body.hasFault() ) {
            return InvocationResponse.CONTINUE;
        }

        LOGGER.log( Level.SEVERE, "Service responsed with error code" );

        XMLStreamReader streamReader = body.getXMLStreamReader();

        try {
            while( streamReader.hasNext() ) {

                if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultcode" ) ) {
                    LOGGER.log( Level.INFO, "faultcode: " + streamReader.getElementText() );
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultstring" ) ) {
                    LOGGER.log( Level.INFO, "faultstring: " + streamReader.getElementText() );
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "stacktrace" ) ) {
                    LOGGER.log( Level.INFO, "stacktrace: " + streamReader.getElementText() );
                }
                streamReader.next();
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return InvocationResponse.ABORT;
    }
}
