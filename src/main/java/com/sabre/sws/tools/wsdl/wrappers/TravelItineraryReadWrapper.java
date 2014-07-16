package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.TravelItineraryReadServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.wrappers.helpers.TravelItineraryHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class TravelItineraryReadWrapper extends TravelItineraryReadServiceStub {

    private final IConfigurationProvider configuration;

    public TravelItineraryReadWrapper(ConfigurationContext configurationContext, IConfigurationProvider configuration) throws AxisFault {
        super(configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public TravelItineraryReadWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ), configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public TravelItineraryReadRS executeSampleRequest() throws RemoteException {

        TravelItineraryReadRS responseBody;

        TravelItineraryReadRQ requestBody;
        Security1 security;
        MessageHeader header;

        TravelItineraryHelper helper = new TravelItineraryHelper();

        security = helper.getSecuirityInstance( configuration );
        header = helper.getMessageHeaderInstance( configuration );
        requestBody = helper.getTravelItineraryRQ("HNDAGG");

        responseBody = travelItineraryReadRQ( requestBody, header, security );

        return responseBody;
    }

}
