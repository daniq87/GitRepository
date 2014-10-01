package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import org.apache.commons.io.IOUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapPreProtocolOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by SG0221139 on 9/11/2014.
 *
 * This is an interceptor class for Sabre Web Services' CXF client application.
 * It is responsible for logging out messages' content.
 */
public class LoggingOutInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LoggingOutInterceptor.class );

    public LoggingOutInterceptor() {
            super(Phase.PRE_STREAM);
            addBefore(SoapPreProtocolOutInterceptor.class.getName());

    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        try {
            logMessageContent(message);
        } catch (IOException e) {
            logAndRethrow(e);
        }
    }

    private void logAndRethrow(IOException e) {
        LOGGER.error( e );
        throw new RuntimeException(e);
    }

    private void logMessageContent(SoapMessage message) throws IOException {

        OutputStream originalMessageOutputStream = message.getContent(OutputStream.class);

        message.setContent(OutputStream.class, new CachedOutputStream());
        message.getInterceptorChain().doIntercept(message);

        CachedOutputStream csnew = (CachedOutputStream) message.getContent(OutputStream.class);
        String currentEnvelopeMessage = IOUtils.toString(csnew.getInputStream(), "UTF-8");
        csnew.flush();
        IOUtils.closeQuietly(csnew);
        InputStream replaceInStream = IOUtils.toInputStream(currentEnvelopeMessage, "UTF-8");

        IOUtils.copy(replaceInStream, originalMessageOutputStream);
        IOUtils.closeQuietly(replaceInStream);

        String formattedLogMessage = XMLPrettifier.pretify(currentEnvelopeMessage);
        String logMessage = "Outgoing request:\n\n" + formattedLogMessage;
        LOGGER.info(logMessage);

        originalMessageOutputStream.flush();
        message.setContent(OutputStream.class, originalMessageOutputStream);
        IOUtils.closeQuietly(originalMessageOutputStream);
    }
}
