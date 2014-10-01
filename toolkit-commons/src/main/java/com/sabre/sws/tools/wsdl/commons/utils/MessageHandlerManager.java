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
    private static Phase logInPhase = new Phase( "Log In Phase" );
    private static Phase logOutPhase = new Phase( "Log Out Phase" );
    private static Phase dispatchPhase = new Phase( "Dispatch Phase" );

    private static List<Phase> outPhases = Arrays.asList( logOutPhase );
    private static List<Phase> inPhases = Arrays.asList( logInPhase, errorPhase, dispatchPhase );

    // Private c-tor
    private MessageHandlerManager() {}

    public static void erase() {
        stubs.clear();

        errorPhase = new Phase( "Error Phase" );
        logInPhase = new Phase( "Log In Phase" );
        logOutPhase = new Phase( "Log Out Phase" );
        dispatchPhase = new Phase( "Dispatch Phase" );

        outPhases = Arrays.asList( logOutPhase );
        inPhases = Arrays.asList( logInPhase, errorPhase, dispatchPhase );
    }

    public static void addStub( Stub stub ) {
        LOGGER.debug( "Add stub" );

        if( !stubs.contains(stub) ) {
            stubs.add( stub );
            stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch(Collections.unmodifiableList(inPhases));
            stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase(Collections.unmodifiableList(outPhases));
        }
    }

    public static void addErrorPhaseHandler( AbstractHandler handler ) {
        LOGGER.debug( "Add Error" );

        if( !errorPhase.getHandlers().contains(handler)) {
            errorPhase.addHandler( handler );

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( inPhases );
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( outPhases );
            }
        }
    }

    public static void addLogPhaseOutHandler( AbstractHandler handler ) {
        LOGGER.debug( "Add Log Out" );

        if( !logOutPhase.getHandlers().contains(handler)) {
            logOutPhase.addHandler(handler);

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( outPhases );
            }
        }
    }

    public static void addLogPhaseInHandler( AbstractHandler handler ) {
        LOGGER.debug( "Add Log In" );

        if( !logInPhase.getHandlers().contains(handler)) {
            logInPhase.addHandler(handler);

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( inPhases );
            }
        }
    }

    public static void addDispatchPhaseHandler( AbstractHandler handler ) {

        LOGGER.info( "Add Dispatch" );

        if( !dispatchPhase.getHandlers().contains(handler)) {
            dispatchPhase.addHandler(handler);

            for( Stub stub : stubs ) {
                stub._getServiceClient().getAxisConfiguration().setGlobalOutPhase( outPhases );
                stub._getServiceClient().getAxisConfiguration().setInPhasesUptoAndIncludingPostDispatch( inPhases );
            }
        }
    }

}
