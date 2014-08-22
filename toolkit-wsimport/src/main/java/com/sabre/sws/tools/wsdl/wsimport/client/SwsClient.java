package com.sabre.sws.tools.wsdl.wsimport.client;

import com.sabre.sws.tools.wsdl.wsimport.wrappers.SessionCreateWrapper;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SwsClient {

    public static void main( String ... args ) {

        new SessionCreateWrapper().openSession();
    }

}
