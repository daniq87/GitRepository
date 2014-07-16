package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.exceptions.WorldIsGoingToEndException;
import com.sabre.sws.tools.wsdl.stubs.SessionCloseRQServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.wrappers.helpers.SessionCloseHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionCloseWrapper extends SessionCloseRQServiceStub {

    private IConfigurationProvider configuration;
    private final String prodRegex = ".*?webservices\\.sabre\\.com.*?";

    public SessionCloseWrapper( ConfigurationContext configurationContext, IConfigurationProvider configuration ) throws AxisFault {
        super( configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public SessionCloseWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super( ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null), configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public SessionCloseRS closeSession() throws RemoteException {

        if( configuration.getEndpoint().matches( prodRegex ) ) {
            throw new WorldIsGoingToEndException();
        }

        SessionCloseHelper helper = new SessionCloseHelper();

        Security security = helper.getSecurityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );
        SessionCloseRQ body = helper.getSessionCloseRQInstance( configuration );

        SessionCloseRS responseBody = sessionCloseRQ( body, header, security );

        return responseBody;

    }

}
