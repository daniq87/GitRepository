package com.sabre.sws.tools.wsdl.cxf.jaxb.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import org.opentravel.ota._2002._11.SessionCloseRQ;

/**
 * Created by SG0221139 on 8/7/2014.
 */
public class SessionCloseFactory {

    private SessionCloseFactory() {}

    public static SessionCloseRQ getSessionClose( IConfigurationProvider configuration ) {

        SessionCloseRQ instance = new SessionCloseRQ();

        SessionCloseRQ.POS pos = new SessionCloseRQ.POS();
        SessionCloseRQ.POS.Source source = new SessionCloseRQ.POS.Source();
        source.setPseudoCityCode( configuration.getPCC() );
        pos.setSource( source );
        instance.setPOS( pos );

        return instance;
    }

}
