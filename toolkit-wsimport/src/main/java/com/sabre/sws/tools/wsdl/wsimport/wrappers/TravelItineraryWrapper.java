package com.sabre.sws.tools.wsdl.wsimport.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.wsimport.handlers.LoggingHandler;
import com.sabre.sws.tools.wsdl.wsimport.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.wsimport.utils.SecurityFactory;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRQ;
import com.sabre.webservices.sabrexml._2011._10.TravelItineraryReadRS;
import https.webservices_sabre_com.websvc.TravelItineraryReadPortType;
import https.webservices_sabre_com.websvc.TravelItineraryReadService;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 9/2/2014.
 */
public class TravelItineraryWrapper {

    private static final String actionString = "TravelItineraryReadLLSRQ";

    public TravelItineraryReadRS executeSampleRequest() {

        Security security = SecurityFactory.getTokenSecurity();
        MessageHeader header = MessageHeaderFactory.getMessageHeader(actionString);
        TravelItineraryReadRQ body = getRequestBody();

        TravelItineraryReadPortType port = getConfiguredPort();

        return port.travelItineraryReadRQ( new Holder<>(header), new Holder<>(security), body );
    }

    private TravelItineraryReadPortType getConfiguredPort() {

        TravelItineraryReadService service = new TravelItineraryReadService();
        TravelItineraryReadPortType port = service.getTravelItineraryReadPortType();

        setEndpointFromConfiguration(port);

        addInterceptors( port );

        return port;
    }

    private void setEndpointFromConfiguration(TravelItineraryReadPortType port) {
        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, Util.getConfigurationProvider().getEndpoint() );

    }

    private void addInterceptors( TravelItineraryReadPortType port ) {

        List<Handler> handlers = ((BindingProvider)port).getBinding().getHandlerChain();

        if( handlers == null ) {
            handlers = new ArrayList<>();
        }

        handlers.add( new LoggingHandler() );

        ((BindingProvider)port).getBinding().setHandlerChain( handlers );
    }

    private TravelItineraryReadRQ getRequestBody() {

        TravelItineraryReadRQ body = new TravelItineraryReadRQ();

        body.setVersion(ServicesVersionsProvider.getTravelItineraryVersion());

        TravelItineraryReadRQ.MessagingDetails details = new TravelItineraryReadRQ.MessagingDetails();
        TravelItineraryReadRQ.MessagingDetails.Transaction transaction = new TravelItineraryReadRQ.MessagingDetails.Transaction();
        transaction.setCode( "PNR" );
        details.getTransaction().add( transaction );
        body.setMessagingDetails( details );

        TravelItineraryReadRQ.UniqueID uid = new TravelItineraryReadRQ.UniqueID();
        uid.setID( "HNDAGG" );
        body.setUniqueID(uid);

        return body;
    }

}
