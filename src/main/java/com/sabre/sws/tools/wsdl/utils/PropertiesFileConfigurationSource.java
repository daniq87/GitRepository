package com.sabre.sws.tools.wsdl.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0221139 on 7/11/2014.
 */

public class PropertiesFileConfigurationSource implements IConfigurationProvider {

    private final String username;
    private final String password;
    private final String organization;
    private final String domain;
    private final String PCC;

    private final String endpoint;
    private final int maxConnections;

    private final boolean proxyRequired;
    private final String proxyPassword;
    private final String proxyUsername;


    public PropertiesFileConfigurationSource( File file ) throws IOException {

        Properties properties = new Properties();

        InputStream inputStream = new FileInputStream( file );

        properties.load( inputStream );

        this.username = properties.getProperty( "username" );
        this.password = properties.getProperty( "password" );
        this.organization = properties.getProperty( "organization" );
        this.domain = properties.getProperty( "domain" );
        this.PCC = properties.getProperty( "PCC" );

        this.endpoint = properties.getProperty( "endpoint" );
        this.maxConnections = Integer.parseInt( properties.getProperty("max_connections") );

        this.proxyRequired = properties.getProperty( "proxy_required" ).equals( "true" );
        this.proxyPassword = properties.getProperty("proxy_password");
        this.proxyUsername = properties.getProperty( "proxy_username" );

        inputStream.close();

    }

    @Override
    public String getProxyPassword() {
        return new String( proxyPassword );
    }

    @Override
    public String getProxyUsername() {
        return new String( proxyUsername );
    }

    public PropertiesFileConfigurationSource( String propertiesFileLocation ) throws IOException {
        this(new File(propertiesFileLocation));
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
    public boolean isProxyRequired() {
        return this.proxyRequired;
    }

    @Override
    public String getPCC() {
        return new String( this.PCC );
    }
}

