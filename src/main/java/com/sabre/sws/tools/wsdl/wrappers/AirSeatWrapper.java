package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.AirSeatServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class AirSeatWrapper extends AirSeatServiceStub {

    public AirSeatWrapper(String targetEndpoint) throws AxisFault {
        super(targetEndpoint);
    }

    public AirSeatWrapper(ConfigurationContext configurationContext, String targetEndpoint) throws AxisFault {
        super(configurationContext, targetEndpoint);
    }
}
