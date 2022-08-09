package url.formatting;


import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLFormatterTest {
    @Test
    void urlSchemaDesign() throws MalformedURLException {
        String url = "https://www.google.co.uk/search?q=test";

        URL urlFormatter = new URL(url);
        assertEquals("www.google.co.uk", urlFormatter.getHost());
        assertEquals("https", urlFormatter.getProtocol());
    }

}