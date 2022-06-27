package time;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaInstantTest {
    private JavaInstant sut;

    @BeforeEach
    void setUp() {
        sut = new JavaInstant();
    }

    @Test
    void instanceOf() {
        Assertions.assertEquals("1970-01-01T00:00:00Z", sut.Of().toString());
    }

}