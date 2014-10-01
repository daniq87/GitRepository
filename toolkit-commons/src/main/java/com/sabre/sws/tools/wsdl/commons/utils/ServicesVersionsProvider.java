package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0221139 on 7/28/2014.
 *
 * This class loads loads services' version from .properties file and make it available for the application code.
 */
public class ServicesVersionsProvider {

    private static final Logger LOGGER = LogManager.getLogger( ServicesVersionsProvider.class.getName() );

    private static final String OTA_AIR_AVAIL_VERSION;
    private static final String TRAVEL_ITINERARY_VERSION;
    private static final String ENHANCED_AIR_BOOK_VERSION;
    private static final String PASSENGER_DETAILS_VERSION;

    static {

        Properties properties = new Properties();
        String servicesVersionsFileName = "/service-versions.properties";

        try {
            InputStream inputStream = ServicesVersionsProvider.class.getResourceAsStream( servicesVersionsFileName );
            properties.load( inputStream );

            OTA_AIR_AVAIL_VERSION = properties.getProperty( "OTA_AirAvailLLSRQVersion" );
            TRAVEL_ITINERARY_VERSION = properties.getProperty( "TravelItineraryReadLLSRQVersion" );
            ENHANCED_AIR_BOOK_VERSION = properties.getProperty( "EnhancedAirBookRQVersion" );
            PASSENGER_DETAILS_VERSION = properties.getProperty( "PassengerDetailsRQVersion" );

        } catch (IOException e) {
            LOGGER.fatal( "Couldn't read services versions from file", e );
            throw new RuntimeException( "Couldn't load services versions" );
        }

    }

    public static String getOtaAirAvailVersion() {
        return OTA_AIR_AVAIL_VERSION;
    }

    public static String getTravelItineraryVersion() {
        return TRAVEL_ITINERARY_VERSION;
    }

    public static String getEnhancedAirBookVersion() {
        return ENHANCED_AIR_BOOK_VERSION;
    }

    public static String getPassengerDetailsVersion() {
        return PASSENGER_DETAILS_VERSION;
    }
}
