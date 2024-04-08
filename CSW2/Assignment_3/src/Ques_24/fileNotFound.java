package Ques_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileNotFound {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that does not exist
            File file = new File("nonexistent_file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
            // Additional handling if needed
        }
    }
}
//OUTPUT
// File not found: nonexistent_file.txt (The system cannot find the file specified)