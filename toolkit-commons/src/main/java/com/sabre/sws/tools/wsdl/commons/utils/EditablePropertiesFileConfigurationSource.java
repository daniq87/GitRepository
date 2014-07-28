package com.sabre.sws.tools.wsdl.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by SG0221139 on 7/11/2014.
 */

public class EditablePropertiesFileConfigurationSource implements IEditableConfiguration {

    private String username;
    private String password;
    private String organization;
    private String domain;

    private String PCC;
    private String endpoint;
    private final int maxConnections;


    @Override
    public void setPCC(String PCC) {
        this.PCC = PCC;
    }

    @Override
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }

    public EditablePropertiesFileConfigurationSource( File file ) throws IOException {

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

        inputStream.close();

    }


    public EditablePropertiesFileConfigurationSource( String propertiesFileLocation ) throws IOException {
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
    public String getPCC() {
        return new String( this.PCC );
    }


}

