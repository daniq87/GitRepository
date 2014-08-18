package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/18/2014.
 */
public class AirAvailWrapper extends WebServiceGatewaySupport {

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    private void addInterceptors() {
        interceptors.add( new LoggingInterceptor() );
        super.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

}
