package com.sabre.sws.tools.wsdl.wsimport.wrappers;

import com.sabre.sws.tools.wsdl.commons.utils.IConfigurationProvider;
import com.sabre.sws.tools.wsdl.commons.utils.Util;
import com.sabre.sws.tools.wsdl.wsimport.utils.MessageHeaderFactory;
import com.sabre.sws.tools.wsdl.wsimport.utils.SecurityFactory;
import https.webservices_sabre_com.websvc.SessionCreatePortType;
import https.webservices_sabre_com.websvc.SessionCreateRQService;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRS;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

/**
 * Created by SG0221139 on 8/22/2014.
 */
public class SessionCreateWrapper {

    private final SessionCreatePortType port;
    private final IConfigurationProvider configuration = Util.getConfigurationProvider();
    private final static String serviceAction = "SessionCreateRQ";

    public SessionCreateWrapper() {

        port = new SessionCreateRQService().getSessionCreatePortType();

        String endpointURL = Util.getConfigurationProvider().getEndpoint();
        endpointURL = "http://localhost:8088/mockSessionCreateSoapBinding";
        ((BindingProvider) port).getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL );
    }

    public SessionCreateRS openSession() {

        MessageHeader header = MessageHeaderFactory.getMessageHeader( serviceAction );
        Security security = SecurityFactory.getCredentialsSecurity();

        return port.sessionCreateRQ(
            new Holder<>(header),
            new Holder<>(security),
            getRequestBody()
        );
    }

    private SessionCreateRQ getRequestBody() {

        SessionCreateRQ requestBody = new SessionCreateRQ();

        SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
        SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();
        String pcc = configuration.getPCC();
        source.setPseudoCityCode( pcc );
        pos.setSource( source );

        requestBody.setPOS( pos );

        return requestBody;
    }

}
