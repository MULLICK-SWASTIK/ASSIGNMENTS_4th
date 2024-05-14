/*
 * Create and Write to a File: Write a Java program that prompts the user for a diary entry, then creates a file named
"diary.txt" and writes the current date followed by the user's entry into this file. Ensure the program checks if the file already
exists and informs the user, to avoid overwriting any previous content
 */
package Ques_1;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileWri {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your diary entry: ");
        String entry = k.nextLine();
        try {
            File file = new File("F:/GITWORK/CSW2/Assignment_6/src/Ques_1/diary.txt");
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                FileWriter fw = new FileWriter(file);
                String date = java.time.LocalDate.now().toString();
                fw.write(date + "\n" + entry);
                // fw.write(entry);
                fw.close();
                System.out.println("Diary entry written successfully");
            }
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
/*
 * OUTPUT----------------------------
 * Enter your diary entry:
 * Hello guys, let's code in Java!
 * Diary entry written successfully
 */