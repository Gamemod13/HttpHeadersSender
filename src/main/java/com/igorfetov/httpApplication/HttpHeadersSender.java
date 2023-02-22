package com.igorfetov.httpApplication;

import java.io.IOException;
import java.net.ProtocolException;

//TODO: Create an interface of header request library.
public interface HttpHeadersSender {

    void sendGetRequest() throws IOException;
    void sendPostRequest() throws IOException;
    void sendPutRequest() throws IOException;
    void sendDeleteRequest() throws IOException;
    void sendConnectRequest() throws IOException;
    void sendOptionsRequest() throws IOException;
    void sendTraceRequest() throws IOException;
    void sendPatchRequest() throws IOException;
}
