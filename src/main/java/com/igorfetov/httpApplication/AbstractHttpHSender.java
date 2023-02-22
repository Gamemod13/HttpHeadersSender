package com.igorfetov.httpApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Abstract implementation of <b>HTTP Sender</b>
 * Create new HTTP URL Connection, create map of Headers.
 * Implement requests ''''''''
 */
public abstract class AbstractHttpHSender implements HttpHeadersSender {
    private final HttpURLConnection connection;
    private Map<String, String> headers = setUpHeaders();

    public static Map<String, String> emptyHeaders(){
        return new LinkedHashMap<>() {{
            put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
            put("accept-encoding", "gzip, deflate, br");
            put("accept-language"," ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
            put("cache-control", "max-age=0");
            put("sec-ch-ua","\"Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110\"");
            put("sec-ch-ua-mobile","?0");
            put("sec-ch-ua-platform","\"Windows\"");
            put("sec-fetch-dest","document");
            put("sec-fetch-mode","navigate");
            put("sec-fetch-site","same-origin");
            put("sec-fetch-user","?1");
            put("upgrade-insecure-requests","1");
            put("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
            /*

            sec-ch-ua: "Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"
            sec-ch-ua-mobile: ?0
            sec-ch-ua-platform: "Windows"
            sec-fetch-dest: document
            sec-fetch-mode: navigate
            sec-fetch-site: same-origin
            sec-fetch-user: ?1
            upgrade-insecure-requests: 1
            user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36
            put("Accept", "value");
            put("Accept-Charset", "value");
            put("Accept-Language", "value");
            put("Allow", "value");
            put("Content-Encoding", "value");
            put("Content-Language", "value");
            put("Content-Location", "value");
            put("Content-Type", "value");
            put("Date", "value");
            put("Expect", "value");
            put("From", "value");
            put("Location", "value");
            put("Max-Forwards", "value");
            put("MIME-Version", "value");
            put("Referer", "value");
            put("Retry-After", "value");
            put("Server", "value");
            put("User-Agent", "value");
            put("Vary", "value");

             */
        }};
    }

    /**
     *
     * @param httpPath
     * @throws IOException
     */
    AbstractHttpHSender(String httpPath) throws IOException {
        URL url = new URL(httpPath);
        connection = (HttpURLConnection) url.openConnection();
        assert connection != null;
    }

    /**
     *
     */
    protected Map<String,String> setUpHeaders() {
        return emptyHeaders();
    }

    /**
     *
     * @return
     * @throws IOException
     */
    private int getResponseCode() throws IOException {
        return connection.getResponseCode();
    }

    /**
     *
     */
    private void sendHeaders() {
        assert headers != null;
        headers.forEach(connection::setRequestProperty);
    }

    /**
     *
     * @throws IOException
     */
    public void sendGetRequest() throws IOException {
        connection.setRequestMethod("GET");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public void sendPostRequest() throws IOException {
        connection.setRequestMethod("POST");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public  void sendPutRequest() throws IOException {
        connection.setRequestMethod("PUT");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public  void sendDeleteRequest() throws IOException {
        connection.setRequestMethod("DELETE");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public void sendConnectRequest() throws IOException {
        connection.setRequestMethod("CONNECT");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public void sendOptionsRequest() throws IOException {
        connection.setRequestMethod("OPTIONS");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public void sendTraceRequest() throws IOException {
        connection.setRequestMethod("TRACE");
        sendHeaders();
        System.out.println(getResponseCode());
    }

    /**
     *
     * @throws IOException
     */
    public void sendPatchRequest() throws IOException {
        connection.setRequestMethod("PATCH");
        sendHeaders();
        System.out.println(getResponseCode());
    }

}
