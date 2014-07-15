package com.sabre.sws.tools.wsdl.client;

import com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub;
import com.sabre.sws.tools.wsdl.stubs.SessionCloseRQServiceStub;
import com.sabre.sws.tools.wsdl.stubs.SessionCreateRQServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.PropertiesFileConfigurationSource;
import com.sabre.sws.tools.wsdl.wrappers.AirAvailWrapper;
import com.sabre.sws.tools.wsdl.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.wrappers.SessionCreateWrapper;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub.OTA_AirAvailRS;
import static com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub.OriginDestinationOption_type0;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SwsClient {

    private static IConfigurationProvider configuration;
    private static final String configFileLocation = "src/main/res/connection.properties";

    private static File configFile = null;

    private static final Logger LOGGER = Logger.getLogger( SwsClient.class.getName() );

    public static void main( String ... args ) {

        LOGGER.log(Level.INFO, "Starting client action");

        try {
            configFile = new File( configFileLocation );
            configuration = new PropertiesFileConfigurationSource( configFile );
        } catch( IOException e ) {
            LOGGER.log(Level.SEVERE, "Error reading configuration from a file", e);
            e.printStackTrace();
            System.exit( 1 );
        }

        try {
            SessionCreateWrapper sessionCreate = new SessionCreateWrapper( configuration );
            SessionCreateRQServiceStub.SessionCreateRS sessionCreateRS = sessionCreate.openSession();
            LOGGER.log(Level.INFO, "\nSession was Created");

            LOGGER.log( Level.INFO, "Executing AirAvail Request..." );
            AirAvailWrapper airAvail = new AirAvailWrapper( configuration );
            OTA_AirAvailServiceStub.OTA_AirAvailRS airAvailRS = airAvail.executeExampleRequest();

            processAirAvailInfo( airAvailRS );

            LOGGER.log(Level.INFO, "\nClosing session...");
            SessionCloseWrapper sessionClose = new SessionCloseWrapper( configuration );
            SessionCloseRQServiceStub.SessionCloseRS sessionCloseRS = sessionClose.closeSession();


        } catch ( RemoteException e ) {
            LOGGER.log(Level.SEVERE, "Error connecting to web service", e);
            e.printStackTrace();
        }
    }


    private static void processAirAvailInfo( OTA_AirAvailRS response ) {

        System.out.println(response.getOriginDestinationOptions().getOriginDestinationOption().length + " possibilites found");

        System.out.println( "Travel descriptions: " );
        for( OriginDestinationOption_type0 option: response.getOriginDestinationOptions().getOriginDestinationOption() ) {

            String number           = option.getRPH();
            String departureDate    = option.getFlightSegment()[0].getDepartureDateTime().toString().replace( 'T', ' ' );
            String arrivalDate      = option.getFlightSegment()[0].getArrivalDateTime().toString().replace( 'T', ' ' );
            String eTicketAvailable = option.getFlightSegment()[0].getETicket() ? "yes" : "no";
            String smokingLabel     = option.getFlightSegment()[0].getSmokingAllowed() ? "" : "not " + "allowed";

            System.out.print( number + ".\t" + " Departure:\t" + departureDate );
            System.out.print( ",\tArrival:\t" + arrivalDate );

            System.out.print( ",\te-ticket: " + eTicketAvailable + ",\tSmoking: " + smokingLabel );

            System.out.println( "" );
        }

    }

}
