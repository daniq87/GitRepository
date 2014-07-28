package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.PropertiesFileConfigurationSource;
import org.apache.axis2.AxisFault;
import org.junit.After;
import org.junit.Before;
import org.mockserver.integration.ClientAndProxy;
import org.mockserver.integration.ClientAndServer;

import java.io.File;
import java.io.IOException;

import static org.mockserver.integration.ClientAndProxy.startClientAndProxy;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;

/**
 * Created by SG0221139 on 7/25/2014.
 */
public class AbstractWebServiceTestClass {

    protected static ClientAndProxy proxy;
    protected static ClientAndServer mockServer;

    protected String configFileLocation = "src/test/resources/connection.properties";
    protected static IConfigurationProvider configuration = null;

    @Before
    public void startProxy() throws AxisFault {


        File configFile;
        try {
            configFile = new File( configFileLocation );
            configuration = new PropertiesFileConfigurationSource( configFile );
        } catch( IOException e ) {
            e.printStackTrace();
        }

        mockServer = startClientAndServer(8783);
        proxy = startClientAndProxy(9090);
    }

    @After
    public void stopProxy() {
        proxy.stop();
        mockServer.stop();
    }

}
