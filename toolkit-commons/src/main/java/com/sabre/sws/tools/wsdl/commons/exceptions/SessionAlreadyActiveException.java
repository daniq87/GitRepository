package com.sabre.sws.tools.wsdl.commons.exceptions;

import javax.naming.OperationNotSupportedException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class SessionAlreadyActiveException extends OperationNotSupportedException{

    public SessionAlreadyActiveException() {
        super();
    }

    public SessionAlreadyActiveException( String s ) {
        super( s );
    }

}
