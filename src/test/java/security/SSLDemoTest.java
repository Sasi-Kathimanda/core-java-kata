package security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLException;
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
    void testCreationOfSSLHandshakeSuccessfully()  {
        SSLDemo sut = new SSLDemo();
        SSLException thrown = assertThrows(SSLException.class, () -> sut.createSSLHandshake("localhost", 8080));
        assertEquals("Unsupported or unrecognized SSL message",thrown.getMessage());
    }
}