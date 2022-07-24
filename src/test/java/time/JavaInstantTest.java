package time;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInstantTest {
    public static final String INSTANCE_EPOCH = "1970-01-01T00:00:00Z";
    public static final int BIRTH_DAY_IN_EPOCH_SECOND = 470811618;
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
    void instantToLocalDateTime() {
        //given
        var instant = Instant.parse("2022-07-21T20:06:00.999999999Z");
        //when
        var ldt_utc = sut.instantToLocalDateTime(instant, ZoneId.of("UTC"));
        var ldt_gmt = sut.instantToLocalDateTime(instant, ZoneId.of("GMT"));
        var ldt_London = sut.instantToLocalDateTime(instant, ZoneId.of("Europe/London"));
        var ldt_ist = sut.instantToLocalDateTime(instant, ZoneId.of("Asia/Kolkata"));
        //then
        assertEquals("2022-07-21T20:06:00.999999999Z", instant.toString());
        assertEquals("2022-07-21T20:06:00.999999999", ldt_utc.toString());
        assertEquals("2022-07-21T20:06:00.999999999", ldt_gmt.toString());
        assertEquals("2022-07-21T21:06:00.999999999", ldt_London.toString());
        assertEquals("2022-07-22T01:36:00.999999999", ldt_ist.toString());
    }

    @Test
    void parsingInstantAtDifferentInputStyle() {
        var instantWithZeroMillis = Instant.ofEpochMilli(1658700000000L).toString();
        assertEquals("2022-07-24T22:00:00Z", instantWithZeroMillis);
        assertEquals("2022-07-24T22:00:00Z", Instant.parse(instantWithZeroMillis).toString());
    }

    @Test
    void getBirthdayInDifferentZones() {
        assertEquals("1984-12-02T05:00:18Z", Instant.ofEpochSecond(BIRTH_DAY_IN_EPOCH_SECOND).toString());

        //First Home
        var zonedDateTime = Instant.ofEpochSecond(BIRTH_DAY_IN_EPOCH_SECOND).atZone(ZoneId.of("Asia/Kolkata"));
        assertEquals("1984-12-02T10:30:18+05:30[Asia/Kolkata]", zonedDateTime.toString());
        assertEquals(BIRTH_DAY_IN_EPOCH_SECOND, zonedDateTime.toInstant().getEpochSecond());

        //Second Home
        zonedDateTime = Instant.ofEpochSecond(BIRTH_DAY_IN_EPOCH_SECOND).atZone(ZoneId.of("Europe/London"));
        assertEquals("1984-12-02T05:00:18Z[Europe/London]", zonedDateTime.toString());
        assertEquals(BIRTH_DAY_IN_EPOCH_SECOND, zonedDateTime.toInstant().getEpochSecond());

        //Akka Home
        zonedDateTime = Instant.ofEpochSecond(BIRTH_DAY_IN_EPOCH_SECOND).atZone(ZoneId.of("America/Chicago"));
        assertEquals("1984-12-01T23:00:18-06:00[America/Chicago]", zonedDateTime.toString());
        assertEquals("1984-12-02T05:00:18Z", zonedDateTime.toInstant().toString());
    }
}