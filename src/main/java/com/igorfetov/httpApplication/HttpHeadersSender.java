package com.igorfetov.httpApplication;

import java.net.ProtocolException;

//TODO: Create an interface of header request library.
public interface HttpHeadersSender {

    void sendGetRequest() throws ProtocolException;
    void sendHeadRequest();
    void sendPostRequest();
    void sendPutRequest();
    void sendDeleteRequest();
    void sendConnectRequest();
    void sendOptionsRequest();
    void sendTraceRequest();
    void sendPatchRequest();
}
