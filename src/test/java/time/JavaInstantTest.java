package time;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInstantTest {
    public static final String INSTANCE_EPOCH = "1970-01-01T00:00:00Z";
    private JavaInstant sut;

    @BeforeEach
    void setUp() {
        sut = new JavaInstant();
    }

    @Test
    void instanceOf() {
        assertEquals(INSTANCE_EPOCH, sut.Of().toString());
    }

    @Test
    void instantToZonedDuration() {
        var time = Instant.ofEpochSecond(Duration.ofDays(115).plusHours(6).plusMinutes(59).plusSeconds(59).toSeconds());
        assertEquals("1970-04-26T06:59:59Z", time.toString());

        var zonedTime = time.atZone(ZoneId.of("America/New_York"));
        assertEquals("1970-04-26T01:59:59-05:00[America/New_York]", zonedTime.toString());

        //add ONE second
        time = time.plusSeconds(1);
        zonedTime = time.atZone(ZoneId.of("America/New_York"));
        assertEquals("1970-04-26T03:00-04:00[America/New_York]", zonedTime.toString());
    }

    @Test
    void testBirthdayInDifferentZones() {
        assertEquals("1984-12-02T05:00:18Z", Instant.ofEpochSecond(470811618).toString());

        //First Home
        var utc = Instant.ofEpochSecond(470811618).atZone(ZoneId.of("Asia/Kolkata"));
        assertEquals("1984-12-02T10:30:18+05:30[Asia/Kolkata]", utc.toString());
        assertEquals(470811618, utc.toInstant().getEpochSecond());

        //Second Home
        utc = Instant.ofEpochSecond(470811618).atZone(ZoneId.of("Europe/London"));
        assertEquals("1984-12-02T05:00:18Z[Europe/London]", utc.toString());
        assertEquals(470811618, utc.toInstant().getEpochSecond());

        //Akka Home
        utc = Instant.ofEpochSecond(470811618).atZone(ZoneId.of("America/Chicago"));
        assertEquals("1984-12-01T23:00:18-06:00[America/Chicago]", utc.toString());

        assertEquals("1984-12-02T05:00:18Z",utc.toInstant().toString());
    }
}