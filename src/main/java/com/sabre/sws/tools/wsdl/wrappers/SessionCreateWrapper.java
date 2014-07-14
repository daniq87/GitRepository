package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.exceptions.WorldIsGoingToEndException;
import com.sabre.sws.tools.wsdl.stubs.SessionCreateRQServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.wrappers.helpers.SessionCreateHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.engine.AxisConfiguration;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionCreateWrapper extends SessionCreateRQServiceStub {

    private IConfigurationProvider configuration = null;

    private final String prodRegex = ".*?webservices\\.sabre\\.com.*?";

    private final static Logger LOGGER = Logger.getLogger( SessionCreateWrapper.class.getName() );

    public SessionCreateWrapper( ConfigurationContext configurationContext, IConfigurationProvider configuration ) throws AxisFault {
        super( configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
    }

    public SessionCreateWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super( ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ), configuration.getEndpoint() );
        this.configuration = configuration;
    }

    public SessionCreateRS openSession() throws RemoteException {

        if( configuration.isProxyRequired() ) {
            setUpProxy();
        }

        if( configuration.getEndpoint().matches( prodRegex ) ) {
            throw new WorldIsGoingToEndException();
        }

        SessionCreateHelper helper = new SessionCreateHelper();

        SessionCreateRQ messageBody = helper.getSessionCreateRQInstance( configuration );
        Security security = helper.getSecurityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );

        AxisConfiguration cfg = _getServiceClient().getAxisConfiguration();
        List list = new ArrayList();        // TODO: Can we do anything with it?
        list.add( new MustUnderstandHandler());
        cfg.setInPhasesUptoAndIncludingPostDispatch( list );
        cfg.setInFaultPhases( list );

        SessionCreateRS responseBody = sessionCreateRQ( messageBody, header, security );

        return responseBody;

    }

    public void setUpProxy() {
        final String authUser = configuration.getProxyUsername();
        final String authPassword = configuration.getProxyPassword();

        Authenticator.setDefault(
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(authUser, authPassword.toCharArray());
                    }
                });

        System.setProperty( "http.proxyUser", authUser );
        System.setProperty( "http.proxyPassword", authPassword );

        LOGGER.log(Level.INFO, "Proxy gas been set up" );
    }

}
