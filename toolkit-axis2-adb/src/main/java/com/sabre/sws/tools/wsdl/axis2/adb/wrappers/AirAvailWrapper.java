package com.sabre.sws.tools.wsdl.axis2.adb.wrappers;

import com.sabre.sws.tools.wsdl.axis2.adb.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.axis2.adb.wrappers.helpers.AirAvailHelper;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class AirAvailWrapper extends OTA_AirAvailServiceStub {

    private final IConfigurationProvider configuration;

    private final String prodRegex = ".*?webservices\\.sabre\\.com.*?";

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

    private OTA_AirAvailRQ getSampleRequestBody( int index ) {

        OTA_AirAvailRQ requestBody = new AirAvailHelper().geEmptytAirAvailRQInstance( configuration );
        requestBody.setVersion( "2.0.0" );  // TODO

        switch ( index ) {

            case 0:         // 121DECDFWLHR

                requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                        new DateOrTime() {
                            {{ setDateOrTime( "12-21" ); }}
                        });

                requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "LHR" );
                requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

                break;

            case 1:

                requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                        new DateOrTime() {{ setDateOrTime( "12-21T18:00" ); }});
                requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "FRA" );
                requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

                break;

            case 2:          // 121DECDFWLHR‡*AA

                requestBody.setOptionalQualifiers( new OptionalQualifiers_type0() );
                requestBody.getOptionalQualifiers().setFlightQualifiers( new FlightQualifiers_type0() );

                VendorPrefs_type0 vendorPrefs = new VendorPrefs_type0();
//                vendorPrefs.setExclude( true );
                Airline_type0 airline = new Airline_type0();
                airline.setCode( "AA" );
                vendorPrefs.addAirline( airline );
                requestBody.getOptionalQualifiers().getFlightQualifiers().setVendorPrefs( vendorPrefs );

                requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(new DateOrTime() {{
                    setDateOrTime("12-21");
                }});
                requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "LHR" );
                requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );

                // Debug

                requestBody = new OTA_AirAvailRQ();
                requestBody.setVersion( "2.0.0" );
                requestBody.setOptionalQualifiers( new OptionalQualifiers_type0() );
                requestBody.getOptionalQualifiers().setFlightQualifiers( new FlightQualifiers_type0() );
                requestBody.getOptionalQualifiers().getFlightQualifiers().setVendorPrefs( new VendorPrefs_type0() );
                requestBody.getOptionalQualifiers().getFlightQualifiers().getVendorPrefs().setExclude( true );
                Airline_type0 airlinee = new Airline_type0();
                airlinee.setCode( "AA" );
                requestBody.getOptionalQualifiers().getFlightQualifiers().getVendorPrefs().addAirline( airlinee );

                requestBody.setOriginDestinationInformation( new OriginDestinationInformation_type0());
                requestBody.getOriginDestinationInformation().setFlightSegment( new FlightSegment_type0() );
                DateOrTime departureTime = new DateOrTime();
                departureTime.setDateOrTime( "12-21" );
                requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime( departureTime );
                DestinationLocation_type0 dest = new DestinationLocation_type0();
                dest.setLocationCode( "LHR" );
                OriginLocation_type0 origin = new OriginLocation_type0();
                origin.setLocationCode( "DFW" );

                requestBody.getOriginDestinationInformation().getFlightSegment().setDestinationLocation( dest );
                requestBody.getOriginDestinationInformation().getFlightSegment().setOriginLocation( origin );

                // /Debug

                break;

            case 3:

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

        return oTA_AirAvailRQ( requestBody, header, security );
    }

}
