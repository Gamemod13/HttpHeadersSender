package com.igorfetov.httpApplication;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHttpHSender implements HttpHeadersSender{
    private HttpURLConnection connection;

    AbstractHttpHSender(String httpPath) throws IOException {
        URL url = new URL(httpPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    }
    private void sendHeaders() throws ProtocolException {
        Map<String, String> headers = Map.of(
                "Accept", "value",
                "Accept-Charset", "value",
                "Accept-Language", "value",
                "Allow", "value",
                "Content-Encoding", "value",
                "Content-Language", "value",
                "Content-Location", "value",
                "Content-Type", "value",
                "Date", "value",
                "Expect", "value",
                "From", "value",
                "Location", "value",
                "Max-Forwards", "value",
                "MIME-Version", "value",
                "Referer", "value",
                /*
                 Accept            | http     | standard | Section 5.3.2   |
   | Accept-Charset    | http     | standard | Section 5.3.3   |
   | Accept-Encoding   | http     | standard | Section 5.3.4   |
   | Accept-Language   | http     | standard | Section 5.3.5   |
   | Allow             | http     | standard | Section 7.4.1   |
   | Content-Encoding  | http     | standard | Section 3.1.2.2 |
   | Content-Language  | http     | standard | Section 3.1.3.2 |
   | Content-Location  | http     | standard | Section 3.1.4.2 |
   | Content-Type      | http     | standard | Section 3.1.1.5 |
   | Date              | http     | standard | Section 7.1.1.2 |
   | Expect            | http     | standard | Section 5.1.1   |
   | From              | http     | standard | Section 5.5.1   |
   | Location          | http     | standard | Section 7.1.2   |
   | Max-Forwards      | http     | standard | Section 5.1.2   |
   | MIME-Version      | http     | standard | Appendix A.1    |
   | Referer           | http     | standard | Section 5.5.2   |
   | Retry-After       | http     | standard | Section 7.1.3   |
   | Server            | http     | standard | Section 7.4.2   |
   | User-Agent        | http     | standard | Section 5.5.3   |
   | Vary
                 */
        );
        connection.setRequestProperty();
    }
    public void sendGetRequest() throws ProtocolException {
        connection.setRequestMethod("GET");
    };
    public abstract void sendHeadRequest(){
    }

    public abstract void sendPostRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendPutRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendDeleteRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendConnectRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendOptionsRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendTraceRequest(){
        connection.setRequestMethod("GET");
    }
    public abstract void sendPatchRequest(){
        connection.setRequestMethod("GET");
    }
}
