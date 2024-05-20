/*
 * Append Content to an Existing File: Write a Java program that adds a new diary entry to the "diary.txt" file without
overwriting its existing content. The program should ask the user for the new entry and append it to the file along with a
timestamp
 */
package Ques_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppen {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your diary entry: ");
        String entry = k.nextLine();
        try {
            FileWriter fw = new FileWriter("F:/GITWORK/CSW2/Assignment_6/src/Ques_3/diary.txt", true);
            String date = java.time.LocalDate.now().toString();
            fw.write(String.format("\n%1$s\n%2$s", date, entry));
            fw.close();
            System.out.println("Diary entry successful");
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
/*
 * OUTPUT-------------------------------------------------------
 * Enter your diary entry:
 * Appended text
 * Diary entry successful
 */