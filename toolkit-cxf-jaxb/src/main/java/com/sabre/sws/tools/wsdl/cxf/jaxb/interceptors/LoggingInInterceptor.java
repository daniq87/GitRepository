package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SoapMessageUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by SG0221139 on 9/11/2014.
 */
public class LoggingInInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LoggingInInterceptor.class );

    public LoggingInInterceptor() {
        super( Phase.RECEIVE );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        try {
            logMessageContent(message);
        } catch (IOException e) {
            throw new Fault(e);
        }
    }

    private void logMessageContent(SoapMessage message) throws IOException {
        CachedOutputStream messageCopyStream = SoapMessageUtils.copyMessageIntoStream(message);
        String formattedMessage = XMLPrettifier.pretify(messageCopyStream.getInputStream());
        String logMessage = "Incoming response:\n\n" + formattedMessage;
        LOGGER.info(logMessage);
    }

}
