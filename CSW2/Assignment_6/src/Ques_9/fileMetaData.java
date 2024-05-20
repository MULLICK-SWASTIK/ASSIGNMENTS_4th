/*
 * Display File Metadata: Create a Java program that displays metadata of a specified file. The user should be able to input
the file name, and the program should output the file size, last modified date, and other available attributes.
 */
package Ques_9;

import java.util.*;
import java.io.*;

public class fileMetaData {
    public static void main(String[] rgsa) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fname = k.nextLine();
        File file = new File(fname);
        if (file.exists()) {
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
/*
 * OUTPUT---------------------------------------------------------------
 * F:\GitWork\CSW2\Assignment_1\src\Ques_3\Point.java
 * File size: 331 bytes
 * Last modified: Sun Mar 24 21:53:08 IST 2024
 * Readable: true
 * Writable: true
 */