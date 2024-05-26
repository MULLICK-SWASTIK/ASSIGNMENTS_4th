/*
 * Q11. Write a Java program that converts a given date and time in UTC to the 
local date and time of a specific time zone (e.g., "America/New_York"). Parse a 
string representing a date and time in UTC format. Convert the parsed Instant to 
a ZonedDateTime using a specific ZoneId.
 */
package Ques_11;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DTformatter {
    public static void main(String[] args) {
        String utcDateTimeString = "2024-05-16T10:15:30Z";
        Instant instant = Instant.parse(utcDateTimeString);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = formatter.format(zonedDateTime);
        System.out.println("Local date and time in " + zoneId + ": " + formattedDateTime);
    }
}
/*
 * OUTPUT------------------------------------------------------
 * Local date and time in America/New_York: 2024-05-16 06:15:30 GMT-04:00
 */