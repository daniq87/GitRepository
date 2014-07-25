package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.commons.handlers.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.stubs.SessionCreateRQServiceStub;
import org.apache.axis2.AxisFault;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.model.Header;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class SessionCreateWrapperTest extends AbstractWebServiceTestClass {

    private static final Logger LOGGER = Logger.getLogger( SessionCreateWrapperTest.class.getName() );

    private static SessionCreateWrapper instance;

    @Before
    public void createInstance() throws AxisFault {
        instance = new SessionCreateWrapper( configuration );
    }

    @After
    public void destroyInstance() {
        instance = null;
    }

    @Test
    public void shouldSendSessionCreateRequestAndReceiveResponse() throws Exception {

        LOGGER.log(Level.INFO, "Test begin");

        // given

        StringBuffer responseBuffer = new StringBuffer();
        String testResponseLocation = "src/test/resources/test_responses/session_create_test_response.xml";
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

        // when
        MessageHandlerManager.addHandler( new MustUnderstandHandler() );
        MessageHandlerManager.addStub( instance );
        SessionCreateRQServiceStub.SessionCreateRS response = instance.openSession();

        // then
        assertNotEquals( "Response cannot be null", response, null );
        assertEquals( "Should create session", SessionManager.getInstance().isSessionActive(), true );
        assertEquals( "Should acquire session token", SessionManager.getInstance().getToken(), "session_create_test_binary_sec_token" );

    }

}