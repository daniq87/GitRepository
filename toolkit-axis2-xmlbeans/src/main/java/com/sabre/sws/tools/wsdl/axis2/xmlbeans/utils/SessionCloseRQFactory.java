package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import org.opentravel.www.ota._2002._11.SessionCloseRQDocument;

/**
 * Created by sg0221139 on 7/31/14.
 */
public class SessionCloseRQFactory {

    private SessionCloseRQFactory() {

    }

    public static SessionCloseRQDocument getSessionCloseRQ( IConfigurationProvider configuration ) {

        SessionCloseRQDocument instance = SessionCloseRQDocument.Factory.newInstance();
        SessionCloseRQDocument.SessionCloseRQ sessionCloseRQ = instance.addNewSessionCloseRQ();

        sessionCloseRQ.addNewPOS().addNewSource().setPseudoCityCode( configuration.getPCC() );

        return instance;
    }

}
