package com.sabre.sws.tools.wsdl.springws.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.springws.callbacks.HeaderComposingCallback;
import com.sabre.sws.tools.wsdl.springws.interceptors.FaultInterceptor;
import com.sabre.sws.tools.wsdl.springws.interceptors.LoggingInterceptor;
import com.sabre.sws.tools.wsdl.springws.passengerdetails.PassengerDetailsRQ;
import com.sabre.sws.tools.wsdl.springws.passengerdetails.PassengerDetailsRS;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SG0221139 on 8/19/2014.
 */
public class PassengerDetailsWrapper extends WebServiceGatewaySupport {

    private static final String serviceAction = "PassengerDetailsRQ";
    private static final String serviceVersion = ServicesVersionsProvider.getPassengerDetailsVersion();

    private List<ClientInterceptor> interceptors = new ArrayList<>();

    public PassengerDetailsWrapper() {
        super();
        addInterceptors();
    }

    private void addInterceptors() {
        interceptors.add( new LoggingInterceptor() );
        interceptors.add( new FaultInterceptor() );

        this.setInterceptors( interceptors.toArray( new ClientInterceptor[0] ) );
    }

    public PassengerDetailsRS executeSampleRequest() {

        return (PassengerDetailsRS) getWebServiceTemplate().marshalSendAndReceive(
                getRequestBody(),
                new HeaderComposingCallback( serviceAction )
        );

    }

    private PassengerDetailsRQ getRequestBody() {

        PassengerDetailsRQ request = new PassengerDetailsRQ();
        request.setIgnoreOnError( false );
        request.setHaltOnError( true );
        request.setVersion(serviceVersion);

        request.setMiscSegmentSellRQ( getMiscSegmentSellRQ() );
        request.setPostProcessing( getPostProcessing() );
        request.setPriceQuoteInfo( getPriceQuoteInfo() );
        request.setSpecialReqDetails( getSpecialReqDetails() );
        request.setTravelItineraryAddInfoRQ( getTravelItineraryAddInfoRQ() );

        return request;

    }

    private PassengerDetailsRQ.MiscSegmentSellRQ getMiscSegmentSellRQ() {

        PassengerDetailsRQ.MiscSegmentSellRQ miscSegmentSellRQ = new PassengerDetailsRQ.MiscSegmentSellRQ();
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment miscSegment = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment();
        miscSegment.setText( "RETENTION SEGMENT" );
        miscSegment.setType( "OTH" );
        miscSegment.setDepartureDateTime( "04-29" );
        miscSegment.setNumberInParty( new BigInteger( "1" ));
        miscSegment.setStatus( "GK" );
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation originLocation = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.OriginLocation();
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs vendorPrefs = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs();
        PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline airline = new PassengerDetailsRQ.MiscSegmentSellRQ.MiscSegment.VendorPrefs.Airline();

        originLocation.setLocationCode( "DFW" );
        airline.setCode( "LH" );
        vendorPrefs.setAirline( airline );

        miscSegment.setOriginLocation( originLocation );
        miscSegment.setVendorPrefs( vendorPrefs );
        miscSegmentSellRQ.setMiscSegment( miscSegment );

        return miscSegmentSellRQ;
    }

    private PassengerDetailsRQ.PostProcessing getPostProcessing() {

        PassengerDetailsRQ.PostProcessing postProcessing = new PassengerDetailsRQ.PostProcessing();
        postProcessing.setRedisplayReservation( true );
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ endTransactionRQ = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ();
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source source = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ.Source();
        source.setReceivedFrom( "SWSTesting" );
        endTransactionRQ.setSource( source );

        postProcessing.setEndTransactionRQ( endTransactionRQ );

        return postProcessing;
    }

    private PassengerDetailsRQ.SpecialReqDetails getSpecialReqDetails() {

        PassengerDetailsRQ.SpecialReqDetails specialReqDetails = new PassengerDetailsRQ.SpecialReqDetails();

        specialReqDetails.setAddRemarkRQ( getAddRemarkRQ() );

        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ specialServiceRQ = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ();
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo specialServiceInfo = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo();
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight secureFlight = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight();
        secureFlight.setSSRCode( "DOCS" );
        secureFlight.setSegmentNumber( "A" );

        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName personName = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.PersonName();
        personName.setGivenName( "SWS" );
        personName.setSurname( "TEST" );
        personName.setDateOfBirth( "1977-11-27" );
        personName.setGender( "M" );
        personName.setNameNumber( "1.1" );
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs vendorPrefs1 = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs();
        PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline airline1 = new PassengerDetailsRQ.SpecialReqDetails.SpecialServiceRQ.SpecialServiceInfo.SecureFlight.VendorPrefs.Airline();
        airline1.setHosted( true );
        vendorPrefs1.setAirline( airline1 );
        secureFlight.setPersonName( personName );
        secureFlight.setVendorPrefs( vendorPrefs1 );
        specialServiceInfo.getSecureFlight().add( secureFlight );
        specialServiceRQ.setSpecialServiceInfo( specialServiceInfo );

        specialReqDetails.setSpecialServiceRQ( specialServiceRQ );

        return specialReqDetails;
    }

