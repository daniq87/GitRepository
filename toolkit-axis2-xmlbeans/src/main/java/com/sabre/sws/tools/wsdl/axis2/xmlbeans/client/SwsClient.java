package com.sabre.sws.tools.wsdl.axis2.xmlbeans.client;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers.SessionCreateWrapper;
import com.sabre.sws.tools.wsdl.commons.handlers.ErrorHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.handlers.OutputHandler;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.LogMonitor;
import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import org.opentravel.www.ota._2002._11.SessionCreateRSDocument;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SwsClient {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static void main( String ... args ) {

        LogMonitor.setEnableMonitr( true );

        addHandlers();

        try {
            openSession();
        } catch ( RemoteException e ) {
            e.printStackTrace();
        } finally {
            try {
                closeSession();
            } catch ( RemoteException e ) {
                e.printStackTrace();
            }
        }


    }

    public static void addHandlers() {
        MessageHandlerManager.addLogPhaseHandler(new OutputHandler() );
        MessageHandlerManager.addErrorPhaseHandler( new ErrorHandler() );
        MessageHandlerManager.addDispatchPhaseHandler( new MustUnderstandHandler() );
    }

    public static void openSession() throws RemoteException {
        SessionCreateWrapper stub = new SessionCreateWrapper( configuration );
        SessionCreateRSDocument document = stub.openSession();
    }

    public static void closeSession() throws RemoteException {
        SessionCloseWrapper sessionClose = new SessionCloseWrapper( configuration );
        sessionClose.closeSession();
    }

}
