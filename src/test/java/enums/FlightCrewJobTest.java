package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class FlightCrewJobTest {

    @Test
    void givenTwoEnumsCanPerformTheEquality() {
        FlightCrewJob job1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob job2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob job3 = FlightCrewJob.FLIGHT_ATTENDANT;

        assertNotSame(job1, job2);
        assertSame(job1, job3);
    }
}