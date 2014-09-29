package com.sabre.sws.tools.wsdl.axis2.xmlbeans.wrappers;

import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.AirAvailRQFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils.SecurityFactory;
import com.sabre.sws.tools.wsdl.commons.utils.AirAvailRequests;
import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.MessageHandlerManager;
import com.sabre.sws.tools.wsdl.stubs.xmlbeans.OTA_AirAvailServiceStub;
import com.sabre.webservices.sabrexml._2011._10.OTAAirAvailRSDocument;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContextFactory;

import java.rmi.RemoteException;

/**
 * Created by SG0221139 on 9/6/2014.
 */
public class AirAvailWrapper extends OTA_AirAvailServiceStub {

    private final IConfigurationProvider configuration;

    private final String actionString = "OTA_AirAvailLLSRQ";

    public AirAvailWrapper( IConfigurationProvider configuration ) throws AxisFault {
        super(ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null),
                configuration.getEndpoint() );
        this.configuration = configuration;
        MessageHandlerManager.addStub( this );
    }

    public OTAAirAvailRSDocument executeSampleRequest( AirAvailRequests requestType ) throws RemoteException {

        return oTA_AirAvailRQ(
                AirAvailRQFactory.getOTAAirAvailRequest( configuration, requestType ),
                MessageHeaderFactory.getMessageHeader( configuration, actionString),
                SecurityFactory.getSecuirtyDocument( configuration, false )
        );

    }
}
