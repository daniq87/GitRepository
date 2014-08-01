package com.sabre.sws.tools.wsdl.axis2.xmlbeans.client;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCreateWrapper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.opentravel.www.ota._2002._11.SessionCreateRSDocument;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SwsClient {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static void main( String ... args ) throws RemoteException {

        ServicesVersionsProvider.getEnhancedAirBookVersion();
        SessionCreateWrapper stub = new SessionCreateWrapper( configuration );
        SessionCreateRSDocument document = stub.openSession();
    }

}
