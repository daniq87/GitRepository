package com.sabre.sws.tools.wsdl.commons.handlers;

import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

import javax.xml.stream.XMLStreamException;

/**
 * Created by SG0221139 on 7/15/2014.
 */
public class ErrorHandler extends AbstractHandler {

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {
        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader  header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        try {
            if( body.hasFault() )  {
                System.out.println( "Error handler: " + body.getFault().toStringWithConsume() );
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return InvocationResponse.CONTINUE;
    }
}
