package com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.SessionCreateRQFactory;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.stubs.xmlbeans.SessionCreateRQServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.opentravel.www.ota._2002._11.SessionCreateRSDocument;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SessionCreateWrapper extends SessionCreateRQServiceStub {

    private final IConfigurationProvider configuration;

    public SessionCreateWrapper(IConfigurationProvider configuration) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ),
                configuration.getEndpoint() );
        this.configuration = configuration;

    }

    public SessionCreateRSDocument openSession() throws RemoteException {
        return sessionCreateRQ(SessionCreateRQFactory.getSessionCreateRQ( configuration ), MessageHeaderFactory.getMessageHeader( configuration ), SecurityFactory.getSecuirtyDocument( configuration ) );
    }
}
