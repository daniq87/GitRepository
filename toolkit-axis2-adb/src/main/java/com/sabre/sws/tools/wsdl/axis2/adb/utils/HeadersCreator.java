package com.sabre.sws.tools.wsdl.axis2.adb.utils;

import com.sabre.sws.tools.wsdl.stubs.SessionCreateRQServiceStub;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by SG0221139 on 7/14/2014.
 */
public class HeadersCreator {

    private final String timestampFormat = new String( "yyyy-mm-dd_hh:mm:ss:SSS" );

    private String getTimestamp() {

        Date now = new Date();
        DateFormatSymbols symbols = DateFormatSymbols.getInstance( new Locale( "PL" ));
        SimpleDateFormat formatter = new SimpleDateFormat( timestampFormat, symbols );
        return formatter.format( now );
    }

    private String longRandomHexString() {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for( int i = 0; i < 3; ++i ) {
            buffer.append( Integer.toHexString(random.nextInt(10000000)) );
        }
        return buffer.toString();
    }


    public SessionCreateRQServiceStub.NonEmptyString toNonEmptyString( String param ) {
        SessionCreateRQServiceStub.NonEmptyString instance = new SessionCreateRQServiceStub.NonEmptyString();
        instance.setNonEmptyString( param );
        return instance;
    }

    /*public static <T> T getMessageHeader( String action, Class<T> type ) throws IllegalAccessException, InstantiationException {

        T instance = type.newInstance();
        Class<?>[] innerClasses = type.getDeclaredClasses();

        for( Class<?> innerClass : innerClasses ) {

        }

    }*/

}
