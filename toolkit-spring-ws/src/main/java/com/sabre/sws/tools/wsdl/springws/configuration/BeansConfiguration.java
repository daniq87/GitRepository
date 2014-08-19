package com.sabre.sws.tools.wsdl.springws.configuration;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.wrappers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by SG0221139 on 8/13/2014.
 */


@Configuration
public class BeansConfiguration {

    private void configureWebServiceGateway( WebServiceGatewaySupport ws, Jaxb2Marshaller marshaller ) {
        ws.setDefaultUri(Util.getConfigurationProvider().getEndpoint());
        ws.setMarshaller(marshaller);
        ws.setUnmarshaller(marshaller);
    }

    private Jaxb2Marshaller marshaller() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("com.sabre.sws.tools.wsdl.springws.session:");
        buffer.append( "com.sabre.sws.tools.wsdl.springws.soap:" );

        String contextPath = buffer.toString();

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath( contextPath );

        return marshaller;
    }

    @Bean
    public SessionCreateWrapper sessionCreateWrapper() {

        Jaxb2Marshaller marshaller = marshaller();

        SessionCreateWrapper sessionCreateWrapper = new SessionCreateWrapper();
        configureWebServiceGateway( sessionCreateWrapper, marshaller );

        return sessionCreateWrapper;
    }

    @Bean
    public SessionCloseWrapper sessionCloseWrapper() {
        Jaxb2Marshaller marshaller = marshaller();

        SessionCloseWrapper sessionCloseWrapper = new SessionCloseWrapper();
        configureWebServiceGateway( sessionCloseWrapper, marshaller );

        return sessionCloseWrapper;
    }

    @Bean
    public AirAvailWrapper airAvailWrapper() {

        Jaxb2Marshaller marshaller = marshaller();

        AirAvailWrapper airAvailWrapper = new AirAvailWrapper( marshaller );
        configureWebServiceGateway( airAvailWrapper, marshaller );

        return airAvailWrapper;
    }

    @Bean
    public TravelItineraryReadWrapper travelItineraryReadWrapper() {

        Jaxb2Marshaller marshaller = marshaller();

        TravelItineraryReadWrapper travelItineraryReadWrapper = new TravelItineraryReadWrapper( marshaller );
        configureWebServiceGateway( travelItineraryReadWrapper, marshaller );

        return travelItineraryReadWrapper;
    }

    @Bean
    public EnhancedAirBookWrapper enhancedAirBookWrapper() {

        Jaxb2Marshaller marshaller = marshaller();

        EnhancedAirBookWrapper enhancedAirBookWrapper = new EnhancedAirBookWrapper( marshaller );
        configureWebServiceGateway( enhancedAirBookWrapper, marshaller );

        return  enhancedAirBookWrapper;
    }

    @Bean
    public PassengerDetailsWrapper passengerDetailsWrapper() {

        Jaxb2Marshaller marshaller = marshaller();

        PassengerDetailsWrapper passengerDetailsWrapper = new PassengerDetailsWrapper( marshaller );
        configureWebServiceGateway( passengerDetailsWrapper, marshaller );

        return passengerDetailsWrapper;
    }


}
