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
 *
 * This is a logger class for Apache Axis2 framework.
 * It is responsible for logging the messages going in and out.
 *
 */
public class OutputHandler extends AbstractHandler {

    public static final int OUT_HANDLER = 1;
    public static final int IN_HANDLER = 2;

    private final int HANDLER_TYPE;

    public OutputHandler( int handlerType ) {
        super();
        if( handlerType != OUT_HANDLER && handlerType != IN_HANDLER ) {
            throw new IllegalArgumentException();
        }
        this.HANDLER_TYPE = handlerType;
    }

    private static final Logger LOGGER = LogManager.getLogger(OutputHandler.class.getName());

    @Override
    public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {

        LOGGER.info( "OutputHandler invoke" );

        System.out.println(messageContext.getProperties().keySet());
        SOAPEnvelope envelope = messageContext.getEnvelope();
        SOAPHeader header = envelope.getHeader();
        SOAPBody body = envelope.getBody();

        StringBuffer buffer = new StringBuffer();

        if( this.HANDLER_TYPE == OUT_HANDLER ) {
            buffer.append( "\nOutgoing request:\n" );
        } else {
            buffer.append( "\nIncoming response:\n");
        }

        buffer.append( XMLPrettifier.pretify(header.toString()) );
        buffer.append( XMLPrettifier.pretify(body.toString()) );
        String formattedMessage = buffer.toString();
        LOGGER.debug( formattedMessage );

        return InvocationResponse.CONTINUE;
    }
}
