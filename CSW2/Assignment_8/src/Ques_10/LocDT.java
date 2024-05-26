/*
 * Q10. Write a Java program that takes a LocalDateTime object and formats it to 
a custom string format ("yyyy-MM-dd HH:mm:ss"). Define a LocalDateTime 
object representing a specific date and time. Use DateTimeFormatter to format 
the LocalDateTime object to the desired string format.
 */
package Ques_10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocDT {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 15, 14, 30, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
/*
 * OUTPUT---------------------------------------------------------
 * Formatted Date and Time: 2024-05-15 14:30:00
 */