    private PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ getAddRemarkRQ() {

        PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ addRemarkRQ = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ();

        PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo remarkInfo = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo();
        PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark fopRemark = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.FOPRemark();

        PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark [] remarks = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark[12];

        String [] texts = { "TEST ALPHA CODE REMARK",
                "TEST CLIENT ADDRESS REMARK", "CORP1212", "TEST GENERAL REMARK 1",
                "TEST GENERAL REMARK 2", "TEST GENERAL REMARK 3",
                "TEST DELIVERY ADDRESS REMARK", "TEST GROUP NAME REMARK",
                "TEST HIDDEN REMARK", "TEST HISTORICAL REMARK",
                "TEST ITIN REMARK", "TEST INVOICE REMARK", };

        String [] types = { "Alpha-Coded", "Client Address", "Corporate", "General", "General", "General", "Delivery Address", "Group Name", "Hidden", "Historical", "Itinerary", "Invoice" };

        for( int i = 0; i < 12; ++i ) {
            remarks[i] = new PassengerDetailsRQ.SpecialReqDetails.AddRemarkRQ.RemarkInfo.Remark();
            remarks[i].setText( texts[i] );
            remarks[i].setType( types[i] );
        }

        remarks[0].setCode( "H" );
        remarks[10].setSegmentNumber( "1" );
        remarks[11].setSegmentNumber( "1" );

        fopRemark.setType( "CASH" );
        remarkInfo.getRemark().addAll( Arrays.asList( remarks ) );
        remarkInfo.setFOPRemark( fopRemark );
        addRemarkRQ.setRemarkInfo( remarkInfo );

        return addRemarkRQ;
    }

    private PassengerDetailsRQ.PriceQuoteInfo getPriceQuoteInfo() {

        PassengerDetailsRQ.PriceQuoteInfo priceQuoteInfo = new PassengerDetailsRQ.PriceQuoteInfo();
        PassengerDetailsRQ.PriceQuoteInfo.Link link = new PassengerDetailsRQ.PriceQuoteInfo.Link();
        link.setNameNumber( "1.1" );
        link.setRecord( "1" );
        priceQuoteInfo.getLink().add( link );

        return priceQuoteInfo;
    }

    private PassengerDetailsRQ.TravelItineraryAddInfoRQ getTravelItineraryAddInfoRQ() {

        PassengerDetailsRQ.TravelItineraryAddInfoRQ travelItineraryAddInfoRQ = new PassengerDetailsRQ.TravelItineraryAddInfoRQ();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo agencyInfo = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing ticketing = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.AgencyInfo.Ticketing();
        ticketing.setTicketType( "7TAW" );
        agencyInfo.setTicketing( ticketing );

        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo customerInfo = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo();

        customerInfo.setContactNumbers( getContactNumbers() );

        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email email = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.Email();
        email.setAddress( "webservices.support@sabre.com" );
        email.setNameNumber( "1.1" );

        customerInfo.getEmail().add( email );
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName personName1 = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.PersonName();
        personName1.setNameNumber( "1.1" );
        personName1.setGivenName( "SWS" );
        personName1.setSurname( "TEST" );
        customerInfo.getPersonName().add( personName1 );
        travelItineraryAddInfoRQ.setCustomerInfo( customerInfo );

        return travelItineraryAddInfoRQ;
    }

    private PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers getContactNumbers() {

        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers contactNumbers = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers();

        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber contactNumber1 = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber();
        PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber contactNumber2 = new PassengerDetailsRQ.TravelItineraryAddInfoRQ.CustomerInfo.ContactNumbers.ContactNumber();

        contactNumber1.setLocationCode( "DFW" );
        contactNumber1.setNameNumber("1.1");
        contactNumber1.setPhone("817-555-1212");
        contactNumber1.setPhoneUseType("H");

        contactNumber2.setLocationCode( "DFW" );
        contactNumber2.setNameNumber( "1.1" );
        contactNumber2.setPhone( "682-555-1212" );
        contactNumber2.setPhoneUseType("O");

        contactNumbers.getContactNumber().add( contactNumber1 );
        contactNumbers.getContactNumber().add( contactNumber2 );

        return contactNumbers;
    }

}
