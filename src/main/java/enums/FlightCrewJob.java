package enums;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT,
    CO_PILOT,
    PILOT;

    public static String getJobDescription(FlightCrewJob crewJob) {
        var matchedJob = "";
        switch (crewJob) {
            case FLIGHT_ATTENDANT -> matchedJob = "FLIGHT_ATTENDANT serves the passengers";
            case CO_PILOT -> matchedJob = "CO_PILOT serves the PILOT";
            case PILOT -> matchedJob = "PILOT drives the plane";
        }
        return matchedJob;
    }

    public static FlightCrewJob whoIsInCharge(FlightCrewJob job1, FlightCrewJob job2) {
        return job1.compareTo(job2) > 0 ? job1 : job2;
    }
}
