/*
 * Read from a File: Write a Java application that opens the "diary.txt" file created in the previous question and displays its
content on the console. The program should handle cases where the file does not exist by displaying an appropriate error
message
 */
package Ques_2;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("F:/GITWORK/CSW2/Assignment_6/src/Ques_1/diary.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
/*
 * OUTPUT--------------------------------------------------
 * 2024-05-14
 * Hello guys, let's code in Java!
 */