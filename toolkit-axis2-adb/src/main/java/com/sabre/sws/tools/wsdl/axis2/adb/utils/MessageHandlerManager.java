package com.sabre.sws.tools.wsdl.axis2.adb.utils;

import org.apache.axis2.client.Stub;
import org.apache.axis2.handlers.AbstractHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class MessageHandlerManager {

    private static List<Stub> stubs = new ArrayList();
    private static List handlers = new ArrayList();

    // Private c-tor
    private MessageHandlerManager() {}

    public static void addStub( Stub stub ) {
        stubs.add( stub );
        stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( handlers );
        stub._getServiceClient().getAxisConfiguration().setInFaultPhases( handlers );
        stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( handlers );
    }

    public static void addHandler( AbstractHandler handler ) {
        handlers.add( handler );

        for( Stub stub : stubs ) {
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( handlers );
            stub._getServiceClient().getAxisConfiguration().setInFaultPhases( handlers );
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( handlers );
        }
    }

}
