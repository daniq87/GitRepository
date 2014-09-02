package com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.SessionCloseRQFactory;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.stubs.xmlbeans.SessionCloseRQServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.opentravel.www.ota._2002._11.SessionCloseRSDocument;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SessionCloseWrapper extends SessionCloseRQServiceStub {

    private final IConfigurationProvider configuration;

    public SessionCloseWrapper(IConfigurationProvider configuration) throws AxisFault {
        super( ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null),
                configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public SessionCloseRSDocument closeSession() throws RemoteException {

        return sessionCloseRQ (
                SessionCloseRQFactory.getSessionCloseRQ( configuration ),
                MessageHeaderFactory.getMessageHeader( configuration, "SessionCloseRQ"),
                SecurityFactory.getSecuirtyDocument( configuration, false )
        );
    }

}
