package com.sabre.sws.tools.wsdl.cxf.jaxb.utils;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by SG0221139 on 9/15/2014.
 */
public class SoapMessageUtils {

    public static CachedOutputStream copyMessageIntoStream(SoapMessage message) throws IOException {

        InputStream messageContentInputStream = message.getContent(InputStream.class);
        CachedOutputStream messageCopyStream = new CachedOutputStream();

        if (messageContentInputStream != null) {
            IOUtils.copy(messageContentInputStream, messageCopyStream);

            messageCopyStream.flush();
            messageContentInputStream.close();
            message.setContent(InputStream.class,messageCopyStream.getInputStream());
            messageCopyStream.close();

            IOUtils.copy(messageContentInputStream, messageCopyStream);
        }
        return messageCopyStream;
    }

}
