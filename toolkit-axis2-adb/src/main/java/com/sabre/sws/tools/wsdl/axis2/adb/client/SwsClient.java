package com.sabre.sws.tools.wsdl.axis2.adb.client;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.*;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.PropertiesFileConfigurationSource;
import com.sabre.sws.tools.wsdl.stubs.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SwsClient {

    private static IConfigurationProvider configuration;
    private static final String configFileLocation = "toolkit-axis2-adb/src/main/resources/connection.properties"; // TODO: resources as bundle

    private static File configFile = null;

    private static final Logger LOGGER = LogManager.getLogger(SwsClient.class.getName());

    public static void main( String ... args ) {

        LOGGER.info( "Starting client action");

        addHandlers();

        SessionCloseWrapper sessionClose;

        try {
            readConfiguration();
        } catch( IOException e ) {
            LOGGER.fatal( "Error reading configuration from a file", e);
            return;
        }

        try {

            createSession();
            invokeOTAAirAvailRequest();
            invokeAirItinerary();
            invokeEnhancedAirBook();
            invokePassengerDetails();

        } catch ( RemoteException e ) {

            LOGGER.fatal( "Error connecting to web service", e );
            System.out.println(  );
            e.printStackTrace();

        } finally {

            // Close session
            try {

                LOGGER.info( "\nClosing session..." );
                sessionClose = new SessionCloseWrapper(configuration);
                SessionCloseRQServiceStub.SessionCloseRS sessionCloseRS = sessionClose.closeSession();

            } catch ( RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addHandlers() {

        MessageHandlerManager.addHandler( new MustUnderstandHandler() );
        MessageHandlerManager.addHandler( new ErrorHandler() );
        MessageHandlerManager.addHandler( new OutputHandler() );
    }

    private static void readConfiguration() throws IOException {

        configFile = new File( configFileLocation );
        configuration = new PropertiesFileConfigurationSource( configFile );
        LOGGER.info( "Configuration loaded" );
    }

    private static void createSession() throws RemoteException {

        SessionCreateWrapper sessionCreate;

        sessionCreate = new SessionCreateWrapper( configuration );
        SessionCreateRQServiceStub.SessionCreateRS sessionCreateRS = sessionCreate.openSession();
        LOGGER.info( "\nSession was Created");

    }

    private static void invokeOTAAirAvailRequest() throws RemoteException {

        AirAvailWrapper airAvail;

        LOGGER.info( "Executing AirAvail Request..." );
        airAvail = new AirAvailWrapper( configuration );

        OTA_AirAvailServiceStub.OTA_AirAvailRS airAvailRS = airAvail.executeSampleRequest( 0 );
        processAirAvailInfo( airAvailRS );

        airAvailRS = airAvail.executeSampleRequest( 1 );
        processAirAvailInfo( airAvailRS );

    }

    private static void invokeAirItinerary() throws RemoteException {

        TravelItineraryReadWrapper travelItinerary;

        LOGGER.info( "Executing TravelItineraryRead request..." );
        travelItinerary = new TravelItineraryReadWrapper( configuration );
        TravelItineraryReadServiceStub.TravelItineraryReadRS travelItineraryReadRS = travelItinerary.executeSampleRequest();

    }

    private static void invokeEnhancedAirBook() throws RemoteException {

        EnhancedAirBookWrapper enhancedAirBook;

        LOGGER.info( "Executing EnhancedAirBook request...");
        enhancedAirBook = new EnhancedAirBookWrapper( configuration );
        EnhancedAirBookServiceStub.EnhancedAirBookRS enhancedAirBookRS = enhancedAirBook.executeSampleRequest();
        processEnhancedAirBookInfo( enhancedAirBookRS );

    }

    private static void invokePassengerDetails() throws RemoteException {

        PassengerDetailsRQWrapper passengerDetails;

        LOGGER.info( "Executing PassengerDetails request..." );
        passengerDetails = new PassengerDetailsRQWrapper( configuration );
        PassengerDetailsServiceStub.PassengerDetailsRS passengerDetailsRS = passengerDetails.executeSampleRequest();

    }

    private static void processAirAvailInfo( OTA_AirAvailServiceStub.OTA_AirAvailRS response ) {

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
