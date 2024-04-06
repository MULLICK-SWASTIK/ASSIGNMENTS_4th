package Ques_13;

import java.util.Scanner;

public class mathCalc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Math.toRadians(k.nextDouble());
        try {
            double numerator = Math.sin(x) * Math.cos(x);
            double denominator = Math.sin(x) + Math.cos(x);
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero error");
            } else {
                System.out.println(String.format("(sin(%1$s) * cos(%1$s)) / (sin(%1$s) + cos(%1$s)) = %2$s", x, numerator / denominator));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        k.close();
    }
}
//OUTPUT
// Enter x: 26
// (sin(0.4537856055185257) * cos(0.4537856055185257)) / (sin(0.4537856055185257) + cos(0.4537856055185257)) = 0.29465721874900697