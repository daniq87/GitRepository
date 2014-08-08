package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRS;
import https.webservices_sabre_com.websvc.PassengerDetailsPortType;
import https.webservices_sabre_com.websvc.PassengerDetailsService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import javax.xml.ws.BindingProvider;

/**
 * Created by SG0221139 on 8/8/2014.
 */
public class PassengerDetailsWrapper {

    public PassengerDetailsRS executeSampleRequest() {
        return null;
    }

    private PassengerDetailsPortType getConfiguredPort() {
        PassengerDetailsService service = new PassengerDetailsService();
        PassengerDetailsPortType port = service.getPassengerDetailsPortType();

        setEndpointFromConfiguration( port );
        addInterceptors( port );

        return null;
    }

    private void setEndpointFromConfiguration( PassengerDetailsPortType port ) {
        String endpoint = Util.getConfigurationProvider().getEndpoint();
        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint );
    }

    private void addInterceptors( PassengerDetailsPortType port ) {
        Client client = ClientProxy.getClient( port );
        Endpoint endpoint = client.getEndpoint();

        endpoint.getInInterceptors().add( new LoggingInInterceptor() );
        endpoint.getOutInterceptors().add( new LoggingOutInterceptor() );
    }

}
