package com.sabre.sws.tools.wsdl.commons.utils;

import org.apache.axis2.client.Stub;
import org.apache.axis2.engine.Phase;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SG0221139 on 7/16/2014.
 *
 * This class manages handlers and stubs within Apache Axis2 application.
 *
 * In constructor, each wrapper class (that extend Axis2's stub class) registers itself in manager
 * by passing  it's "this" reference to manager's addStub() method.
 *
 * The client application registers a proper set of handlers in SwsClient class' main() method.
 *
 * The manager configures each stub to contain the defined handler set.
 *
 */
public class MessageHandlerManager {

    private static final Logger LOGGER = LogManager.getLogger( MessageHandlerManager.class );

    private final static List<Stub> stubs = new ArrayList<> ();

    private static Phase errorPhase = new Phase( "Error Phase" );
    private static Phase logPhase = new Phase( "Log Phase" );
    private static Phase dispatchPhase = new Phase( "Dispatch Phase" );

    private static List<Phase> phases = Arrays.asList( logPhase, errorPhase, dispatchPhase );

    // Private c-tor
    private MessageHandlerManager() {}

    public static void erase() {
        stubs.clear();

        errorPhase = new Phase( "Error Phase" );
        logPhase = new Phase( "Log Phase" );
        dispatchPhase = new Phase( "Dispatch Phase" );

        phases = Arrays.asList( logPhase, errorPhase, dispatchPhase );
    }

    public static void addStub( Stub stub ) {
        LOGGER.info( "Add stub" );

        if( !stubs.contains(stub) ) {
            stubs.add( stub );
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch(Collections.unmodifiableList(phases));
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase(Collections.unmodifiableList(phases));
        }
    }

    public static void addErrorPhaseHandler( AbstractHandler handler ) {
        LOGGER.info( "Add Error" );

        if( !errorPhase.getHandlers().contains(handler)) {
            errorPhase.addHandler( handler );

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
            }
        }
    }

    public static void addLogPhaseHandler( AbstractHandler handler ) {
        LOGGER.info( "Add Log" );

        if( !logPhase.getHandlers().contains(handler)) {
            logPhase.addHandler(handler);

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
            }
        }
    }

    public static void addDispatchPhaseHandler( AbstractHandler handler ) {

        LOGGER.info( "Add Dispatch" );

        if( !dispatchPhase.getHandlers().contains(handler)) {
            dispatchPhase.addHandler(handler);

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( phases );
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( phases );
            }
        }
    }

}
