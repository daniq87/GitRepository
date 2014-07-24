package com.sabre.sws.tools.wsdl.commons.exceptions;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class ProdEndpointConnectionException extends RuntimeException {
    public ProdEndpointConnectionException() {
        super( "Attempt of connecting to PROD detected. Change endpoint or remove TSTS-connection-only code statements" );
    }
}
