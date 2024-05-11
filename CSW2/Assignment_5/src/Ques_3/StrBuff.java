/*
 * Write a Java program that uses StringBuffer to construct a simple text editor which can perform the following operations:
1.  Append a given string to the existing text.
2.  Insert a given string at a specified index within the existing text.
3.  Delete a portion of text between two specified indices.
4.  Reverse the entire text.
5.  Replace a portion of the text between two specified indices with a given string.
 */
package Ques_3;

import java.util.Scanner;

public class StrBuff {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        StringBuffer ob=new StringBuffer();
        while (true) {
            System.out.print("\n****MENU****\n0: Exit\n1: Append a given string to the existing text\n2: Insert a given string at a specified index within the existing text\n3: Delete a portion of text between two specified indices\n4: Reverse the entire text\n5: Replace a portion of the text between two specified indices with a given string\nEnter choice: ");
            int ch=k.nextInt();
            switch (ch) {
                case 0:
                    System.exit(ch);
                case 1:
                    System.out.print("Enter input to append: ");
                    ob.append(k.next());
                    System.out.println("After append: "+ob);
                case 2:
                    System.out.println("");
            
                default:
                    break;
            }
        }
    }
}
/*
 * OUTPUT--------------------------------------------------------------------
 */