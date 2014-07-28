package com.sabre.sws.tools.wsdl.commons.utils;

/**
 * Created by SG0221139 on 7/28/2014.
 */
public interface IEditableConfiguration extends IConfigurationProvider {

    public void setUsername( String username );

    public void setPassword( String password );

    public void setOrganization( String organization );

    public void setDomain( String domain );

    public void setEndpoint( String endpoint );

    public void setPCC( String pcc );

}
