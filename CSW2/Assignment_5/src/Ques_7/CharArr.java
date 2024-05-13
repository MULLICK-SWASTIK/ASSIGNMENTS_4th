/*
 * Character Array and Search: Ask for a string from the user. Convert the string to a character array. Prompt the user to
enter a character to search in the string. Find the first and last occurrences of the character. Display the character array and
the positions found (if any).
 */
package Ques_7;

import java.util.Arrays;
import java.util.Scanner;

public class CharArr {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = k.nextLine();
        System.out.print("Enter a character to search: ");
        char c = k.next().charAt(0);
        char ca[] = s.toCharArray();
        System.out.println(String.format("First occurence of %1$s is at index %2$s.", c, s.indexOf(c)));
        System.out.println(String.format("Last occurence of %1$s is at index %2$s.", c, s.lastIndexOf(c)));
        System.out.println(Arrays.toString(ca));
    }
}
/*
 * OUTPUT-----------------------------------------------
 * Enter a string: hello
 * Enter a character to search: l
 * First occurence of l is at index 2.
 * Last occurence of l is at index 3.
 * [h, e, l, l, o]
 */