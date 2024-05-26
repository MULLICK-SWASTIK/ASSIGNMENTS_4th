package FileManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class oddEve {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arr[] = new int[k.nextInt()];
        try {
            System.out.println("Enter elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = k.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        FileOutputStream file = new FileOutputStream("F:\\GitWork\\CSW2\\Class_programs\\src\\FileManagement\\odd.txt");
        try {
            for (int i : arr)
                if (i % 2 != 0) {
                    file.write(i);
                    System.out.println("lkjdsahf");
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FileInputStream fle = new FileInputStream("F:\\GitWork\\CSW2\\Class_programs\\src\\FileManagement\\odd.txt");
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\GitWork\\CSW2\\Class_programs\\src\\FileManagement\\odd.txt");
            while ((ch = fr.read()) != -1) {
                System.out.print(ch+" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
