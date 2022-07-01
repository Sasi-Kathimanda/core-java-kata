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
              
java.time    ------.format(...) -------->  String

                
java.time    <------.parse(...)----------  String

</blockquote>

| java.time	 | format /parse  	 | String	                                       |
|------------|------------------|-----------------------------------------------|
| LocalDate	 | 	                | 1969-12-31 <br/>Dec31 </br>Wed,31 December  	 |
| LocalTime	 | 	                | 1900</br>7pm</br>19:00:00:000	                |
| ZoneId	    | 	                | America/New_York</br>-05</br>UTC-05:00	       |

<h2> Interoperability with legacy classes(java.util) and sql</h2>
<h4> java.util.classes</h4>
<blockquote> 
Date.from(Instant)
</blockquote>