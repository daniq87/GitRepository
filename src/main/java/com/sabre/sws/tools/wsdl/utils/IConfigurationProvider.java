package com.sabre.sws.tools.wsdl.utils;

/**
 * Created by SG0221139 on 7/11/2014.
 */
public interface IConfigurationProvider {

    public String getUsername();

    public String getPassword();

    public String getOrganization();

    public String getDomain();

    public String getEndpoint();

    public String getPCC();

    public boolean isProxyRequired();

    public String getProxyPassword();

    public String getProxyUsername();

}