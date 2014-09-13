package com.sabre.sws.tools.wsdl.axis2.adb.client;

import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.*;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.*;
import com.sabre.sws.tools.wsdl.stubs.adb.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 *
 * This is sample Sabre Web Services client application, provided for Sabre Clients as an example
 * on how to consume Sabre Web Services using Apache Axis2 framework and Apache ADB data binding.
 *
 * SwsClient's class main() method is an entry point of this application.
 * It subsequently calls methods to make 6 Sabre Web Services calls:
 *
 *  - SessionCreateRQ           (session management service)
 *  - OTA_AirAvailLLSRQ         (low level service)
 *  - TravelItineraryReadLLSRQ  (low level service)
 *  - EnhancedAirBookRQ         (orchestrated service)
 *  - PassengerDetailsRQ        (orchestrated service)
 *  - SessionCloseRQ            (session management service)
 *
 * For each service call a request body is constructed, proper SOAP headers are set
 * and a response body is retrieved.
 *
 * One may use this template to make own Sabre Web Services calls and process their result
 * to implement any business logic that is needed.
 *
 */
public class SwsClient {

    private static IConfigurationProvider configuration = Util.getConfigurationProvider();

    private static final Logger LOGGER = LogManager.getLogger(SwsClient.class.getName());

    private static final boolean enableMonitor = true;

    public static void main( String ... args ) {

        LOGGER.info( "Starting client action");

        addCloseSessionOnExitShutdownHook();

        addHandlers();

        try {

            createSession();
            invokeOTAAirAvailRequest();
            invokeTravelItineraryRead();
            invokeEnhancedAirBook();
            invokePassengerDetails();

        } catch ( RemoteException e ) {

            LOGGER.fatal("Error connecting to web service", e);
        } finally {

            // Close session
            try {
                LOGGER.info( "\nClosing session..." );
                closeSession();
            } catch ( RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addCloseSessionOnExitShutdownHook() {
        Runtime.getRuntime().addShutdownHook( new Thread( new Runnable() {
            @Override
            public void run() {
                if(SessionManager.getInstance().isSessionActive()) {
                    try {
                        closeSession();
                    } catch (RemoteException e) {
                        LOGGER.error( e );
                    }
                }
            }
        }));
    }

    private static void addHandlers() {

        MessageHandlerManager.addLogPhaseHandler(new OutputHandler());
        MessageHandlerManager.addErrorPhaseHandler(new ErrorHandler());
        MessageHandlerManager.addDispatchPhaseHandler(new MustUnderstandHandler());
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

        OTA_AirAvailServiceStub.OTA_AirAvailRS airAvailRS = airAvail.executeSampleRequest(AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_DATE );
        airAvailRS = airAvail.executeSampleRequest( AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_HOUR );
    }

    private static void invokeTravelItineraryRead() throws RemoteException {

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
    }

    private static void invokePassengerDetails() throws RemoteException {

        PassengerDetailsRQWrapper passengerDetails;

        LOGGER.info( "Executing PassengerDetails request..." );
        passengerDetails = new PassengerDetailsRQWrapper( configuration );
        PassengerDetailsServiceStub.PassengerDetailsRS passengerDetailsRS = passengerDetails.executeSampleRequest();

    }

    private static void closeSession() throws RemoteException {

        SessionCloseWrapper sessionClose;
        sessionClose = new SessionCloseWrapper(configuration);

        SessionCloseRQServiceStub.SessionCloseRS sessionCloseRS = sessionClose.closeSession();

    }

}
