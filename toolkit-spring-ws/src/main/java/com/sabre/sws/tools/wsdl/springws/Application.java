package com.sabre.sws.tools.wsdl.springws;

import com.sabre.sws.tools.wsdl.springws.client.SwsClient;
import com.sabre.sws.tools.wsdl.springws.configuration.SessionCreateConfiguration;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by SG0221139 on 8/13/2014.
 */
public class Application {

    public static void main( String ... args ) {
        ApplicationContext ctx = SpringApplication.run(SessionCreateConfiguration.class, args);

        SwsClient client = ctx.getBean( SwsClient.class );
        SessionCreateRS response = client.createSession();
    }

}
