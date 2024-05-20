/*
 * List Files and Directories: Write a program in Java that asks the user for a directory path and then lists all files and
subdirectories in that directory. If the directory does not exist, the program should inform the user
 */
package Ques_4;

import java.util.*;
import java.io.*;

public class dirFiles {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        String dirPath = k.nextLine();
        File file = new File(dirPath);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Directory content of " + dirPath + ": ");
        while (!s.empty()) {
            File tmpFile = s.pop();
            if (tmpFile.isFile()) {
                System.out.println(tmpFile.getName());
            } else if (tmpFile.isDirectory()) {
                File[] f = tmpFile.listFiles();
                for (File fl : f) {
                    s.push(fl);
                }
            }
        }
    }
}
/*
 * OUTPUT----------------------------------------------------------------
 * Enter directory path:
 * F:\GITWORK\CSW2\Assignment_6\src
 * Directory content of F:\GITWORK\CSW2\Assignment_6\src:
 * dirFiles.java
 * diary.txt
 * FileAppen.java
 * FileRead.java
 * diary.txt
 * FileWri.java
 * App.java
 */