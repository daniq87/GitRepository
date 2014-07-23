package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.EnhancedAirBookServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.wrappers.helpers.EnhancedAirBookHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/21/2014.
 */
public class EnhancedAirBookWrapper extends EnhancedAirBookServiceStub {

    private final IConfigurationProvider configuration;

    public EnhancedAirBookWrapper(ConfigurationContext configurationContext, IConfigurationProvider configuration ) throws AxisFault {
        super( configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public EnhancedAirBookWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ), configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public EnhancedAirBookRS executeSampleRequest() throws RemoteException {

        EnhancedAirBookHelper helper = new EnhancedAirBookHelper();

        Security1 secuirty = helper.getSecurityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );
        EnhancedAirBookRQ requestBody = helper.getRequestBody( configuration );

        EnhancedAirBookRS responseBody = enhancedAirBookRQ( requestBody, header, secuirty );
        return responseBody;
    }
}
