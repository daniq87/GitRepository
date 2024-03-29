package com.sabre.sws.tools.wsdl.axis2.xmlbeans.client;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.AirAvailWrapper;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCreateWrapper;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opentravel.www.ota._2002._11.SessionCreateRSDocument;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/29/2014.
 *
 * This is sample Sabre Web Services client application, provided for Sabre Clients as an example
 * on how to consume Sabre Web Services using Apache Axis2 framework and Apache XMLBeans data binding.
 *
 * SwsClient's class main() method is an entry point of this application.
 * It subsequently calls methods to make 3 Sabre Web Services calls:
 *
 *  - SessionCreateRQ           (session management service)
 *  - OTA_AirAvailLLSRQ         (low level service)
 *  - SessionCloseRQ            (session management service)
 *
 * Calls to EnhancedAirBookRQ, PassengerDetailsRQ nad TravelItineraryReadLLSRQ are
 * impossible to make, because for these services XMLBeans generates stubs that are impossible
 * to compile. This issue is described in the documentation, that is distributed with this project.
 *
 * For each service call a request body is constructed, proper SOAP headers are set
 * and a response body is retrieved.
 *
 * One may use this template to make own Sabre Web Services calls and process their result
 * to implement any business logic that is needed.
 */
public class SwsClient {

    private static final Logger LOGGER = LogManager.getLogger( SwsClient.class );

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static void main( String ... args ) {

        addHandlers();
        addCloseSessionOnExitShutdownHook();

        try {
            openSession();

            executeOTAAirAvailRequests();

        } catch ( RemoteException e ) {
            LOGGER.error( e );
        } catch (Exception e ) {

        } finally {
        try {
                closeSession();
            } catch ( RemoteException e ) {
                LOGGER.error( e );
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

    public static void addHandlers() {
        MessageHandlerManager.addLogPhaseInHandler( new OutputHandler(OutputHandler.IN_HANDLER) );
        MessageHandlerManager.addLogPhaseOutHandler( new OutputHandler(OutputHandler.OUT_HANDLER) );
        MessageHandlerManager.addErrorPhaseHandler( new ErrorHandler() );
        MessageHandlerManager.addDispatchPhaseHandler( new MustUnderstandHandler() );
    }

    public static void openSession() throws RemoteException {
        SessionCreateWrapper stub = new SessionCreateWrapper( configuration );
        SessionCreateRSDocument document = stub.openSession();
    }

    public static void closeSession() throws RemoteException {
        SessionCloseWrapper sessionClose = new SessionCloseWrapper( configuration );
        sessionClose.closeSession();
    }

    public static void executeOTAAirAvailRequests() throws RemoteException {

        new AirAvailWrapper(configuration).executeSampleRequest(AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_DATE);
        new AirAvailWrapper(configuration).executeSampleRequest(AirAvailRequests.TWO_POINTS_WITH_DEPARTURE_HOUR);
        new AirAvailWrapper(configuration).executeSampleRequest(AirAvailRequests.TWO_POINTS_WITH_VENDOR_PREFS);
    }

}
