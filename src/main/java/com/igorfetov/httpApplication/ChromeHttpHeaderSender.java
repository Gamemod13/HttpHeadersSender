package com.igorfetov.httpApplication;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ChromeHttpHeaderSender extends AbstractHttpHSender {

    ChromeHttpHeaderSender(String httpPath) throws IOException {
        super(httpPath);
    }

    @Override
    public void sendGetRequest() {

    }

    @Override
    public void sendHeadRequest() {

    }

    @Override
    public void sendPostRequest() {

    }

    @Override
    public void sendPutRequest() {

    }

    @Override
    public void sendDeleteRequest() {

    }

    @Override
    public void sendConnectRequest() {

    }

    @Override
    public void sendOptionsRequest() {

    }

    @Override
    public void sendTraceRequest() {

    }

    @Override
    public void sendPatchRequest() {

    }
}