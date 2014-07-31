package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import org.opentravel.www.ota._2002._11.SessionCreateRQDocument;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SessionCreateRQFactory {

    private SessionCreateRQFactory() {

    }

    public static SessionCreateRQDocument getSessionCreateRQ( IConfigurationProvider configuration ) {

        SessionCreateRQDocument instance = SessionCreateRQDocument.Factory.newInstance();
        SessionCreateRQDocument.SessionCreateRQ sessionCreateRQ = instance.getSessionCreateRQ();

        SessionCreateRQDocument.SessionCreateRQ.POS pos = sessionCreateRQ.addNewPOS();
        pos.addNewSource().setPseudoCityCode( configuration.getPCC() );

        return instance;
    }

}
