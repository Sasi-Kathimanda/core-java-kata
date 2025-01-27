package security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import javax.net.ssl.SSLException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SSLDemoTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @Disabled
    void testCreationOfSSLHandshakeSuccessfully() {
        SSLDemo sut = new SSLDemo();
        SSLException thrown = assertThrows(SSLException.class, () -> sut.createSSLHandshake("localhost", 8080));
        assertEquals("Unsupported or unrecognized SSL message", thrown.getMessage());
    }
}