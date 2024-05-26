/*
 * Q5. Write a program that reads a list of strings, converts them to uppercase, 
filters  out  the  strings  starting  with  a  vowel,  and  then  prints  the  remaining 
strings
 */
package Ques_5;

import java.util.*;
import java.util.stream.Collectors;

public class StrManip {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "Banana", "Orange", "kiwi", "strawberry");
        List<String> filteredStrings = strings.stream().map(String::toUpperCase).filter(str -> !startsWithVowel(str))
                .collect(Collectors.toList());
        System.out.println("Filtered Strings:");
        filteredStrings.forEach(System.out::println);
    }

    private static boolean startsWithVowel(String str) {
        char firstChar = str.charAt(0);
        return "AEIOU".indexOf(Character.toUpperCase(firstChar)) != -1;
    }
}

/*
 * OUTPUT--------------------------------------------------
 * Filtered Strings:
 * BANANA
 * KIWI
 * STRAWBERRY
 */