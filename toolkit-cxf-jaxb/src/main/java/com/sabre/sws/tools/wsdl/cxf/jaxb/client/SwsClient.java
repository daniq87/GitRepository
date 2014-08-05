package com.sabre.sws.tools.wsdl.cxf.jaxb.client;

import com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers.SessionCreateWrapper;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class SwsClient {

    public static void main( String ... args ) {

        SessionCreateWrapper sessionCreate = new SessionCreateWrapper();
        sessionCreate.openSession();


    }

}
