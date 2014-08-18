package com.sabre.sws.tools.wsdl.springws.configuration;

import com.sabre.sws.tools.wsdl.springws.client.SwsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by SG0221139 on 8/13/2014.
 */


@Configuration
public class SessionCreateConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {

        StringBuffer buffer = new StringBuffer();
        buffer.append( "org.ebxml.namespaces.messageheader" ).append( ":" );
        buffer.append( "org.opentravel.ota._2002._11" ).append( ":" );
        buffer.append( "org.w3._2000._09.xmldsig_" ).append( ":" );
        buffer.append( "org.xmlsoap.schemas.soap.envelope" ).append( ":" );
        buffer.append( "org.xmlsoap.schemas.ws._2002._12.secext" );

        String contextPath = buffer.toString();

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath( contextPath );

        return marshaller;
    }

    @Bean
    public SwsClient swsClient( Jaxb2Marshaller marshaller ) {

        SwsClient swsClient = new SwsClient();

        swsClient.setDefaultUri( "http://localhost:8088/mockSessionCreateSoapBinding" );
//        swsClient.setDefaultUri(Util.getConfigurationProvider().getEndpoint());
        swsClient.setMarshaller( marshaller );
        swsClient.setUnmarshaller(marshaller);

        return swsClient;
    }

}
