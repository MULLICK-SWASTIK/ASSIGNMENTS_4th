package Ques_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inpMismatch {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inp;
        while (true) {
            try {
                inp = k.nextInt();
                break;
            } catch (InputMismatchException e) {
                k.next();
                System.out.print("Invalid input! Please try again: ");
            }
        }
        System.out.println(String.format("\nUser input : %1$s", inp));
        k.close();
    }
}
// OUTPUT
/*
 * Enter an integer: ]
 * Invalid input! Please try again: m
 * Invalid input! Please try again: 0.2
 * Invalid input! Please try again: 8
 * 
 * User input : 8
 */