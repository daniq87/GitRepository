package com.sabre.sws.tools.wsdl.commons.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0221139 on 7/11/2014.
 */

public class InputStreamConfigurationSource implements IConfigurationProvider {

    private final String username;
    private final String password;
    private final String organization;
    private final String domain;
    private final String PCC;

    private final String endpoint;

    public InputStreamConfigurationSource(InputStream inputStream) throws IOException {

        Properties properties = new Properties();
        properties.load( inputStream );

        this.username = properties.getProperty( "username" );
        this.password = properties.getProperty( "password" );
        this.organization = properties.getProperty( "organization" );
        this.domain = properties.getProperty( "domain" );
        this.PCC = properties.getProperty( "PCC" );

        this.endpoint = properties.getProperty( "endpoint" );

        inputStream.close();

    }

    @Override
    public String getUsername() {
        return new String( this.username );
    }

    @Override
    public String getPassword() {
        return new String ( this.password );
    }

    @Override
    public String getOrganization() {
        return new String( this.organization );
    }

    @Override
    public String getDomain() {
        return new String( this.domain );
    }

    @Override
    public String getEndpoint() {
        return new String( this.endpoint );
    }

    @Override
    public String getPCC() {
        return new String( this.PCC );
    }


}

