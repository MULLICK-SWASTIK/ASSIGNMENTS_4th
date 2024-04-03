package Ques_9;

import java.util.Scanner;

public class divByZero {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = k.nextDouble();
        System.out.println("\nEnter num2: ");
        double num2 = k.nextDouble();
        System.out.println("\nChoose~\n1: num1 divided by num2\n2: num2 divided by num1");
        int ch = k.nextInt();
        try {
            switch (ch) {
                case 1:
                    if (num2 == 0) {
                        throw new ArithmeticException("Illegal operation: Division by zero!");
                    } else {
                        System.out.println(String.format("Result: %1$s", (num1 / num2)));
                    }
                    break;
                case 2:
                    if (num1 == 0) {
                        throw new ArithmeticException("Illegal operation: Division by zero!");
                    } else {
                        System.out.println(String.format("Result: %1$s", (num2 / num1)));
                    }
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        k.close();
    }
}
// OUTPUT
// Enter num1:
// 1.2

// Enter num2:
// 0

// Choose~
// 1: num1 divided by num2
// 2: num2 divided by num1
// 1
// Illegal operation: Division by zero!
// ---------------------------------------------------------------------------

/*
 * Enter num1:
 * 1.2
 * 
 * Enter num2:
 * 0
 * 
 * Choose~
 * 1: num1 divided by num2
 * 2: num2 divided by num1
 * 2
 * Result: 0.0
 */