/*
 * Create a Java program that compares the performance of StringBuilder and StringBuffer when performing repeated string
concatenations. The program should:
1.  Prompt the user to enter a base string and the number of times it should be concatenated to itself.
2.  Use StringBuilder to concatenate the string the specified number of times, tracking the time taken to complete the
operation.
3.  Repeat the process using StringBuffer, again tracking the time taken.
4.  Output the time taken for each operation and the final length of the resulting strings to demonstrate both the time
efficiency and the result of using StringBuilder and StringBuffer.
 */

package Ques_5;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class BuffBuildDiff {
    public static void main(String[] rags) {
        Scanner k = new Scanner(System.in);
        StringBuffer buff = new StringBuffer();
        StringBuilder buil = new StringBuilder();
        System.out.print("Enter base string: ");
        String s = k.next();
        System.out.print("Enter number of concatenations: ");
        int n = k.nextInt();
        runStringBuffer(buff, s, n);
        runStringBuilder(buil, s, n);
    }

    public static void runStringBuffer(StringBuffer buff, String s, int n) {
        long beg = new GregorianCalendar().getTimeInMillis();
        for (int i = 0; i < n; i++)
            buff.append(s);
        System.out.println(String.format("\nString Buffer....\nTime: %1$sms\nFinal String length: %2$s",
                (new GregorianCalendar().getTimeInMillis() - beg), buff.length()));
    }

    public static void runStringBuilder(StringBuilder buil, String s, int n) {
        long beg = new GregorianCalendar().getTimeInMillis();
        for (int i = 0; i < n; i++)
            buil.append(s);
        System.out.println(String.format("\nString Builder....\nTime: %1$sms\nFinal String length: %2$s",
                (new GregorianCalendar().getTimeInMillis() - beg), buil.length()));
    }
}
/*
 * OUTPUT---------------------------------------
 * Enter base string: Hello 
Enter number of concatenations: 10000

String Buffer....
Time: 1ms
Final String length: 50000

String Builder....
Time: 4ms
Final String length: 50000
 */