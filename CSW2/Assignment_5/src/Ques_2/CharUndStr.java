/*
 * Write a Java program that demonstrates the immutability of the String class and how it implements the CharSequence
interface. Your program should illustrate the behaviours that highlight String immutability and its usage as a CharSequence.
 */
package Ques_2;

public class CharUndStr {
    public static void main(String[] args) {
        String s = "abcd";
        s = s.replace("a", "s");
        System.out.println(s);
        CharSequence cs = s;
        System.out.println(cs.subSequence(0, 3));
        System.out.println(cs.length());
    }
}
/*
 * OUTPUT------------------------------------
 * sbcd
 * sbc
 * 4
 */