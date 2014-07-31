package com.sabre.sws.tools.wsdl.axis2.xmlbeans.utils;


import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import org.xmlsoap.schemas.ws._2002._12.secext.SecurityDocument;

/**
 * Created by SG0221139 on 7/29/2014.
 */
public class SecurityFactory {

    private SecurityFactory() {

    }

    public static SecurityDocument getSecuirtyDocument( IConfigurationProvider configuration ) {

        SecurityDocument instance = SecurityDocument.Factory.newInstance();

        SecurityDocument.Security security = instance.getSecurity();

        SecurityDocument.Security.UsernameToken usernameToken = security.addNewUsernameToken();
        usernameToken.setUsername( configuration.getUsername() );
        usernameToken.setDomain( configuration.getDomain() );
        usernameToken.setOrganization( configuration.getOrganization() );
        usernameToken.setPassword( configuration.getPassword() );

        return instance;
    }

}
