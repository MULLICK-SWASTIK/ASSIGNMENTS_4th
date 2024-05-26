/*
 * Q2.  Write  a  program  that  sorts  a  list  of  strings  based  on  their  lengths  in 
descending order. Define a custom comparator using a lambda expression that 
compares strings based on their lengths. Use the custom comparator to sort the 
list of strings in descending order of length
 */
package Ques_2;

import java.util.*;

public class SortStr {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("apple");
        str.add("banana");
        str.add("kiwi");
        str.add("squash");
        Collections.sort(str, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        System.out.println("Sorted List (Descending Order of length)");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
/*
 * OUTPUT---------------------------------------------
 * Sorted List (Descending Order of length)
 * banana
 * squash
 * apple
 * kiwi
 */