package com.igorfetov.httpApplication;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;


public class ChromeHttpHeaderSender extends AbstractHttpHSender {

    ChromeHttpHeaderSender(String httpPath) throws IOException {
        super(httpPath);
    }

    @Override
    protected Map<String, String> setUpHeaders() {
        Map<String,String> chromeHeaders = emptyHeaders();
        chromeHeaders.put("user-agent","Chrome/110.0.0.0");
//        chromeHeaders.put("user-agent",substituteChrome(chromeHeaders.get("user-agent")));
        return super.setUpHeaders();
    }

   /* private String substituteChrome(String value) {
        String[] strings = value.split("[\s\b]");
        StringBuilder stringBuilder = new StringBuilder();

//        Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36
        return
    }

    */
}
