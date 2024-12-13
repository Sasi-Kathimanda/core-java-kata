package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlightCrewJobTest {

    @Test
    void givenTwoEnumsCanPerformTheEquality() {
        FlightCrewJob job1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob job2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob job3 = FlightCrewJob.FLIGHT_ATTENDANT;

        assertNotSame(job1, job2);
        assertSame(job1, job3);

        assertTrue(job1.name().equalsIgnoreCase("FLIGHT_ATTENDANT"));
        assertTrue(job1 == job3);
    }

    @Test
    void givenEnumShouldValidateAndGiveExpectedOutput() {
        //given
        FlightCrewJob job1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob job2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob job3 = FlightCrewJob.PILOT;
        //when
        assertAll(
                () -> assertEquals("FLIGHT_ATTENDANT serves the passengers", FlightCrewJob.getJobDescription(job1)),
                () -> assertEquals("CO_PILOT serves the PILOT", FlightCrewJob.getJobDescription(job2)),
                () -> assertEquals("PILOT drives the plane", FlightCrewJob.getJobDescription(job3))
        );
    }
}