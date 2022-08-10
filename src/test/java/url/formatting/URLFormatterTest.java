package url.formatting;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLFormatterTest {
    String url;

    @BeforeEach
    void setUp() {
        url = "https://www.google.co.uk/search?q=test";
    }

    @Test
    void urlSchemaDesign() throws MalformedURLException {
        URL urlFormatter = new URL(url);
        assertEquals("www.google.co.uk", urlFormatter.getHost());
        assertEquals("https", urlFormatter.getProtocol());
        assertEquals("q=test", urlFormatter.getQuery());
    }

    @Test
    void givenPlainUrlEncodeIt() throws URISyntaxException {
        //only encode the query part
        var encodedUrl = URLEncoder.encode(new URI(url).getQuery(), StandardCharsets.UTF_8);
        assertEquals("q%3Dtest", encodedUrl);
    }
}