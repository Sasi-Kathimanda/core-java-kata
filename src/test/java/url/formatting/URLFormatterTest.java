package url.formatting;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
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
    void givenPlainUrlEncodeIt() throws MalformedURLException {
        URL urlObj = new URL(url);
        //only encode the query part
        var encodedUrl = URLEncoder.encode(urlObj.getQuery(), StandardCharsets.UTF_8);
        assertEquals("q%3Dtest", encodedUrl);
        var expectedURL = "https://www.google.co.uk/search?q%3Dtest";
        assertEquals(expectedURL, String.format("%s://%s/search?%s", urlObj.getProtocol(), urlObj.getHost(), encodedUrl));
    }

    @Test
    void givenEncodedURLThenDecodeIt() throws MalformedURLException {
        // given
        URL urlObj = new URL(url);
        var decodedUrl = URLEncoder.encode(urlObj.getQuery(), StandardCharsets.UTF_8);
        assertEquals("q=test", decodedUrl);
    }
}