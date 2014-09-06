package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.TravelItineraryHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.stubs.adb.TravelItineraryReadServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/16/2014.
 *
 * Wrapper classes are convenience classes for the purpose of constructing example requests
 * Below pattern may be used to construct requests accordingly to Sabre client's application
 * business logic, or may just serve as a demonstration on how to use Axis2 and ADB technologies
 * to consume Sabre Web Services.
 *
 */
public class TravelItineraryReadWrapper extends TravelItineraryReadServiceStub {

    private static final Logger LOGGER = LogManager.getLogger(TravelItineraryReadWrapper.class);

    private final IConfigurationProvider configuration;

    public TravelItineraryReadWrapper(ConfigurationContext configurationContext, IConfigurationProvider configuration) throws AxisFault {
        super(configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub(this);
    }

    public TravelItineraryReadWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ), configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public TravelItineraryReadRS executeSampleRequest() throws RemoteException {

        TravelItineraryReadRS responseBody;

        TravelItineraryReadRQ requestBody;
        TravelItineraryReadServiceStub.Security5 security;
        MessageHeader header;

        TravelItineraryHelper helper = new TravelItineraryHelper();

        security = helper.getSecuirityInstance( configuration );
        header = helper.getMessageHeaderInstance( configuration );
        requestBody = helper.getTravelItineraryRQ("HNDAGG");

        LOGGER.info( "Invoking TravelItineraryRead for PNR: HNDAGG" );
        responseBody = travelItineraryReadRQ( requestBody, header, security );

        return responseBody;
    }

    public TravelItineraryReadRS getCreatedPNR() throws RemoteException {

        TravelItineraryReadRQ instance = new TravelItineraryReadRQ();

        instance.setVersion(ServicesVersionsProvider.getTravelItineraryVersion());

        MessagingDetails_type0 msgDetails = new MessagingDetails_type0();
        Transaction_type0 transaction = new Transaction_type0();
        Code_type0 code = Code_type0.PNR;
        transaction.setCode( code );

        msgDetails.addTransaction( transaction );

        instance.setMessagingDetails(msgDetails);

        TravelItineraryReadServiceStub.Security5 security;
        MessageHeader header;

        TravelItineraryHelper helper = new TravelItineraryHelper();

        security = helper.getSecuirityInstance( configuration );
        header = helper.getMessageHeaderInstance( configuration );

        return travelItineraryReadRQ( instance, header, security );
    }

}
