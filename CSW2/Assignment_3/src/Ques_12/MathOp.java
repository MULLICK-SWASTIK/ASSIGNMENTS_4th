package Ques_12;

import java.util.Scanner;

public class MathOp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double x = Math.toRadians(k.nextDouble());
        try {
            if (Math.abs(x % (Math.PI / 2)) < 0.0001) {
                throw new ArithmeticException("Can't calculate for multiples of π/2 or 90°");
            } else {
                double sq_val = Math.abs(Math.sin(x) * Math.cos(x));
                if (sq_val < 0) {
                    throw new ArithmeticException("Can't find square root of a negative value!");
                } else {
                    double sqrt = Math.sqrt(sq_val);
                    double denom = Math.tan(x) + 1;
                    if (denom == 0.0) {
                        throw new ArithmeticException("Division by zero error");
                    } else {
                        double result = sqrt / denom;
                        System.out.println(String.format("sqrt(abs(sin(%1$s) * cos(%1$s))) / (tan(%1$s) + 1) = %2$s", x, result));
                    }
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        k.close();
    }
}
//OUTPUT
// Enter a value: 75
// sqrt(abs(sin(1.3089969389957472)*cos(1.3089969389957472)))/(tan(1.3089969389957472)+1) = 0.10566243270259354