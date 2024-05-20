/*
 * Rename a File: Develop a Java application that renames a specified file. The program should request the current file name
and the new file name from the user, renaming the file accordingly and confirming the action upon completion.
 */
package Ques_8;

import java.io.File;

public class fileRename {
    public static void main(String[] args) {
        File file = new File("F:\\GitWork\\CSW2\\Assignment_6\\src\\Ques_8\\abc.txt");
        File renamefile = new File("F:\\GitWork\\CSW2\\Assignment_6\\src\\Ques_8\\xyz.txt");
        boolean flag = file.renameTo(renamefile);
        if (flag)
            System.out.println("File renamed successfully");
        else
            System.out.println("Operation failed");
    }
}
/*
 * OUTPUT-----------------------------------------------------------
 * File renamed successfully
 */