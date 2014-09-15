package com.sabre.sws.tools.wsdl.commons.utils;

/**
 * Created by SG0221139 on 8/21/2014.
 * This enum type represents four types of available OTA_AirAvailLLSRQ requests.
 * It is used by the wrapper classes to which request should be made
 * and which request body should be returned by the factory methods.
 *
 */
public enum AirAvailRequests {

    TWO_POINTS_WITH_DEPARTURE_DATE,
    TWO_POINTS_WITH_DEPARTURE_HOUR,
    TWO_POINTS_WITH_VENDOR_PREFS,
    MULTILEG_FLIGHT_SEGMENT_WITH_VENDOR_PREFS

}
