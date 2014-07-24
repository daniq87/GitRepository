package com.sabre.sws.tools.wsdl.commons.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.LogMonitor;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class OutputHandler extends AbstractHandler {

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {
        System.out.println( "OutputHandler:" );
        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        LogMonitor.logString(header.toString(), body.toString());

        return InvocationResponse.CONTINUE;
    }
}
