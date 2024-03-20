package Ques_8;

import java.util.Scanner;
import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "silent", str2 = "listen";
        HashMap<Character, Integer> anag = new HashMap<>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (anag.containsKey(str1.charAt(i)))
                    anag.put(str1.charAt(i), anag.get(str1.charAt(i)) + 1);
                else
                    anag.put(str1.charAt(i), 1);
            }
            // System.out.println(anag);
            for (int i = 0; i < str2.length(); i++) {
                if (anag.containsKey(str2.charAt(i)))
                    anag.put(str2.charAt(i), anag.get(str2.charAt(i)) - 1);
                else
                    anag.put(str2.charAt(i), 1);
            }
            // System.out.println(anag);
            // for (int i = 0; i < str2.length(); i++) {

            // }
        } else {
            System.out.println("Given Strings are not anagrams");
        }
    }
}