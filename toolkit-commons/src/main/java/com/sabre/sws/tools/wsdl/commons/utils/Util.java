package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by SG0221139 on 7/24/2014.
 */
public class Util {

    private static final Logger LOGGER = LogManager.getLogger( Util.class.getName() );

    private static final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );

    private static final String fromString = "sample.url.of.sabre.client.com";
    private static final String toString = "webservices.sabre.com";

    private static final String serviceTypeString = "sabreXML";

    private static final String configFileLocation = "connection.properties"; // TODO: resources as bundle
    private static final IConfigurationProvider configuration;

    static {
        try {
            File configFile;
            configFile = new File( configFileLocation );
            configuration = new PropertiesFileConfigurationSource( configFile );
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

        Date now = new java.util.Date();
        DateFormatSymbols symbols = DateFormatSymbols.getInstance( new Locale( "PL" ));
        SimpleDateFormat formatter = new SimpleDateFormat( timestampFormat, symbols );
        return formatter.format( now );
    }

    public static String longRandomHexString() {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for( int i = 0; i < 3; ++i ) {
            buffer.append( Integer.toHexString(random.nextInt(10000000)) );
        }
        return buffer.toString();
    }

    public static String getFromString() {
        return fromString;
    }

    public static String getToString() {
        return toString;
    }
}
