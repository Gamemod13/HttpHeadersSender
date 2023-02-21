package com.igorfetov.httpApplication;

//TODO: Create an interface of header request library.
public interface HttpHeadersSender {

    void sendGetRequest();
    void sendHeadRequest();
    void sendPostRequest();
    void sendPutRequest();
    void sendDeleteRequest();
    void sendConnectRequest();
    void sendOptionsRequest();
    void sendTraceRequest();
    void sendPatchRequest();
}
