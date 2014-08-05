package com.sabre.sws.tools.wsdl.cxf.jaxb.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.cxf.jaxb.SessionCreateRQ;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class SessionCreateFactory {

    private SessionCreateFactory() {

    }

    public static SessionCreateRQ getSessionCreate( IConfigurationProvider configuration ) {

        SessionCreateRQ instance = new SessionCreateRQ();

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        source.setPseudoCityCode( configuration.getPCC() );
        pos.setSource( source );

        instance.setPOS( pos );

        return instance;
    }

}
