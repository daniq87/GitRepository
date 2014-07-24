package com.sabre.sws.tools.wsdl.commons.exceptions;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class WorldIsGoingToEndException extends RuntimeException {
    public WorldIsGoingToEndException() {
        super( "Never, ever, try to connect to PROD" );
    }
}
