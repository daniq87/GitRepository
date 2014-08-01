package com.sabre.sws.tools.wsdl.axis2.adb.client;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.*;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.LogMonitor;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.stubs.adb.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SwsClient {

    private static IConfigurationProvider configuration = Util.getConfigurationProvider();

    private static final Logger LOGGER = LogManager.getLogger(SwsClient.class.getName());

    private static final boolean enableMonitor = true;

    public static void main( String ... args ) {

        LogMonitor.setEnableMonitr( enableMonitor );

        LOGGER.info( "Starting client action");

        addHandlers();

        SessionCloseWrapper sessionClose;

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

        MessageHandlerManager.addHandler( new OutputHandler() );
        MessageHandlerManager.addHandler( new ErrorHandler() );
        MessageHandlerManager.addHandler( new MustUnderstandHandler() );
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

        processTravelItineraryDetail( travelItineraryReadRS );
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

        System.out.println( "\t" + response.getOriginDestinationOptions().getOriginDestinationOption().length + " possibilites found");

        System.out.println( "\tTravel descriptions: " );
        for( OTA_AirAvailServiceStub.OriginDestinationOption_type0 option: response.getOriginDestinationOptions().getOriginDestinationOption() ) {

            for( int i = 0; i < option.getFlightSegment().length; ++i ) {

                String number = option.getRPH() + "." + String.valueOf( i + 1 );
                String departureDate = option.getFlightSegment()[i].getDepartureDateTime().toString().replace('T', ' ');
                String arrivalDate = option.getFlightSegment()[i].getArrivalDateTime().toString().replace('T', ' ');
                String eTicketAvailable = option.getFlightSegment()[i].getETicket() ? "yes" : "no";
                String smokingLabel = option.getFlightSegment()[i].getSmokingAllowed() ? "" : "not " + "allowed";

                System.out.print( "\t\t" + number + ".\t" + " Departure:\t" + departureDate);
                System.out.print(",\tArrival:\t" + arrivalDate);

                System.out.print(",\te-ticket: " + eTicketAvailable + ",\tSmoking: " + smokingLabel);

                System.out.println("");
            }
        }
    }

    private static  void processEnhancedAirBookInfo( EnhancedAirBookServiceStub.EnhancedAirBookRS response ) {
        System.out.println( "\tItinerary booked and priced" );
        for( EnhancedAirBookServiceStub.AirItineraryPricingInfo_type0 it : response.getOTA_AirPriceRS().getPriceQuote().getPricedItinerary().getAirItineraryPricingInfo() ) {
            System.out.println( "\t\tTotal amount: " + it.getItinTotalFare().getTotalFare().getAmount() + " " + it.getItinTotalFare().getTotalFare().getCurrencyCode() );
            System.out.println( "\t\tTaxes: " + it.getItinTotalFare().getTaxes().getTotalAmount() );
//            System.out.println( it.getFareCalculation().getText() );
        }
    }

    private static void processTravelItineraryDetail( TravelItineraryReadServiceStub.TravelItineraryReadRS response ) {
        System.out.println( "Travel itinerary:" );
        TravelItineraryReadServiceStub.TravelItinerary_type0 itinerary = response.getTravelItinerary();

        System.out.println( "\tCustomer info:" );

        TravelItineraryReadServiceStub.PersonName_type1 personName = itinerary.getCustomerInfo().getPersonName()[0];
        System.out.println( "\t\t" + personName.getGivenName() + " " + personName.getSurname() );
        System.out.println( "\t\t" + personName.getEmail()[0].toString());

        TravelItineraryReadServiceStub.Address_type0 address = itinerary.getCustomerInfo().getAddress();

        for( String line : address.getAddressLine() ) {
            System.out.println( "\t\t" + line );
        }
        System.out.print( "\n\n\tTravel info:\n\n" );
        TravelItineraryReadServiceStub.ItineraryInfo_type0 info =  itinerary.getItineraryInfo();

        for(TravelItineraryReadServiceStub.Item_type0 item : info.getReservationItems().getItem() ) {
            TravelItineraryReadServiceStub.FlightSegment_type2 flightSegment = item.getFlightSegment();
            System.out.println( "\t\tFrom " + flightSegment.getOriginLocation().getLocationCode()
                + " to " + flightSegment.getDestinationLocation().getLocationCode() );
            System.out.println( "\t\tFlight number: " + flightSegment.getFlightNumber() );
            System.out.println( "\t\tMiles flown: " + flightSegment.getAirMilesFlown() );
            System.out.println( "\t\tDeparture date: " + flightSegment.getDepartureDateTime() );
            System.out.println( "\t\tArrival date: " + flightSegment.getArrivalDateTime() );
            System.out.println( "\t\tDuration time: " + flightSegment.getElapsedTime() );
            System.out.println( "\t\tAirline code: " + flightSegment.getMarketingAirline().getCode()  );

        }

    }

}
