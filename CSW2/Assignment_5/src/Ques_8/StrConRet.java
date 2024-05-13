/*
 * String Concatenation and Character Retrieval: Take two strings from the user. Concatenate them using the string method
and the + operator, then display both results. Ask the user for an index number, then display the character at that index.
 */
package Ques_8;

import java.util.Scanner;

public class StrConRet {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1 = k.nextLine(), s2 = k.nextLine();
        System.out.println("Using '+': " + (s1 + s2));
        s1 = s1.concat(s2);
        System.out.println("Using concatenation: " + s1);
        System.out.print("Enter index number: ");
        int index = k.nextInt();
        System.out.println("Character at index " + index + " is " + s1.charAt(index));
    }
}
/*
 * OUTPUT----------------------------------------------
 * Enter two strings:
 * hello
 * kempt
 * Using '+': hellokempt
 * Using concatenation: hellokempt
 * Enter index number: 6
 * Character at index 6 is e
 */