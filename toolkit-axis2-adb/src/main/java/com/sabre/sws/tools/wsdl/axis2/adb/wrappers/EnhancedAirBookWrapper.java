package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.EnhancedAirBookHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.stubs.adb.EnhancedAirBookServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/21/2014.
 *
 * Wrapper classes are convenience classes for the purpose of constructing example requests
 * Below pattern may be used to construct requests accordingly to Sabre client's application
 * business logic, or may just serve as a demonstration on how to use Axis2 and ADB technologies
 * to consume Sabre Web Services.
 *
 */
public class EnhancedAirBookWrapper extends EnhancedAirBookServiceStub {

    private static final Logger LOGGER = LogManager.getLogger(EnhancedAirBookWrapper.class);

    private final IConfigurationProvider configuration;

    public EnhancedAirBookWrapper(ConfigurationContext configurationContext, IConfigurationProvider configuration ) throws AxisFault {
        super( configurationContext, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub(this);
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

        StringBuffer outputMessageBuffer = new StringBuffer();

        outputMessageBuffer.append("Executing EnhancedAirBook\n\tBooking:\n");
        outputMessageBuffer.append("\t\tFlight " + requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0].getFlightNumber()
                + " at " + requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0].getDepartureDateTime());
        FlightSegment_type1 fs = requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0];
        outputMessageBuffer.append("\t\tFrom " + fs.getOriginLocation().getLocationCode() + " to " + fs.getDestinationLocation().getLocationCode());
        outputMessageBuffer.append("\t\tNumber of passengers: " + fs.getNumberInParty());
        PassengerType_type1 [] pt = requestBody.getOTA_AirPriceRQ().getPriceRequestInformation().getOptionalQualifiers().getPricingQualifiers().getPassengerType();
        outputMessageBuffer.append("\n\tPricing:\n\t\t");
        for( PassengerType_type1 passenger : pt ) {
            outputMessageBuffer.append("Code: " + passenger.getCode() + ", quantity: " + passenger.getQuantity());
        }

        LOGGER.info(outputMessageBuffer.toString());

        EnhancedAirBookRS responseBody = enhancedAirBookRQ( requestBody, header, secuirty );
        return responseBody;
    }
}
