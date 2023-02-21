package com.igorfetov.httpApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class AbstractHttpHSender implements HttpHeadersSender{
    private HttpURLConnection connection;

    AbstractHttpHSender(String httpPath) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(httpPath).openConnection();
    }
    public abstract void sendGetRequest();
    public abstract void sendHeadRequest();
    public abstract void sendPostRequest();
    public abstract void sendPutRequest();
    public abstract void sendDeleteRequest();
    public abstract void sendConnectRequest();
    public abstract void sendOptionsRequest();
    public abstract void sendTraceRequest();
    public abstract void sendPatchRequest();
}
