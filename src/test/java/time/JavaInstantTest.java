package time;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

class JavaInstantTest {
    public static final String INSTANCE_EPOCH = "1970-01-01T00:00:00Z";
    private JavaInstant sut;

    @BeforeEach
    void setUp() {
        sut = new JavaInstant();
    }

    @Test
    void instanceOf() {
        Assertions.assertEquals(INSTANCE_EPOCH, sut.Of().toString());
    }

    @Test
    void instantToZonedDuration() {
        var time = Instant.ofEpochSecond(Duration.ofDays(115).plusHours(6).plusMinutes(59).plusSeconds(59).toSeconds());
        Assertions.assertEquals("1970-04-26T06:59:59Z", time.toString());

        var zonedTime = time.atZone(ZoneId.of("America/New_York"));
        Assertions.assertEquals("1970-04-26T01:59:59-05:00[America/New_York]", zonedTime.toString());

        //add ONE second
        time = time.plusSeconds(1);
        zonedTime = time.atZone(ZoneId.of("America/New_York"));
        Assertions.assertEquals("1970-04-26T03:00-04:00[America/New_York]", zonedTime.toString());
    }
}