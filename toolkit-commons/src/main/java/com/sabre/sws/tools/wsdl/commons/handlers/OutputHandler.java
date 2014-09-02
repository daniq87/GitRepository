package com.sabre.sws.tools.wsdl.commons.handlers;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class OutputHandler extends AbstractHandler {

    private static final Logger LOGGER = LogManager.getLogger(OutputHandler.class.getName());

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {

        LOGGER.info( "OutputHandler invoke" );

        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        StringBuffer buffer = new StringBuffer();
        buffer.append( XMLPrettifier.pretify(header.toString()) );
        buffer.append( XMLPrettifier.pretify(body.toString()) );
        String formattedMessage = buffer.toString();
        LOGGER.debug( formattedMessage );

        return InvocationResponse.CONTINUE;
    }
}
