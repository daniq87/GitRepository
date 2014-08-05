package com.sabre.sws.tools.wsdl.cxf.jaxb.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.cxf.jaxb.Security;

import static com.sabre.sws.tools.wsdl.cxf.jaxb.Security.UsernameToken;

/**
 * Created by SG0221139 on 8/5/2014.
 */
public class SecurityFactory {

    private SecurityFactory() {

    }

    public static Security getSecurity( IConfigurationProvider configuration, boolean creatingSession ) {

        Security instance = new Security();

        if( creatingSession ) {
            UsernameToken token = new UsernameToken();

            token.setDomain( configuration.getDomain() );
            token.setOrganization( configuration.getOrganization() );
            token.setPassword(configuration.getPassword() );
            token.setUsername( configuration.getUsername() );

            instance.setUsernameToken( token );
        } else {
            instance.setBinarySecurityToken(SessionManager.getInstance().getToken() );
        }
        return instance;
    }

}
