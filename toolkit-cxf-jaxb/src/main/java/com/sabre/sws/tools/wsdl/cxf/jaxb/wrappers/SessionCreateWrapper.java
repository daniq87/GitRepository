package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.*;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SessionCreateFactory;
import org.apache.cxf.binding.soap.interceptor.MustUnderstandInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.wsdl.interceptors.BareOutInterceptor;

import javax.xml.ws.Holder;
import java.io.OutputStream;

/**
 * Created by SG0221139 on 8/5/2014.
 */

class MyLogInterceptor extends LoggingOutInterceptor {

    public MyLogInterceptor() {
        super(Phase.PRE_STREAM);
    }

    @Override
    public void handleMessage(Message message)  {
        OutputStream out = message.getContent(OutputStream.class);

        final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(out);
        message.setContent(OutputStream.class, newOut);
        newOut.registerCallback(new LoggingCallback());
        message.toString();
    }

    public class LoggingCallback implements CachedOutputStreamCallback {
        public void onFlush(CachedOutputStream cos) {
        }

        public void onClose(CachedOutputStream cos) {
            try {
                StringBuilder builder = new StringBuilder();
                cos.writeCacheTo(builder, limit);
                // here comes my xml:
                String soapXml = builder.toString();
                System.out.println( soapXml );
            } catch (Exception e) {
            }
        }
    }
}

public class SessionCreateWrapper {

    public SessionCreateRS openSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader(Util.getConfigurationProvider(), "SessionCreateRQ" );
        Security security = SecurityFactory.getSecurity( Util.getConfigurationProvider(), true );
        SessionCreateRQ body = SessionCreateFactory.getSessionCreate( Util.getConfigurationProvider() );

        Holder<MessageHeader> headerHolder = new Holder<>( header );
        Holder<Security> securityHolder = new Holder<> ( security );

        SessionCreateRQService service = new SessionCreateRQService();
        SessionCreatePortType stub = service.getSessionCreatePortType();
        Client client = ClientProxy.getClient(stub);
        Endpoint endpoint = client.getEndpoint();

        MustUnderstandInterceptor outMust = new MustUnderstandInterceptor( Phase.WRITE );
        LoggingOutInterceptor outLogging = new MyLogInterceptor();
        BareOutInterceptor outBare = new BareOutInterceptor();


        MustUnderstandInterceptor inMust = new MustUnderstandInterceptor( Phase.RECEIVE );
        LoggingInInterceptor inLogging = new LoggingInInterceptor( Phase.RECEIVE );

        endpoint.getOutInterceptors().add( outLogging );
        endpoint.getOutInterceptors().add( outMust );
        endpoint.getOutInterceptors().add( outBare );

        endpoint.getInInterceptors().add( inMust );
        endpoint.getInInterceptors().add( inLogging );

        return stub.sessionCreateRQ( headerHolder, securityHolder, body );
    }
}
