/*
 * Case Conversion and Comparison: Prompt the user to input two strings. Convert both strings to lowercase and uppercase.
Compare the converted strings to check case-insensitive equality. Display the converted strings and the result of the
comparison.
 */
package Ques_6;

import java.util.Scanner;

public class CaseConv {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String s1 = k.next().toLowerCase(), s2 = k.next().toLowerCase();
        String s1Upper = s1.toUpperCase(), s2Upper = s2.toUpperCase();
        System.out.println(String.format("s1: %1$s \t s2: %2$s", s1, s2));
        System.out.println(String.format("s1Upper: %1$s \t s2Upper: %2$s", s1Upper, s2Upper));
        System.out.println(s1.compareToIgnoreCase(s1Upper));
        System.out.println(s2.compareToIgnoreCase(s2Upper));
    }
}
/*
 * OUTPUT-------------------------------------------------------
 * Enter two words:
 * Billy
 * cHEf
 * s1: billy s2: chef
 * s1Upper: BILLY s2Upper: CHEF
 * 0
 * 0
 */