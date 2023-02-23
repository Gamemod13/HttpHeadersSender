/**
 * The class of library with Chrome user-agent simulation.
 * Set the HTTP behaviour of the library.
 *
 * @author Gamemod13
 * @version 1.0
 */

package com.igorfetov.httpApplication;

import java.io.IOException;
import java.util.Map;

/**
 * Realization of abstract class {@link AbstractHttpSender} with reset headers for
 * Chrome.
 */
public class ChromeHttp extends AbstractHttpSender {

    /**
     * Default unique constructor of Sender class.
     * Create a connection used URL path.
     *
     * @param httpPath address URL server.
     * @throws IOException Opening the url connection can throw the Exception.
     */
    ChromeHttp(String httpPath) throws IOException {
        super(httpPath);
    }

    /**
     * Method set up the Chrome user-agent to headers Map.
     *
     * @return Map with Key-Header, Value-Context for apple browser.
     */
    @Override
    protected Map<String, String> setUpHeaders() {
        Map<String,String> chromeHeaders = standardHeaders();
        chromeHeaders.put("user-agent","Chrome/110.0.0.0");
//        chromeHeaders.put("user-agent",substituteChrome(chromeHeaders.get("user-agent")));
        return chromeHeaders;
    }

   /* private String substituteChrome(String value) {
        String[] strings = value.split("[\s\b]");
        StringBuilder stringBuilder = new StringBuilder();

//        Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36
        return
    }

    */
}
