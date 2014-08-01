package com.sabre.sws.tools.wsdl.axis2.xmlbeans.client;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCreateWrapper;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.opentravel.www.ota._2002._11.SessionCreateRSDocument;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SwsClient {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static void main( String ... args ) throws RemoteException {

        SessionCreateWrapper stub = new SessionCreateWrapper( configuration );

        List hnd = new ArrayList();
        hnd.add( new OutputHandler() );
        hnd.add( new MustUnderstandHandler() );

        stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( hnd );
        SessionCreateRSDocument document = stub.openSession();

        System.out.println( SessionManager.getInstance().getToken() );

        SessionCloseWrapper sessionClose = new SessionCloseWrapper( configuration );
        sessionClose._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( hnd );

        System.out.println( SessionManager.getInstance().getToken() );
    }

}
