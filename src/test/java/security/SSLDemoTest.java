package security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLSocketFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class SSLDemoTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreationOfSSLHandshakeSuccessfully() throws IOException {
        SSLDemo sut = new SSLDemo();
        sut.createSSLHandshake("localhost",8080);
    }
}