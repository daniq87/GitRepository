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

    private Jaxb2Marshaller getMarshaller(String contextPath) {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath( contextPath );
        return marshaller;
    }

    @Bean
    public SessionCreateWrapper sessionCreateWrapper() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("com.sabre.sws.tools.wsdl.springws.session:");
        buffer.append( "com.sabre.sws.tools.wsdl.springws.soap:" );

        String contextPath = buffer.toString();

        SessionCreateWrapper sessionCreateWrapper = new SessionCreateWrapper();
        configureWebServiceGateway( sessionCreateWrapper, getMarshaller(contextPath) );

        return sessionCreateWrapper;
    }

    @Bean
    public SessionCloseWrapper sessionCloseWrapper() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("com.sabre.sws.tools.wsdl.springws.session:");
        buffer.append( "com.sabre.sws.tools.wsdl.springws.soap:" );

        String contextPath = buffer.toString();

        SessionCloseWrapper sessionCloseWrapper = new SessionCloseWrapper();
        configureWebServiceGateway( sessionCloseWrapper, getMarshaller(contextPath) );

        return sessionCloseWrapper;
    }

    @Bean
    public AirAvailWrapper airAvailWrapper() {

        AirAvailWrapper airAvailWrapper = new AirAvailWrapper();
        configureWebServiceGateway( airAvailWrapper, getMarshaller("com.sabre.sws.tools.wsdl.springws.airavail") );

        return airAvailWrapper;
    }

    @Bean
    public TravelItineraryReadWrapper travelItineraryReadWrapper() {

        TravelItineraryReadWrapper travelItineraryReadWrapper = new TravelItineraryReadWrapper();
        configureWebServiceGateway( travelItineraryReadWrapper, getMarshaller("com.sabre.sws.tools.wsdl.springws.travelitinerary") );

        return travelItineraryReadWrapper;
    }

    @Bean
    public EnhancedAirBookWrapper enhancedAirBookWrapper() {

        EnhancedAirBookWrapper enhancedAirBookWrapper = new EnhancedAirBookWrapper();
        configureWebServiceGateway( enhancedAirBookWrapper, getMarshaller("com.sabre.sws.tools.wsdl.springws.enhancedairbook") );

        return  enhancedAirBookWrapper;
    }

    @Bean
    public PassengerDetailsWrapper passengerDetailsWrapper() {

        PassengerDetailsWrapper passengerDetailsWrapper = new PassengerDetailsWrapper();
        configureWebServiceGateway( passengerDetailsWrapper, getMarshaller("com.sabre.sws.tools.wsdl.springws.passengerdetails") );

        return passengerDetailsWrapper;
    }


}
