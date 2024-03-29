<h1>java.time Core classes</h1>

| java.time     | Meaning                                            | Example                  |
|---------------|----------------------------------------------------|--------------------------|
| Instant       | instant of time(nanosecond precise moment in time) | timestamp                |
| ZonedDateTime | date-time with time zone information               | start of a meeting call  |
| LocalDate     | date without time zone information                 | birthday                 |
| Duration      | nanosecond precise interval between two instants   | length of a meeting call | 
| Period        | amount of time in years,months and days            | length of work service   |

<h2> Formatting and Parsing</h2>

<blockquote>

java.time ------.format(...) -------->  String

java.time    <------.parse(...)---------- String

</blockquote>

| java.time     | format /parse     | String                                           |
|------------|------------------|-----------------------------------------------|
| LocalDate     | 	                | 1969-12-31 <br/>Dec31 </br>Wed,31 December     |
| LocalTime     | 	                | 1900</br>7pm</br>19:00:00:000                    |
| ZoneId        | 	                | America/New_York</br>-05</br>UTC-05:00           |

<h2> Interoperability with legacy classes(java.util) and sql</h2>
<h4> java.util.classes</h4>
<blockquote> 

    Date.from(Instant)
    Date.to(Instant)
    Calendar.to(Instant)
    TimeZone.toZoneId()
    TimeZone.getTimeZone(ZoneId)

</blockquote>

| Legacy Type (java.util) | Java Time equivalent |            Conversion Methods            |
|-------------------------|----------------------|:----------------------------------------:|
| Date                    | Instant              |       toInstant() / from(Instant)        |
| GregorianCalendar       | ZonedDateTime        |  toZonedDateTime()/from(ZonedDateTime)   |
| SimpleTimeZone          | ZoneId               |       toZoneId/getTimeZone(ZoneId)       |
| Date(java.sql)          | LocalDate            |     toLocalDate()/valueOf(LocalDate)     | 
| Time (java.sql)         | LocalTime            |     toLocalTime()/valueOf(LocalTime)     |
| TimeStamp (java.sql)    | Instant              | toLocalDateTime()/valueOf(LocalDateTime) |
| FileTime (java.nio)     | Instant              |        toInstant() / from(Instant        |

<h2>TimeZones</h2>
<p>
    The TimeZone classes:

        - Fixed TimeZones
            - ZoneOffset And OffsetDateTime            
        - Geographic Timezones
            - ZoneId and ZonedDateTime

</p>
<blockquote>

    ZoneOffset + LocalDateTime = OffsetDateTime
    ZoneRegion + LocalDateTime = ZonedDateTime

</blockquote>