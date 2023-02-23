/**
 * The class of library with Safari user-agent simulation.
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
 * Safari.
 */
public class SafariHttp extends AbstractHttpSender{

    /**
     * Default unique constructor of Sender class.
     * Create a connection used URL path.
     *
     * @param httpPath address URL server.
     * @throws IOException Opening the url connection can throw the Exception.
     */
    SafariHttp(String httpPath) throws IOException {
        super(httpPath);
    }

    /**
     * Method set up the Safari user-agent to headers Map.
     *
     * @return Map with Key-Header, Value-Context for apple browser.
     */
    @Override
    protected Map<String, String> setUpHeaders() {
        Map<String,String> chromeHeaders = standardHeaders();
        chromeHeaders.put("user-agent","Safari/537.36");
        return chromeHeaders;
    }
}
