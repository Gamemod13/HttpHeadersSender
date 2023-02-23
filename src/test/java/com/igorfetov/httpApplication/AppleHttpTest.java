package com.igorfetov.httpApplication;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleHttpTest {

    @Test
    void AppleGetRequestTest() throws IOException {
        AbstractHttpSender appleHttp = new AppleHttp("https://www.example.com/");
        assertEquals(200, appleHttp.getResponseCode());
//        assertEquals("AppleWebKit/537.36 (KHTML, like Gecko)", appleHttp.getRequestProperty("user-agent"));
    }

    @Test
    void AppleSetUpHeadersTest() throws IOException {
        AbstractHttpSender appleHttp = new AppleHttp("https://www.example.com/");
        Map<String,String> test = new LinkedHashMap<>(){{
            put("user-agent","AppleWebKit/537.36 (KHTML, like Gecko)");}};
        assertEquals(test,appleHttp.setUpHeaders());
    }
}