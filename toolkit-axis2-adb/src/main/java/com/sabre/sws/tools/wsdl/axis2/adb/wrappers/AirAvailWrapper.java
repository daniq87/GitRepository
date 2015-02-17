package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.AirAvailHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.stubs.adb.OTA_AirAvailServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 *
 * Wrapper classes are convenience classes for the purpose of constructing example requests
 * Below pattern may be used to construct requests accordingly to Sabre client's application
 * business logic, or may just serve as a demonstration on how to use Axis2 and ADB technologies
 * to consume Sabre Web Services.
 *
 */
public class AirAvailWrapper extends OTA_AirAvailServiceStub {

    private static final Logger LOGGER = LogManager.getLogger(AirAvailWrapper.class);

    private final IConfigurationProvider configuration;
    private String version = ServicesVersionsProvider.getOtaAirAvailVersion();

    public AirAvailWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super( ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ),   configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub(this);
    }

    public AirAvailWrapper( ConfigurationContext context, IConfigurationProvider configuration ) throws AxisFault {
        super( context, configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    private OTA_AirAvailRQ getRequestWithTwoPointsAndDepartureDate() {
        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( version );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                new DateOrTime() {
                    {{ setDateOrTime( "12-21" ); }}
                });

        requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "LHR" );
        requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

        return requestBody;
    }

    private OTA_AirAvailRQ getRequestWithTwoPointsAndDepartureHour() {
        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( version );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                new DateOrTime() {{ setDateOrTime( "12-21T18:00" ); }});
        requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "FRA" );
        requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

        return requestBody;
    }

    private OTA_AirAvailRQ getRequestWithTwoPointsAndVendroPrefs() {
        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( version );

        requestBody.setOptionalQualifiers( new OptionalQualifiers_type0() );
        requestBody.getOptionalQualifiers().setFlightQualifiers( new FlightQualifiers_type0() );

        VendorPrefs_type0 vendorPrefs = new VendorPrefs_type0();
        Airline_type0 airline = new Airline_type0();
        airline.setCode( "AA" );
        vendorPrefs.addAirline( airline );
        requestBody.getOptionalQualifiers().getFlightQualifiers().setVendorPrefs( vendorPrefs );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(new DateOrTime() {{
            setDateOrTime("12-21");
        }});
        requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "LHR" );
        requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

        return requestBody;
    }

    private OTA_AirAvailRQ getRequestWithMultilegFlightSegmentAndVendorPrefs() {
        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( version );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                new DateOrTime() {{ setDateOrTime( "12-21T12:00" ); }}
        );

        requestBody.getOriginDestinationInformation().getFlightSegment().setConnectionLocations( new ConnectionLocations_type0() );
        requestBody.getOriginDestinationInformation().getFlightSegment().getConnectionLocations().addConnectionLocation(new ConnectionLocation_type0() {{ setLocationCode( "LAX" ); }} );
        requestBody.getOriginDestinationInformation().getFlightSegment().getConnectionLocations().setCarrierSpecificDisplay(
                new CarrierSpecificDisplay_type0() {{
                    setLegOne(new LegOne_type0() {{
                        setVendorPrefs(new VendorPrefs_type1() {{
                            setExcludeCodeshares(true);
                            addAirline(new Airline_type1() {{
                                setCode("AA");
                            }});
                            addAirline(new Airline_type1() {{
                                setCode("BA");
                            }});
                        }});
                    }});

                    setLegTwo(new LegTwo_type0() {{
                        setVendorPrefs(new VendorPrefs_type3() {{
                            setExcludeCodeshares(true);
                            addAirline(new Airline_type3() {{
                                setCode("AA");
                            }});
                            addAirline(new Airline_type3() {{
                                setCode("BA");
                            }});
                        }});
                    }});

                }}
        );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDestinationLocation(
                new DestinationLocation_type0() {{ setLocationCode( "SYD" ); }} );

        requestBody.getOriginDestinationInformation().getFlightSegment().setOriginLocation(
                new OriginLocation_type0() {{ setLocationCode( "DFW" ); }}
        );

        return requestBody;
    }

    private OTA_AirAvailRQ getSampleRequestBody( AirAvailRequests requestType ) {

        OTA_AirAvailRQ requestBody = null;

        switch ( requestType ) {

            case TWO_POINTS_WITH_DEPARTURE_DATE:         // 121DECDFWLHR

                requestBody = getRequestWithTwoPointsAndDepartureDate();
                break;

            case TWO_POINTS_WITH_DEPARTURE_HOUR:

                requestBody = getRequestWithTwoPointsAndDepartureHour();
                break;

            case TWO_POINTS_WITH_VENDOR_PREFS:          // 121DECDFWLHR‡*AA

                requestBody = getRequestWithTwoPointsAndVendroPrefs();
                break;

            case MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS:

                requestBody = getRequestWithMultilegFlightSegmentAndVendorPrefs();
                break;

        }
        return requestBody;
    }

    public OTA_AirAvailRS executeSampleRequest( AirAvailRequests requestType ) throws RemoteException {

        AirAvailHelper helper = new AirAvailHelper();

        Security3 security = helper.getSecuirityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );

        OTA_AirAvailRQ requestBody = getSampleRequestBody( requestType );

        StringBuffer outputMessageBuffer = new StringBuffer();

        outputMessageBuffer.append("\tExecuting AirAvail call for:");

        outputMessageBuffer.append("\t\t" + requestBody
                        .getOriginDestinationInformation()
                        .getFlightSegment()
                        .getDepartureDateTime()
                        .toString()
        );

        outputMessageBuffer.append("\t\tFrom: " +
                        requestBody
                                .getOriginDestinationInformation()
                                .getFlightSegment()
                                .getOriginLocation()
                                .getLocationCode()
                                .toString()
        );

        outputMessageBuffer.append("\t\tTo: " +
                        requestBody
                                .getOriginDestinationInformation()
                                .getFlightSegment()
                                .getDestinationLocation()
                                .getLocationCode()
                                .toString()
        );

        LOGGER.info( outputMessageBuffer.toString() );

        return oTA_AirAvailRQ( requestBody, header, security );
    }

}
