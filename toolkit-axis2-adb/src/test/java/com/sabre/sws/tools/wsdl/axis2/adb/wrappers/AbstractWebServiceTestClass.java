package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.EditablePropertiesFileConfigurationSource;
import com.sabre.sws.tools.wsdl.commons.utils.IEditableConfiguration;
import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.mockserver.integration.ClientAndProxy;
import org.mockserver.integration.ClientAndServer;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import static org.mockserver.integration.ClientAndProxy.startClientAndProxy;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;

/**
 * Created by SG0221139 on 7/25/2014.
 */
public class AbstractWebServiceTestClass {

    private static final Logger LOGGER = LogManager.getLogger( AbstractWebServiceTestClass.class );

    protected static ClientAndProxy proxy;
    protected static ClientAndServer mockServer;

    protected String configFileLocation = "src/test/resources/connection.properties";
    protected static IEditableConfiguration configuration = null;

    private static int serverPortNumber;
    private static int proxyPortNumber;

    @Before
    public void startProxy() throws AxisFault {


        File configFile;
        try {
            configFile = new File( configFileLocation );
            configuration = new EditablePropertiesFileConfigurationSource( configFile );
        } catch( IOException e ) {
            e.printStackTrace();
        }

        ServerSocket ssa;
        ServerSocket ssb;

        try {
            // ServerSocker( 0 ) constructor finds and allocates free port at runtime
            ssa = new ServerSocket( 0 );
            ssb = new ServerSocket( 0 );
            serverPortNumber = ssa.getLocalPort();
            proxyPortNumber = ssb.getLocalPort();
            ssa.close();
            ssb.close();
            configuration.setEndpoint( "http://localhost:" + Integer.toString( serverPortNumber ) );
        } catch (IOException e) {
            e.printStackTrace();
        }

        mockServer = startClientAndServer( serverPortNumber );
        LOGGER.debug("Port number: " + serverPortNumber);
        proxy = startClientAndProxy( proxyPortNumber );
    }

    @After
    public void stopProxy() {
        proxy.stop();
        mockServer.stop();
    }

}
