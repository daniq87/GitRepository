package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

import java.io.IOException;

/**
 * Created by SG0221139 on 7/24/2014.
 */
public class Util {

    private static final Logger LOGGER = LogManager.getLogger( Util.class.getName() );

    private static final String fromString = "sample.url.of.sabre.client.com";
    private static final String toString = "webservices.sabre.com";

    private static final String serviceTypeString = "sabreXML";

    private static final String configurationFileName = "/connection.properties";
    private static final IConfigurationProvider configuration;

    static {
        try {
            configuration = new PropertiesFileConfigurationSource( Util.class.getResourceAsStream( configurationFileName ) );
            LOGGER.info( "Configuration loaded" );
        } catch( IOException e ) {
            LOGGER.fatal( "Error reading configuration from a file", e);
            throw new RuntimeException( e );
        }
    }

    public static String getServiceTypeString() {
        return serviceTypeString;
    }

    public static IConfigurationProvider getConfigurationProvider() {
        return configuration;
    }

    public static String getTimestamp() {

        DateTime dateTime = new DateTime();
        return dateTime.toLocalDateTime().toString();

    }

    public static String longRandomHexString() {

        return RandomStringUtils.randomAlphanumeric(8);
    }

    public static String getFromString() {
        return fromString;
    }

    public static String getToString() {
        return toString;
    }
}
