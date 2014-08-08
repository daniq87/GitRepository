package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.AirAvailHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.ServicesVersionsProvider;
import com.sabre.sws.tools.wsdl.stubs.adb.OTA_AirAvailServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class AirAvailWrapper extends OTA_AirAvailServiceStub {

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

    private OTA_AirAvailRQ getSampleRequestBody1() {
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

    private OTA_AirAvailRQ getSampleRequestBody2() {
        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( version );

        requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                new DateOrTime() {{ setDateOrTime( "12-21T18:00" ); }});
        requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "FRA" );
        requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

        return requestBody;
    }

    private OTA_AirAvailRQ getSampleRequestBody3() {
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

    private OTA_AirAvailRQ getSampleRequestBody4() {
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

    private OTA_AirAvailRQ getSampleRequestBody( int index ) {

        OTA_AirAvailRQ requestBody;

        switch ( index ) {

            case 0:         // 121DECDFWLHR

                requestBody = getSampleRequestBody1();
                break;

            case 1:

                requestBody = getSampleRequestBody2();
                break;

            case 2:          // 121DECDFWLHR‡*AA

                requestBody = getSampleRequestBody3();
                break;

            case 3:

                requestBody = getSampleRequestBody4();
                break;

            default:
                throw new UnsupportedOperationException( "Invalid sample request index" );
        }
        return requestBody;
    }

    public OTA_AirAvailRS executeSampleRequest( int requestIndex ) throws RemoteException {

        AirAvailHelper helper = new AirAvailHelper();

        Security7 security = helper.getSecuirityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );

        OTA_AirAvailRQ requestBody = getSampleRequestBody( requestIndex );

        System.out.println( "\tExecuting AirAvail call for:" );

        System.out.println( "\t\t" + requestBody
                .getOriginDestinationInformation()
                .getFlightSegment()
                .getDepartureDateTime()
                .toString()
        );

        System.out.println( "\t\tFrom: " +
                 requestBody
                    .getOriginDestinationInformation()
                    .getFlightSegment()
                    .getOriginLocation()
                    .getLocationCode()
                    .toString()
        );

        System.out.println( "\t\tTo: " +
            requestBody
                .getOriginDestinationInformation()
                .getFlightSegment()
                .getDestinationLocation()
                .getLocationCode()
                .toString()
        );

        return oTA_AirAvailRQ( requestBody, header, security );
    }

}
