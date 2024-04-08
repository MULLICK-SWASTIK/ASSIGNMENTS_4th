package Ques_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Scanner;

public class ioExep {

    public static void main(String[] args) {
        // Scanner k=new Scanner(System.in);
        // String filePath=k.nextLine();
        // java.io.File file=new java.io.File(filePath);
        String filePath = "example.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
// OUTPUT
// An error occurred while reading the file: example.txt (The system cannot find
// the file specified)