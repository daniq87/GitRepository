package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.PassengerDetailsServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.wrappers.helpers.PassengerDetailsHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.math.BigInteger;
import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/21/2014.
 */
public class PassengerDetailsRQWrapper extends PassengerDetailsServiceStub {

    private final IConfigurationProvider configuration;

    public PassengerDetailsRQWrapper( ConfigurationContext configurationContext, IConfigurationProvider configuration ) throws AxisFault {
        super( configurationContext, configuration.getEndpoint() );
        MessageHandlerManager.addStub( this );
        this.configuration = configuration;
    }

    public PassengerDetailsRQWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ), configuration.getEndpoint() );
        MessageHandlerManager.addStub( this );
        this.configuration = configuration;
    }

    public PassengerDetailsRS executeSampleRequest() throws RemoteException {

        PassengerDetailsHelper helper = new PassengerDetailsHelper();

        PassengerDetailsRQ requestBody = helper.getRequestBody(configuration);
        MessageHeader header = helper.getMessageHeaderInstance( configuration );
        Security1 security = helper.getSecurityInstance( configuration );

        // IgnoreOnError = false
        IgnoreOnError_type0 ignoreOnError = new IgnoreOnError_type0();
        ignoreOnError.setInd( false );
        requestBody.setIgnoreOnError( ignoreOnError );

        // MiscSegmentSellRQ
        MiscSegmentSellRQ_type0 miscSegmentSellRQ = new MiscSegmentSellRQ_type0();
        miscSegmentSellRQ.setHaltOnError( true );
        MiscSegment_type1 miscSeg = new MiscSegment_type1();
        miscSeg.setType( new Type_type0( "OTH", false ) );
        miscSeg.setText( "RETENTION SEGMENT" );
        miscSeg.setDepartureDateTime(new Date() {{
            setDate("12-21");
        }});
        miscSeg.setNumberInParty( new BigInteger( "1" ) );
        miscSeg.setStatus("GK");
        OriginLocation_type11 originLocation = new OriginLocation_type11();
        VendorPrefs_type0 vendorPrefs = new VendorPrefs_type0();
        Airline_type2 airline = new Airline_type2();

        originLocation.setLocationCode( "DFW" );
        airline.setCode( "LH" );
        vendorPrefs.setAirline( airline );

        miscSeg.setOriginLocation( originLocation );
        miscSeg.setVendorPrefs( vendorPrefs );
        miscSegmentSellRQ.setMiscSegment( miscSeg );

        requestBody.setMiscSegmentSellRQ( miscSegmentSellRQ );

        // PostProcessing
        PostProcessing_type0 postProcessing = new PostProcessing_type0();
        postProcessing.setHaltOnError( true );
        postProcessing.setRedisplayReservation( true );
        EndTransactionRQ_type0 endTransactionRQ = new EndTransactionRQ_type0();
        endTransactionRQ.setHaltOnError( true );
        Source_type4 source = new Source_type4();
        source.setReceivedFrom( "SWS Testing" );
        endTransactionRQ.setSource( source );

        postProcessing.setEndTransactionRQ( endTransactionRQ );
        requestBody.setPostProcessing( postProcessing );

        // PriceQuoteInfo
        PriceQuoteInfo_type0 priceQuoteInfo = new PriceQuoteInfo_type0();
        priceQuoteInfo.setHaltOnError( true );
        Link_type0 link = new Link_type0();
        link.setNameNumber( "1.1" );
        link.setRecord( "1" );
        priceQuoteInfo.addLink(link);

        requestBody.setPriceQuoteInfo( priceQuoteInfo );

        // SpecialReqDetails

        SpecialReqDetails_type0 specialReqDet = new SpecialReqDetails_type0();

        AddRemarkRQ_type0 addRemark = new AddRemarkRQ_type0();
        addRemark.setHaltOnError( true );

        RemarkInfo_type1 remarkInfo = new RemarkInfo_type1();

        FOP_Remark_type0 fop = new FOP_Remark_type0();
        Remark_type1 [] remarks = new Remark_type1[12];

        for( int i = 0; i < 12; ++i ) {
            remarks[i] = new Remark_type1();
        }

        remarks[0].setType( new Type_type1( "Alpha-Coded", false ) );
        remarks[0].setCode(  "H" );
        remarks[1].setType( new Type_type1( "Client Address", false ) );
        remarks[2].setType( new Type_type1( "Corporate", false ) );
        remarks[3].setType( new Type_type1( "General", false ) );
        remarks[4].setType( new Type_type1( "General", false ) );
        remarks[5].setType( new Type_type1( "General", false ) );
        remarks[6].setType( new Type_type1( "Delivery Address", false ) );
        remarks[7].setType( new Type_type1( "Group Name", false ) );
        remarks[8].setType( new Type_type1( "Hidden", false ) );
        remarks[9].setType( new Type_type1( "Historical", false ) );
        remarks[10].setType(new Type_type1(  "Itinerary", false ) );
        remarks[10].setSegmentNumber( "1" );
        remarks[11].setType( new Type_type1( "Invoice", false ) );
        remarks[11].setSegmentNumber( "1" );

        String [] texts = { "TEST ALPHA CODE REMARK",
                "TEST CLIENT ADDRESS REMARK", "CORP1212", "TEST GENERAL REMARK1",
                "TEST GENERAL REMARK 2", "TEST GENERAL REMARK 3",
                "TEST DELIVERY ADDRESS REMARK", "TEST GROUP NAME REMARK",
                "TEST HIDDEN REMARK", "TEST HISTORICAL REMARK",
                "TEST ITIN REMARK", "TEST INVOICE REMARK", };

        for( int i = 0; i < 12; ++i ) {
            remarks[i].setText( texts[i] );
        }

        fop.setType( "CASH" );
        remarkInfo.setRemark( remarks );
        addRemark.setRemarkInfo( remarkInfo );

        specialReqDet.setAddRemarkRQ(addRemark);

        // SpecialServiceDetails

        SpecialServiceRQ_type0 specialServiceReq = new SpecialServiceRQ_type0();
        specialServiceReq.setHaltOnError( true );
        SpecialServiceInfo_type1 specialServiceInfo = new SpecialServiceInfo_type1();
        SecureFlight_type0 secureFlight = new SecureFlight_type0();
        secureFlight.setSSR_Code( "DOCS" );
        secureFlight.setSegmentNumber( "A" );
        PersonName_type6 personName = new PersonName_type6();
        personName.setGivenName( "SWS" );
        personName.setSurname("TEST");
        personName.setDateOfBirth(new Date() {{
            setDate("1977-11-27");
        }});
        personName.setGender(new Gender_type0("M", false));
        personName.setNameNumber( "1.1" );
        VendorPrefs_type1 vendorP = new VendorPrefs_type1();
        Airline_type3 airline1 = new Airline_type3();
//        airline1.setHosted( true );
        vendorP.setAirline(airline1);       // Doesn't work with this enabled
        secureFlight.setPersonName(personName);
        secureFlight.setVendorPrefs( vendorP );
        specialServiceInfo.addSecureFlight(secureFlight);
        specialServiceReq.setSpecialServiceInfo( specialServiceInfo );

        specialReqDet.setSpecialServiceRQ( specialServiceReq );
        requestBody.setSpecialReqDetails( specialReqDet );

        // TravelItineraryAddInfoRQ

        TravelItineraryAddInfoRQ_type0 travelItineraryAddInfoRQ = new TravelItineraryAddInfoRQ_type0();
        AgencyInfo_type0 agencyInfo = new AgencyInfo_type0();
        Ticketing_type2 ticketing = new Ticketing_type2();
        ticketing.setTicketType( new TicketType_type0( "7TAW", false ) );
        agencyInfo.setTicketing( ticketing );
        travelItineraryAddInfoRQ.setAgencyInfo( agencyInfo );

        CustomerInfo_type1 customerInfo = new CustomerInfo_type1();
        ContactNumber_type6 cn1 = new ContactNumber_type6();
        ContactNumber_type6 cn2 = new ContactNumber_type6();

        cn1.setLocationCode( "DFW" );
        cn1.setNameNumber( "1.1" );
        cn1.setPhone( "817-555-1212" );
        cn1.setPhoneUseType( "H" );

        cn2.setLocationCode( "DFW" );
        cn2.setNameNumber( "1.1" );
        cn2.setPhone( "682-555-1212" );
        cn2.setPhoneUseType( "O" );

        ContactNumbers_type6 cns = new ContactNumbers_type6();
        cns.addContactNumber( cn1 );
        cns.addContactNumber( cn2 );
        customerInfo.setContactNumbers( cns );

        Email_type1 email = new Email_type1();
        email.setAddress( "webservices.support@sabre.com" );
        email.setNameNumber( "1.1" );

        customerInfo.addEmail( email );
        PersonName_type8 personName1 = new PersonName_type8();
        personName1.setNameNumber( "1.1" );
        personName1.setGivenName( "SWS" );
        personName1.setSurname( "TEST" );
        customerInfo.addPersonName( personName1 );

        travelItineraryAddInfoRQ.setCustomerInfo( customerInfo );
        requestBody.setTravelItineraryAddInfoRQ( travelItineraryAddInfoRQ );

        // EndTransactionRQ

        PassengerDetailsRS instance = passengerDetailsRQ( requestBody, header, security );

        return instance;
    }

}
