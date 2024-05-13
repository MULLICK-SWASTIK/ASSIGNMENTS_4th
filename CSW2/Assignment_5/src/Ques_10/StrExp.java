/*
 * Interactive String Explorer: Prompt the user for a string. Display a menu with options to perform various operations:
convert to lowercase/uppercase, search for a character/index, or concatenate with another string. Based on user selection,
perform the appropriate string operation and show the result.
 */
package Ques_10;

import java.util.Scanner;

public class StrExp {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = k.next();
        while (true) {
            System.out.print("\n0: Exit\n1: Convert to Lowercase\n2: Convert to Uppercase\n3: Search for a character\n4: Concatenate with another string\nEnter choice: ");
            int ch = k.nextInt();
            switch (ch) {
                case 0:
                    System.exit(ch);
                case 1:
                    System.out.println("Lowercase: " + s.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + s.toUpperCase());
                    break;
                case 3:
                    System.out.println("Enter the character to search:");
                    char c = k.next().charAt(0);
                    System.out.println("First occurrence of " + c + " is at index " + s.indexOf(c));
                    break;
                case 4:
                    System.out.println("Enter the string to concatenate:");
                    String s2 = k.next();
                    System.out.println("Concatenated String: " + s.concat(s2));
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
/*
 * OUTPUT---------------------------------------------------------------
 * Enter the string:
fsldkfji

0: Exit
1: Convert to Lowercase
2: Convert to Uppercase
3: Search for a character
4: Concatenate with another string
Enter choice: 2
Uppercase: FSLDKFJI

0: Exit
1: Convert to Lowercase
2: Convert to Uppercase
3: Search for a character
4: Concatenate with another string
Enter choice: 1
Lowercase: fsldkfji

0: Exit
1: Convert to Lowercase
2: Convert to Uppercase
3: Search for a character
4: Concatenate with another string
Enter choice: 3
Enter the character to search:
l
First occurrence of l is at index 2

0: Exit
1: Convert to Lowercase
2: Convert to Uppercase
3: Search for a character
4: Concatenate with another string
Enter choice: 4
Enter the string to concatenate:
29348o
Concatenated String: fsldkfji29348o

0: Exit
1: Convert to Lowercase
2: Convert to Uppercase
3: Search for a character
4: Concatenate with another string
Enter choice: 0
 */