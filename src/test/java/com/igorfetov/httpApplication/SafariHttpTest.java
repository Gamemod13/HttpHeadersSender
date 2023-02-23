package com.igorfetov.httpApplication;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SafariHttpTest {

    @Test
    void AppleGetRequestTest() throws IOException {
        AbstractHttpSender appleHttp = new SafariHttp("https://www.example.com/");
        assertEquals(200, appleHttp.getResponseCode());
    }

    @Test
    void AppleSetUpHeadersTest() throws IOException {
        AbstractHttpSender appleHttp = new SafariHttp("https://www.example.com/");
        Map<String,String> test = new LinkedHashMap<>(){{
            put("user-agent","Safari/537.36");}};
        assertEquals(test,appleHttp.setUpHeaders());
    }
}