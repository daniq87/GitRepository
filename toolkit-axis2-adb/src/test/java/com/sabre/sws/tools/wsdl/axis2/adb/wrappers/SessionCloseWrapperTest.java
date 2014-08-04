package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.stubs.adb.SessionCloseRQServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.model.Header;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class SessionCloseWrapperTest extends AbstractWebServiceTestClass {

    private static final Logger LOGGER = LogManager.getLogger(SessionCloseWrapperTest.class.getName());

    private static SessionCloseWrapper instance;


    @Before
    public void createInstance() throws AxisFault {
        instance = new SessionCloseWrapper( configuration );
    }

    @After
    public void destroyInstance() {
        instance = null;
    }

    @Test
    public void testCloseSession() throws Exception {

        LOGGER.info( "Test begin" );

        // given
        SessionManager.getInstance().startSession( "mock-tocken" );
        SessionManager.getInstance().setConversationID( "mock-conversation-id" );
        StringBuffer responseBuffer = new StringBuffer();
        String testResponseLocation = "src/test/resources/test_responses/session_close_test_response.xml";
        try {
            BufferedReader br = new BufferedReader( new FileReader( testResponseLocation ) );
            String ln;
            while( ( ln = br.readLine() ) != null ) {
                responseBuffer.append( ln + "\n" );
            }
        } catch( IOException e ) {
            e.printStackTrace();
        }

        mockServer
                .when(
                        request()
                )
                .respond(
                        response()
                                .withHeaders(
                                        new Header("Content-Type", "text/xml; charset=UTF-8")
                                )
                                .withBody(
                                        responseBuffer.toString()
                                )
                );

        MessageHandlerManager.addDispatchPhaseHandler( new MustUnderstandHandler() );
        MessageHandlerManager.addStub( instance );

        // when
        SessionCloseRQServiceStub.SessionCloseRS response = instance.closeSession();

        // then
        assertNotEquals( "Response should not be null", response, null );
        assertEquals( "Session token should be lost", SessionManager.getInstance().getToken(), null );
        assertEquals( "Session should be closed", SessionManager.getInstance().isSessionActive(), false );
    }
}