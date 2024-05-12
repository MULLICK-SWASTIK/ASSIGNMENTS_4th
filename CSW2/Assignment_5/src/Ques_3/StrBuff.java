/*
 * Write a Java program that uses StringBuffer to construct a simple text editor which can perform the following operations:
1.  Append a given string to the existing text.
2.  Insert a given string at a specified index within the existing text.
3.  Delete a portion of text between two specified indices.
4.  Reverse the entire text.
5.  Replace a portion of the text between two specified indices with a given string.
Your program should display a menu with options to perform each of the above operations. After each operation, print the
current state of the text. Also, display the current capacity and length of the StringBuffer after each operation to showcase its
dynamic nature.
 */
package Ques_3;

import java.util.Scanner;

public class StrBuff {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        StringBuffer ob = new StringBuffer();
        while (true) {
            System.out.print(
                    "\n****MENU****\n0: Exit\n1: Append a given string to the existing text\n2: Insert a given string at a specified index within the existing text\n3: Delete a portion of text between two specified indices\n4: Reverse the entire text\n5: Replace a portion of the text between two specified indices with a given string\nEnter choice: ");
            int ch = k.nextInt();
            switch (ch) {
                case 0:
                    System.exit(ch);
                case 1:
                    System.out.print("Enter input to append: ");
                    ob.append(k.next());
                    System.out.println("After append: " + ob);
                    break;
                case 2:
                    System.out.println("Insert Index and string: ");
                    ob.insert(k.nextInt(), k.next());
                    System.out.println("After insert: " + ob);
                    break;
                case 3:
                    System.out.println("Delete from index1 to index2: ");
                    ob.delete(k.nextInt(), k.nextInt());
                    System.out.println("After delete: " + ob);
                    break;
                case 4:
                    System.out.println("After reverse: " + ob.reverse());
                    break;
                case 5:
                    System.out.print("Enter string: ");
                    String s = k.next();
                    System.out.print("Enter range: ");
                    ob.replace(k.nextInt(), k.nextInt(), s);
                    System.out.println("After replace: " + ob);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
/*
 * OUTPUT--------------------------------------------------------------------
 * ****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 1
Enter input to append: 7e;'/
After append: 7e;'/

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 2
Insert Index and string:
3 cd
After insert: 7e;cd'/

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 3
Delete from index1 to index2:
2 4
After delete: 7ed'/

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 4
After reverse: /'de7

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 4
After reverse: 7ed'/

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 5
Enter string: qwerty
Enter range: 1 3
After replace: 7qwerty'/

****MENU****
0: Exit
1: Append a given string to the existing text
2: Insert a given string at a specified index within the existing text
3: Delete a portion of text between two specified indices
4: Reverse the entire text
5: Replace a portion of the text between two specified indices with a given string
Enter choice: 0
 */