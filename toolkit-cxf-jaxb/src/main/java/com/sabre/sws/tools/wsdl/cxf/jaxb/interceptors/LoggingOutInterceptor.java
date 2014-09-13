package com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors;

import com.sabre.sws.tools.wsdl.commons.utils.XMLPrettifier;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapActionInInterceptor;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

/**
 * Created by SG0221139 on 9/11/2014.
 */
public class LoggingOutInterceptor extends AbstractSoapInterceptor {

    private static final Logger LOGGER = LogManager.getLogger( LoggingInInterceptor.class );

    public LoggingOutInterceptor() {
        super( Phase.SEND );
        addAfter(SoapActionInInterceptor.class.getName());
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

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

                String formattedMessage = XMLPrettifier.pretify(cos.getInputStream());
                LOGGER.info( formattedMessage );
            } catch (IOException e) {
                throw new Fault(e);
            }
        }

    }
}
