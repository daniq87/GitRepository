package com.sabre.sws.tools.wsdl.commons.utils;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by SG0221139 on 7/24/2014.
 */
public class Util {

    private static final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );

    private static final String fromString = "sample.url.of.sabre.client.com";
    private static final String toString = "webservices.sabre.com";

    private static final String serviceTypeString = "sabreXML";

    public static String getServiceTypeString() {
        return serviceTypeString;
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
