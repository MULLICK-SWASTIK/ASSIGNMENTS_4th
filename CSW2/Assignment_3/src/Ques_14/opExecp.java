package Ques_14;

import java.util.Scanner;

public class opExecp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Math.toRadians(k.nextDouble());
        try {
            if (Math.abs(x % (Math.PI / 2)) < 0.0001) {
                throw new ArithmeticException("Can't calculate for multiples of π/2 or 90°");
            } else {
                double num = Math.log(Math.abs(Math.sin(x) + Math.cos(x)));
                double den = Math.tan(x) - (1 / Math.tan(x));
                if (den == 0) {
                    throw new ArithmeticException("Division by zero error");
                } else {
                    System.out.println(String.format("log(abs(sin(%1$s) + cos(%1$s))) / (tan(%1$s) - cot(%1$s)) = %2$s", x, num / den));
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        k.close();
    }
}
//OUTPUT
// Enter x: 4
// log(abs(sin(0.06981317007977318) + cos(0.06981317007977318))) / (tan(0.06981317007977318) - cot(0.06981317007977318)) = -0.0045782107698437435