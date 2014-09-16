package com.sabre.sws.tools.wsdl.commons.utils.requestcontent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0221139 on 9/8/2014.
 */
public class TravelItineraryReadContent {

    private static final Logger LOGGER = LogManager.getLogger(TravelItineraryReadContent.class);
    private static final String PNR;

    static {
        Properties properties = new Properties();
        String requestDataFileName = "/request-data.properties";

        try {
            InputStream inputStream = TravelItineraryReadContent.class.getResourceAsStream( requestDataFileName );
            properties.load( inputStream );
            PNR = properties.getProperty("pnr");
        } catch (IOException e) {
            LOGGER.fatal( "Couldn't read services versions from file", e );
            throw new RuntimeException( "Couldn't load services versions" );
        }
    }

    private TravelItineraryReadContent() {}

    public static String getPNR() {
        return PNR;
    }

}
