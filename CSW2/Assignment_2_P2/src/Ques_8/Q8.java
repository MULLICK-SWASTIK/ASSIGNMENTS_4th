package Ques_8;

// import java.util.Scanner;
import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "silent", str2 = "listen";
        System.out.println("Word 1: "+str1+"\nWord 2: "+str2);
        HashMap<Character, Integer> anag = new HashMap<>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (anag.containsKey(str1.charAt(i)))
                    anag.put(str1.charAt(i), anag.get(str1.charAt(i)) + 1);
                else
                    anag.put(str1.charAt(i), 1);
            }
            System.out.println("\nHash map of first string: \n"+anag);
            for (int i = 0; i < str2.length(); i++) {
                if (anag.containsKey(str2.charAt(i)))
                    anag.put(str2.charAt(i), anag.get(str2.charAt(i)) - 1);
                else
                    anag.put(str2.charAt(i), 1);
            }
            System.out.println("\nHash map of second string: \n"+anag);
            int count=0;
            for (int i = 0; i < str2.length(); i++) {
                if (anag.get(str2.charAt(i))==0)
                    count++;
            }
            boolean isAnagram=((count==str1.length())?true:false);
            System.out.println("\nAre given string anagrams: "+isAnagram);
        } else {
            System.out.println("Given Strings are not anagrams.");
        }
    }
}
//OUTPUT
//Word 1: silent
//Word 2: listen

// Hash map of first string: 
// {s=1, t=1, e=1, i=1, l=1, n=1}

// Hash map of second string:
// {s=0, t=0, e=0, i=0, l=0, n=0}

// Are given string anagrams: true
