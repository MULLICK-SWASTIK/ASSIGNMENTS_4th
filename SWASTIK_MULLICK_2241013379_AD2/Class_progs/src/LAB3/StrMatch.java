package LAB3;

import java.util.*;

// import java.util.*;
public class StrMatch {
    public static void main(String[] args) {
        ArrayList<Integer> InList = new ArrayList<>();
        StringBuilder s1 = new StringBuilder(), patt = new StringBuilder("abc");
        String text = "abcdhabcbdabc";
        int n = text.length(), m = patt.length();
        for (int i = 0; i < m - 1; i++) {
            s1.append(text.charAt(i));
        }
        for (int i = 0; i < n - m; i++) {
            s1.append(text.charAt(i + m - 1));
            if (s1.compareTo(patt) == 0) {
                InList.add(i);
            }
            s1.delete(0, 1);
        }
        System.out.println(InList);
    }
}

/*
 * package Assignment_3;
 * 
 * import java.util.*;
 * 
 * public class stringMatching {
 * public static void main(String[] args) {
 * ArrayList<Integer> ob = new ArrayList<>();
 * StringBuilder sb1 = new StringBuilder();
 * String text = "abcdhabcbd";
 * StringBuilder pattern = new StringBuilder("abc");
 * int n = text.length(), m = pattern.length();
 * for (int i = 0; i < m - 1; i++) {
 * sb1.append(text.charAt(i));
 * }
 * 
 * for (int i = 0; i < n - m; i++) {
 * sb1.append(text.charAt(i + m - 1));
 * if (sb1.compareTo(pattern) == 0) {
 * ob.add(i);
 * }
 * sb1.delete(0, 1);
 * }
 * System.out.println(ob);
 * 
 * // ArrayList<Integer> ob = new ArrayList<>();
 * // String text = "abcdhabcbd";
 * // String pattern = "abc";
 * // int n = text.length(), m = pattern.length();
 * // for (int i = 0; i < n - m; i++) {
 * // if (pattern.equals(text.substring(i, i + m))) {
 * // ob.add(i);
 * // }
 * // }
 * // System.out.println(ob);
 * }
 * }
 * 
 */
