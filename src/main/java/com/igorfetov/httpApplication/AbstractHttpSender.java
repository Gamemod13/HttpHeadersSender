/**
 * The main abstract class of library. Set the HTTP behaviour of the library.
 *
 * @author Gamemod13
 * @version 1.0
 */
package com.igorfetov.httpApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Abstract implementation of <b>HTTP Sender</b>
 * Create new HTTP URL Connection, create map of Headers.
 * Implement requests
 */
public abstract class AbstractHttpSender {

    /**
     * Connection HTTP used URL (defined in constructor)
     */
    private final HttpURLConnection connection;

    /**
     * Static method, get a Map with String Key and String value of headers.
     * In this iteration of program - map consist only one pair "user-agent" and appropriate value
     *
     * @return Map with String - String: header-body pair for header request.
     */
    public static Map<String, String> standardHeaders() {
        return new LinkedHashMap<>() {{
//            put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
//            put("accept-encoding", "gzip, deflate, br");
//            put("accept-language"," ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
//            put("cache-control", "max-age=0");
//            put("sec-ch-ua","\"Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110\"");
//            put("sec-ch-ua-mobile","?0");
//            put("sec-ch-ua-platform","\"Windows\"");
//            put("sec-fetch-dest","document");
//            put("sec-fetch-mode","navigate");
//            put("sec-fetch-site","same-origin");
//            put("sec-fetch-user","?1");
//            put("upgrade-insecure-requests","1");
            put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
        }};
    }

    /**
     * Unique constructor, set up the connection with server.
     * Accept the URL path in String.
     *
     * @param httpPath url address of server.
     * @throws IOException Opening the url connection can throw the Exception.
     */
    AbstractHttpSender(String httpPath) throws IOException {
        URL url = new URL(httpPath);
        connection = (HttpURLConnection) url.openConnection();
        assert connection != null;
    }

    /**
     * Method retrieves the value of a particular request
     * header that was set on an HTTP request.
     *
     * @param str key of Header
     * @return value of Header.
     */
    public String getRequestProperty(String str){
        return connection.getRequestProperty(str);
    }

    /**
     * Method return response code from server.
     *
     * @return connection response code, for example 200 - OK
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public int getResponseCode() throws IOException {
        assert connection != null;
        return connection.getResponseCode();
    }

    /**
     * Method realize sending headers to the server.
     */
    private void sendHeaders() {
        assert setUpHeaders() != null;
        setUpHeaders().forEach(connection::setRequestProperty);
    }

    /**
     * Method send "GET" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendGetRequest() throws IOException {
        connection.setRequestMethod("GET");
        sendHeaders();
    }

    /**
     * Method send "POST" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendPostRequest() throws IOException {
        connection.setRequestMethod("POST");
        sendHeaders();
    }

    /**
     * Method send "PUT" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendPutRequest() throws IOException {
        connection.setRequestMethod("PUT");
        sendHeaders();
    }

    /**
     * Method send "DELETE" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendDeleteRequest() throws IOException {
        connection.setRequestMethod("DELETE");
        sendHeaders();
    }

    /**
     * Method send "CONNECT" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendConnectRequest() throws IOException {
        connection.setRequestMethod("CONNECT");
        sendHeaders();
    }

    /**
     * Method send "OPTIONS" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendOptionsRequest() throws IOException {
        connection.setRequestMethod("OPTIONS");
        sendHeaders();
    }

    /**
     * Method send "TRACE" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendTraceRequest() throws IOException {
        connection.setRequestMethod("TRACE");
        sendHeaders();
    }

    /**
     * Method send "PATCH" request to the server, send headers.
     *
     * @throws IOException connection (HttpURLConnection) methods can throw Exception.
     */
    public void sendPatchRequest() throws IOException {
        connection.setRequestMethod("PATCH");
        sendHeaders();
    }

    /**
     * Method <b>must be</b> implemented in extended classes, set the headers, and it's context.
     */
    protected abstract Map<String, String> setUpHeaders();
}
