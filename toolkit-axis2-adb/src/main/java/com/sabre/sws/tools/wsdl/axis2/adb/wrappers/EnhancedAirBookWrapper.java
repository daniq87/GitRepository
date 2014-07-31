package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.EnhancedAirBookHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.stubs.adb.EnhancedAirBookServiceStub;
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

        System.out.println( "Executing EnhancedAirBook\n\tBooking:" );
        System.out.print( "\t\tFlight " + requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0].getFlightNumber()
            + " at " + requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0].getDepartureDateTime() );
        FlightSegment_type1 fs = requestBody.getOTA_AirBookRQ().getOriginDestinationInformation().getFlightSegment()[0];
        System.out.print( "\t\tFrom " + fs.getOriginLocation().getLocationCode() + " to " + fs.getDestinationLocation().getLocationCode() );
        System.out.print( "\t\tNumber of passengers: " + fs.getNumberInParty() );
        PassengerType_type1 [] pt = requestBody.getOTA_AirPriceRQ().getPriceRequestInformation().getOptionalQualifiers().getPricingQualifiers().getPassengerType();
        System.out.print( "\n\tPricing:\n\t\t" );
        for( PassengerType_type1 passenger : pt ) {
            System.out.println( "Code: " + passenger.getCode() + ", quantity: " + passenger.getQuantity() );
        }

        EnhancedAirBookRS responseBody = enhancedAirBookRQ( requestBody, header, secuirty );
        return responseBody;
    }
}
