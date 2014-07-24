package com.sabre.sws.tools.wsdl.axis2.adb.client;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.*;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.PropertiesFileConfigurationSource;
import com.sabre.sws.tools.wsdl.stubs.*;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SwsClient {

    private static IConfigurationProvider configuration;
    private static final String configFileLocation = "toolkit-axis2-adb/src/main/resources/connection.properties";

    private static File configFile = null;

    private static final Logger LOGGER = Logger.getLogger( SwsClient.class.getName() );

    public static void main( String ... args ) {

        LOGGER.log(Level.INFO, "Starting client action");

        MessageHandlerManager.addHandler( new MustUnderstandHandler() );
        MessageHandlerManager.addHandler( new ErrorHandler() );
        MessageHandlerManager.addHandler( new OutputHandler() );

        SessionCreateWrapper sessionCreate;
        SessionCloseWrapper sessionClose;
        AirAvailWrapper airAvail;
        TravelItineraryReadWrapper travelItinerary;
        EnhancedAirBookWrapper enhancedAirBook;
        PassengerDetailsRQWrapper passengerDetails;

        try {
            configFile = new File( configFileLocation );
            configuration = new PropertiesFileConfigurationSource( configFile );
            LOGGER.log( Level.INFO, "Configuration loaded" );
        } catch( IOException e ) {
            LOGGER.log(Level.SEVERE, "Error reading configuration from a file", e);
            return;
        }

        try {

            // Create Session
            sessionCreate = new SessionCreateWrapper( configuration );
            SessionCreateRQServiceStub.SessionCreateRS sessionCreateRS = sessionCreate.openSession();
            LOGGER.log(Level.INFO, "\nSession was Created");

            // Execute and process OTA_AirAvailRequest
            LOGGER.log( Level.INFO, "Executing AirAvail Request..." );
            airAvail = new AirAvailWrapper( configuration );

            OTA_AirAvailServiceStub.OTA_AirAvailRS airAvailRS = airAvail.executeSampleRequest( 0 );
            processAirAvailInfo( airAvailRS );

            airAvailRS = airAvail.executeSampleRequest( 1 );
            processAirAvailInfo( airAvailRS );

            // Execute and process TravelItinerary request
            LOGGER.log( Level.INFO, "Executing TravelItineraryRead request..." );
            travelItinerary = new TravelItineraryReadWrapper( configuration );
            TravelItineraryReadServiceStub.TravelItineraryReadRS travelItineraryReadRS = travelItinerary.executeSampleRequest();

            // Execute and process EnhancedAirBook request
            LOGGER.log( Level.INFO, "Executing EnhancedAirBook request...");
            enhancedAirBook = new EnhancedAirBookWrapper( configuration );
            EnhancedAirBookServiceStub.EnhancedAirBookRS enhancedAirBookRS = enhancedAirBook.executeSampleRequest();
            processEnhancedAirBookInfo( enhancedAirBookRS );

            // Execute and process PassengerDetails request
            LOGGER.log( Level.INFO, "Executing PassengerDetails request..." );
            passengerDetails = new PassengerDetailsRQWrapper( configuration );
            PassengerDetailsServiceStub.PassengerDetailsRS passengerDetailsRS = passengerDetails.executeSampleRequest();

        } catch ( RemoteException e ) {
            LOGGER.log(Level.SEVERE, "Error connecting to web service", e);
            System.out.println(  );
            e.printStackTrace();
        } finally {
            // Close session
            LOGGER.log(Level.INFO, "\nClosing session...");
            try {
                sessionClose = new SessionCloseWrapper(configuration);
                SessionCloseRQServiceStub.SessionCloseRS sessionCloseRS = sessionClose.closeSession();

            } catch ( RemoteException e) {
                e.printStackTrace();
            }
        }
    }


    private static void processAirAvailInfo( OTA_AirAvailServiceStub.OTA_AirAvailRS response ) {

//        System.out.println( response.get );

        System.out.println(response.getOriginDestinationOptions().getOriginDestinationOption().length + " possibilites found");

        System.out.println( "Travel descriptions: " );
        for( OTA_AirAvailServiceStub.OriginDestinationOption_type0 option: response.getOriginDestinationOptions().getOriginDestinationOption() ) {

            for( int i = 0; i < option.getFlightSegment().length; ++i ) {

                String number = option.getRPH() + "." + String.valueOf( i + 1 );
                String departureDate = option.getFlightSegment()[i].getDepartureDateTime().toString().replace('T', ' ');
                String arrivalDate = option.getFlightSegment()[i].getArrivalDateTime().toString().replace('T', ' ');
                String eTicketAvailable = option.getFlightSegment()[i].getETicket() ? "yes" : "no";
                String smokingLabel = option.getFlightSegment()[i].getSmokingAllowed() ? "" : "not " + "allowed";

                System.out.print(number + ".\t" + " Departure:\t" + departureDate);
                System.out.print(",\tArrival:\t" + arrivalDate);

                System.out.print(",\te-ticket: " + eTicketAvailable + ",\tSmoking: " + smokingLabel);

                System.out.println("");
            }
        }
    }

    private static  void processEnhancedAirBookInfo( EnhancedAirBookServiceStub.EnhancedAirBookRS response ) {
        for( EnhancedAirBookServiceStub.AirItineraryPricingInfo_type0 it : response.getOTA_AirPriceRS().getPriceQuote().getPricedItinerary().getAirItineraryPricingInfo() ) {
            System.out.println( it.getItinTotalFare().getTotalFare().getAmount() );
            System.out.println( it.getFareCalculation().getText() );
        }
    }

}
