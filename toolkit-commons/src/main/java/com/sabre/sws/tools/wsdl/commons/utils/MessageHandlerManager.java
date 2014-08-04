package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.axis2.client.Stub;
import org.apache.axis2.engine.Phase;
import org.apache.axis2.handlers.AbstractHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SG0221139 on 7/16/2014.
 */
public class MessageHandlerManager {

    private final static List<Stub> stubs = new ArrayList<> ();

    private final static Phase errorPhase = new Phase( "Error Phase" );
    private final static Phase logPhase = new Phase( "Log Phase" );
    private final static Phase dispatchPhase = new Phase( "Dispatch Phase" );

    private final static List<Phase> phases = Arrays.asList( logPhase, errorPhase, dispatchPhase );

    // Private c-tor
    private MessageHandlerManager() {}

    public static void addStub( Stub stub ) {
        stubs.add( stub );
        stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch(Collections.unmodifiableList(phases));
        stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase(Collections.unmodifiableList(phases));

    }

    public static void addErrorPhaseHandler( AbstractHandler handler ) {

        errorPhase.addHandler( handler );

        for( Stub stub : stubs ) {
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
        }
    }

    public static void addLogPhaseHandler( AbstractHandler handler ) {

        logPhase.addHandler(handler);

        for( Stub stub : stubs ) {
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
        }
    }

    public static void addDispatchPhaseHandler( AbstractHandler handler ) {

        dispatchPhase.addHandler(handler);

        for( Stub stub : stubs ) {
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
        }
    }

}
