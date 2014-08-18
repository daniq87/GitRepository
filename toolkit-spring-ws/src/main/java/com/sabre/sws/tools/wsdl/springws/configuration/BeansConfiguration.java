package com.sabre.sws.tools.wsdl.springws.configuration;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.wrappers.SessionCloseWrapper;
import com.sabre.sws.tools.wsdl.springws.wrappers.SessionCreateWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by SG0221139 on 8/13/2014.
 */


@Configuration
public class BeansConfiguration {

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
    public SessionCreateWrapper sessionCreateWrapper( Jaxb2Marshaller marshaller ) {

        SessionCreateWrapper sessionCreateWrapper = new SessionCreateWrapper();

//        sessionCreateWrapper.setDefaultUri("http://localhost:8088/mockSessionCreateSoapBinding");
        sessionCreateWrapper.setDefaultUri(Util.getConfigurationProvider().getEndpoint());
        sessionCreateWrapper.setMarshaller( marshaller );
        sessionCreateWrapper.setUnmarshaller(marshaller);

        return sessionCreateWrapper;
    }

    @Bean
    public SessionCloseWrapper sessionCloseWrapper( Jaxb2Marshaller marshaller ) {

        SessionCloseWrapper sessionCloseWrapper = new SessionCloseWrapper();

//        sessionCloseWrapper.setDefaultUri("http://localhost:8088/mockSessionCloseSoapBinding");
        sessionCloseWrapper.setDefaultUri(Util.getConfigurationProvider().getEndpoint());
        sessionCloseWrapper.setMarshaller( marshaller );
        sessionCloseWrapper.setUnmarshaller(marshaller);

        return sessionCloseWrapper;
    }

}
