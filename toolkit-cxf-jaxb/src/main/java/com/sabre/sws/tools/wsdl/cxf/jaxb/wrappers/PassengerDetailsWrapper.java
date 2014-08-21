package com.sabre.sws.tools.wsdl.cxf.jaxb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.cxf.jaxb.interceptors.SWSOResponseInterceptor;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.cxf.jaxb.utils.SecurityFactory;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRQ;
import com.sabre.webservices.sabrexml._2011._10.PassengerDetailsRS;
import https.webservices_sabre_com.websvc.PassengerDetailsPortType;
import https.webservices_sabre_com.websvc.PassengerDetailsService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by SG0221139 on 8/8/2014.
 */
public class PassengerDetailsWrapper {

    private static final String actionString = "PassengerDetailsRQ";

    public PassengerDetailsRS executeSampleRequest() {

        PassengerDetailsPortType port = getConfiguredPort();
        IConfigurationProvider configuration = Util.getConfigurationProvider();
        Security security = SecurityFactory.getSecurity( configuration, false );
        MessageHeader header = MessageHeaderFactory.getMessageHeader( configuration, actionString );

        PassengerDetailsRQ requestBody = getRequestBody();

        return port.passengerDetailsRQ( new Holder<> (header), new Holder<>(security), requestBody );
    }

    private PassengerDetailsRQ getRequestBody() {

        PassengerDetailsRQ request = new PassengerDetailsRQ();
        request.setVersion(ServicesVersionsProvider.getPassengerDetailsVersion());

        PassengerDetailsRQ.IgnoreOnError ignoreOnError = new PassengerDetailsRQ.IgnoreOnError();
        ignoreOnError.setInd( false );
        request.setIgnoreOnError( ignoreOnError );

        request.setMiscSegmentSellRQ( getMiscSegmentSellRQ() );
        request.setPostProcessing( getPostProcessing() );
        request.setPriceQuoteInfo( getPriceQuoteInfo() );
        request.setSpecialReqDetails( getSpecialReqDetails() );
        request.setTravelItineraryAddInfoRQ( getTravelItineraryAddInfoRQ() );

        return request;

    }

    private PassengerDetailsPortType getConfiguredPort() {
        PassengerDetailsService service = new PassengerDetailsService();
        PassengerDetailsPortType port = service.getPassengerDetailsPortType();

        setEndpointFromConfiguration( port );
        addInterceptors( port );

        return port;
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
        endpoint.getInInterceptors().add( new SWSOResponseInterceptor() );
        endpoint.getOutInterceptors().add( new LoggingOutInterceptor() );
    }

    private PassengerDetailsRQ.MiscSegmentSellRQ getMiscSegmentSellRQ() {

        PassengerDetailsRQ.MiscSegmentSellRQ miscSegmentSellRQ = new PassengerDetailsRQ.MiscSegmentSellRQ();
        miscSegmentSellRQ.setHaltOnError( true );
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
        postProcessing.setHaltOnError( true );
        postProcessing.setRedisplayReservation( true );
        PassengerDetailsRQ.PostProcessing.EndTransactionRQ endTransactionRQ = new PassengerDetailsRQ.PostProcessing.EndTransactionRQ();
        endTransactionRQ.setHaltOnError( true );
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
        specialServiceRQ.setHaltOnError( true );
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
        addRemarkRQ.setHaltOnError( true );

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
        priceQuoteInfo.setHaltOnError( true );
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
