package com.igorfetov.httpApplication;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChromeHttpTest {

    @Test
    void AppleGetRequestTest() throws IOException {
        AbstractHttpSender appleHttp = new ChromeHttp("https://www.example.com/");
        assertEquals(200, appleHttp.getResponseCode());
    }

    @Test
    void AppleSetUpHeadersTest() throws IOException {
        AbstractHttpSender appleHttp = new ChromeHttp("https://www.example.com/");
        Map<String,String> test = new LinkedHashMap<>(){{
            put("user-agent","Chrome/110.0.0.0");}};
        assertEquals(test,appleHttp.setUpHeaders());
    }
}
