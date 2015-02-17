package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.requests.TravelItineraryReadContent;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.interceptors.FaultInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import com.sabre.sws.tools.wsdl.springws.travelitinerary.TravelItineraryReadRQ;
import com.sabre.sws.tools.wsdl.springws.travelitinerary.TravelItineraryReadRS;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 8/19/2014.
 */
public class TravelItineraryReadWrapper extends WebServiceGatewaySupport {

    private static final String actionString = "TravelItineraryReadRQ";
    private static final String versionString = ServicesVersionsProvider.getTravelItineraryVersion();

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    public TravelItineraryReadWrapper() {
        super();
        addInterceptors();
    }

    private void addInterceptors() {
        interceptors.add( new FaultInterceptor() );
        interceptors.add( new LoggingInterceptor() );

        this.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    public TravelItineraryReadRS executeSampleRequest() {

        return (TravelItineraryReadRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody(),
                new HeaderComposingCallback( actionString )
        );
    }

    private TravelItineraryReadRQ getRequestBody() {

        TravelItineraryReadRQ body = new TravelItineraryReadRQ();

        body.setVersion(versionString);

        TravelItineraryReadRQ.MessagingDetails details = new TravelItineraryReadRQ.MessagingDetails();
        TravelItineraryReadRQ.MessagingDetails.SubjectAreas subjectAreas = new TravelItineraryReadRQ.MessagingDetails.SubjectAreas();
        subjectAreas.getSubjectArea().add( "PNR" );
        details.setSubjectAreas(subjectAreas);
        body.setMessagingDetails( details );

        TravelItineraryReadRQ.UniqueID uid = new TravelItineraryReadRQ.UniqueID();
        uid.setID(TravelItineraryReadContent.getPNR());
        body.setUniqueID(uid);

        return body;
    }

}
