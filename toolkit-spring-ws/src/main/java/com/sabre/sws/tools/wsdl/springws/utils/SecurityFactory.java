package com.sabre.sws.tools.wsdl.springws.utils;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.SessionManager;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.springws.soap.Security;

/**
 * Created by SG0221139 on 8/14/2014.
 */
public class SecurityFactory {

    private static final IConfigurationProvider configuration = Util.getConfigurationProvider();

    public static Security getCredentialsSecurity() {

        Security security = new Security();
        Security.UsernameToken usernameToken = new Security.UsernameToken();

        usernameToken.setDomain(configuration.getDomain());
        usernameToken.setOrganization(configuration.getOrganization());
        usernameToken.setPassword(configuration.getPassword());
        usernameToken.setUsername(configuration.getUsername());
        security.setUsernameToken(usernameToken);

        return security;
    }

    public static Security getTokenSecurity() {

        Security security = new Security();
        String token = SessionManager.getInstance().getToken();
        security.setBinarySecurityToken( token );
        return security;
    }

}
