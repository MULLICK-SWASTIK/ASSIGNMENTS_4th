package Ques_2;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayListUser {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("How many entries?");
        User al[] = new User[k.nextInt()];
        int age;
        String name;
        System.out.println("Commit entries:-");
        for (int i = 0; i < al.length; i++) {
            System.out.print("\nName: ");
            k.nextLine();
            name = k.nextLine();
            System.out.print("Age: ");
            age = k.nextInt();
            al[i] = new User(name, age);
            System.out.println("Next entry....");
        }
        System.out.println("\nUser list:-");
        for (User i : al) {
            System.out.print("\n" + i);
        }
        Arrays.sort(al);
        System.out.println("\n\nSorted User list:-");
        for (User i : al) {
            System.out.print("\n" + i);
        }
        k.close();
    }
}
