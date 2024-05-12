/*
 * Create a Java program that uses StringBuilder to perform a series of text manipulations on a user-provided string. The
program should allow users to:
1.  Add a substring at a specified position.
2.  Remove a range of characters from the string.
3.  Modify a character at a specified index.
4.  Concatenate another string at the end.
5.  Display the current string after each operation.
The program should repeatedly prompt the user to choose an operation until they decide to exit. After each operation, it should
display the modified string, demonstrating the mutable nature of StringBuilder.
 */

package Ques_4;

import java.util.*;

public class StrBuild {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        StringBuilder obj = new StringBuilder();
        while (true) {
            System.out.print(
                    "\n****MENU****\n0: Exit\n1: Concatenate another string at the end\n2: Remove a range of characters from the string\n3: Modify a character at a specified index\n4: Add a substring at a specified position\nEnter choice: ");
            int ch = k.nextInt();
            switch (ch) {
                case 0:
                    System.exit(ch);
                case 1:
                    System.out.print("Add string: ");
                    obj.append(k.next());
                    System.out.println("After append: " + obj);
                    break;
                case 2:
                    System.out.print("Delete from index1 to index2: ");
                    obj.delete(k.nextInt(), k.nextInt());
                    System.out.println("After delete: " + obj);
                    break;
                case 3:
                    System.out.print("Enter index and character: ");
                    obj.setCharAt(k.nextInt(), k.next().charAt(0));
                    System.out.println("After modify: " + obj);
                    break;
                case 4:
                    System.out.print("Insert index and string: ");
                    obj.insert(k.nextInt(), k.next());
                    System.out.println("After insert: " + obj);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
/*
 * OUTPUT-------------------------------------------
 * ****MENU****
0: Exit
1: Concatenate another string at the end       
2: Remove a range of characters from the string
3: Modify a character at a specified index     
4: Add a substring at a specified position     
Enter choice: 1
Add string: rt63v  
After append: rt63v

****MENU****
0: Exit
1: Concatenate another string at the end       
2: Remove a range of characters from the string
3: Modify a character at a specified index     
4: Add a substring at a specified position     
Enter choice: 2
Delete from index1 to index2: 0 3
After delete: 3v

****MENU****
0: Exit
1: Concatenate another string at the end       
2: Remove a range of characters from the string
3: Modify a character at a specified index     
4: Add a substring at a specified position     
Enter choice: 3
Enter index and character: 0 o
After modify: ov

****MENU****
0: Exit
1: Concatenate another string at the end
2: Remove a range of characters from the string
3: Modify a character at a specified index
4: Add a substring at a specified position
Enter choice: 4
Insert index and string: 0 bsdk
After insert: bsdkov

****MENU****
0: Exit
1: Concatenate another string at the end
2: Remove a range of characters from the string
3: Modify a character at a specified index
4: Add a substring at a specified position
Enter choice: 0
 */