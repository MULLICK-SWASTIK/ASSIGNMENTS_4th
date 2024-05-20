/*
 * Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given directory. The program
should prompt the user for the directory path and then display a list of all text files found in that directory
 */
package Ques_5;

import java.util.*;
import java.io.*;

public class dirFilesFilter {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        String dirPath = k.nextLine();
        File file = new File(dirPath);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Directory content of " + dirPath + ": ");
        while (!s.isEmpty()) {
            File tf = s.pop();
            if (tf.isFile() && tf.getName().endsWith(".txt")) {
                System.out.println(tf.getName());
            } else if (tf.isDirectory()) {
                File[] f = tf.listFiles();
                for (File ff : f) {
                    s.push(ff);
                }
            }
        }
    }
}
/*
 * OUTPUT--------------------------------------------------------
 * Enter directory path:
 * F:\GITWORK\CSW2\Assignment_6\src
 * Directory content of F:\GITWORK\CSW2\Assignment_6\src:
 * diary.txt
 * diary.txt
 */