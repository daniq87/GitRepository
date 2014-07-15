package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.OTA_AirAvailServiceStub;
import com.sabre.sws.tools.wsdl.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.utils.MustUnderstandHandler;
import com.sabre.sws.tools.wsdl.wrappers.helpers.AirAvailHelper;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.engine.AxisConfiguration;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class AirAvailWrapper extends OTA_AirAvailServiceStub {

    private final IConfigurationProvider configuration;

    private final String prodRegex = ".*?webservices\\.sabre\\.com.*?";

    public AirAvailWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super( ConfigurationContextFactory.createConfigurationContextFromFileSystem( null, null ),   configuration.getEndpoint() );
        this.configuration = configuration;
    }

    public AirAvailWrapper( ConfigurationContext context, IConfigurationProvider configuration ) throws AxisFault {
        super( context, configuration.getEndpoint() );
        this.configuration = configuration;
    }

    public OTA_AirAvailRS executeExampleRequest() throws RemoteException {

        AirAvailHelper helper = new AirAvailHelper();

        Security3 security = helper.getSecuirityInstance( configuration );
        MessageHeader header = helper.getMessageHeaderInstance( configuration );

        OTA_AirAvailRQ requestBody = helper.geEmptytAirAvailRQInstance( configuration );

        // requestBody must be created manually here

            requestBody.getOriginDestinationInformation().getFlightSegment().setDepartureDateTime(
                    new DateOrTime() {
                {{ setDateOrTime( "12-21" ); }}
            });

            requestBody.getOriginDestinationInformation().getFlightSegment().getDestinationLocation().setLocationCode( "LHR" );
            requestBody.getOriginDestinationInformation().getFlightSegment().getOriginLocation().setLocationCode( "DFW" );
        // requestBody creation end

        AxisConfiguration cfg = _getServiceClient().getAxisConfiguration();
        List list = new ArrayList();        // TODO: Can we do anything with it?
        list.add( new MustUnderstandHandler() );
        cfg.setInPhasesUptoAndIncludingPostDispatch( list );
        cfg.setInFaultPhases( list );

        return oTA_AirAvailRQ( requestBody, header, security );
    }

}
