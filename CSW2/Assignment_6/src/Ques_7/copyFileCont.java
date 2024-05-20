/*
 * Copy File Content: Write a Java program that copies the content from one file (source) to another (destination). The
program should prompt the user for both source and destination file paths and perform the copy operation, ensuring that it
doesn't overwrite an existing file without user confirmation
 */
package Ques_7;

import java.util.*;
import java.io.*;

public class copyFileCont {
    public static void main(String[] args) throws Exception {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the source file path: ");
        String a = k.next();
        System.out.println("Enter destination file path: ");
        String b = k.next();
        File x = new File(a), y = new File(b);
        copyContent(x, y);
    }

    public static void copyContent(File x, File y) throws Exception {
        FileInputStream in = new FileInputStream(x);
        FileOutputStream out = new FileOutputStream(y);
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
        System.out.println("File copied");
    }
}
/*
 * OUTPUT-----------------------------------------------------------------
 * F:\GITWORK\CSW2\Assignment_6\src\Ques_3\diary.txt
 * Enter destination file path:
 * F:\GITWORK\CSW2\Assignment_6\src\Ques_7\CopiedFile.txt
 * File copied
 */