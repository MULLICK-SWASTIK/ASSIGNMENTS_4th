/*
 * Delete a Specific File: Write a Java program where the user can enter the name of a file to be deleted from the system. The
program should check if the file exists and delete it, providing a confirmation message upon successful deletion or an error
message if the file does not exist
 */
package Ques_6;

import java.util.*;
import java.io.*;

public class delSpecific {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter file name to delete: ");
        String fname = k.nextLine();
        File file = new File(fname);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("An error occurred while deleting the file.");
            }
        } else {
            System.out.println("File doesn't exists!");
        }
    }
}
/*
 * OUTPUT---------------------------------------------------------------------
 * Enter file name to delete:
 * F:\GITWORK\CSW2\Assignment_6\src\Ques_3\diary.txt
 * File deleted successfully.
 */