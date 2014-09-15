package com.sabre.sws.tools.wsdl.commons.handlers;

import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * Created by SG0221139 on 7/15/2014.
 *
 * This is a handler class for Apache Axis2 framework.
 * It checks whether message's body contains any Fault sections,
 * and if so, it logs it using standard logger.
 */
public class ErrorHandler extends AbstractHandler {

    Logger LOGGER = LogManager.getLogger( ErrorHandler.class.getName() );

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {

        LOGGER.info( "ErrorHandler invoke" );

        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPBody body = envelope.getBody();

        if( ! envelope.hasFault() ) {
            return InvocationResponse.CONTINUE;
        }

        LOGGER.error( "Service responsed with error code" );

        XMLStreamReader streamReader = body.getXMLStreamReader();

        try {
            StringBuffer messageBuffer = new StringBuffer();
            while( streamReader.hasNext() ) {

                if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultcode" ) ) {
                    messageBuffer.append("faultcode: " + streamReader.getElementText()).append("\n");
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "faultstring" ) ) {
                    messageBuffer.append( "faultstring: " + streamReader.getElementText() ).append("\n");
                } else if( streamReader.hasName() && streamReader.getName().getLocalPart().equalsIgnoreCase( "stacktrace" ) ) {
                    messageBuffer.append( "stacktrace: " + streamReader.getElementText() ).append("\n");
                }
                streamReader.next();
            }
            LOGGER.error( messageBuffer.toString() );
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return InvocationResponse.ABORT;
    }
}
