package com.sabre.sws.tools.wsdl.wrappers;

import com.sabre.sws.tools.wsdl.stubs.OTA_AirScheduleServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public class AirScheduleWrapper extends OTA_AirScheduleServiceStub {
    public AirScheduleWrapper(ConfigurationContext configurationContext, String targetEndpoint) throws AxisFault {
        super(configurationContext, targetEndpoint);
    }

    public AirScheduleWrapper(String targetEndpoint) throws AxisFault {
        super(targetEndpoint);
    }
}
