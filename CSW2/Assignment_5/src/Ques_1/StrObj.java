/*
 * Write a Java program that illustrates the difference between using string literals and the new keyword for creating String
objects. Your program should demonstrate the memory usage implications and how string comparison behaves differently
in each case.
 */
package Ques_1;

public class StrObj {
    public static void main(String[] args) {
        System.gc();
        String s = new String("Hello");
        System.out.println("Memory available with using new keyword: " + Runtime.getRuntime().freeMemory());
        System.gc();
        String q = new String("Hello");
        System.gc();
        String s1 = "Hello";
        System.out.println("Memory available without using new keyword: " + Runtime.getRuntime().freeMemory());
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s == s1);
        System.out.println(s == q);
    }
}
/*
 * OUTPUT------------------------------------------------------------
 * Memory available with using new keyword: 7605648
 * Memory available without using new keyword: 7767992
 * true
 * false
 * false
 */