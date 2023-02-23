package com.igorfetov.httpApplication;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MozillaHttpTest {

    @Test
    void AppleGetRequestTest() throws IOException {
        AbstractHttpSender appleHttp = new MozillaHttp("https://www.example.com/");
        assertEquals(200, appleHttp.getResponseCode());
    }

    @Test
    void AppleSetUpHeadersTest() throws IOException {
        AbstractHttpSender appleHttp = new MozillaHttp("https://www.example.com/");
        Map<String,String> test = new LinkedHashMap<>(){{
            put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");}};
        assertEquals(test,appleHttp.setUpHeaders());
    }
}
