package Ques_11;

import java.util.Scanner;

public class matOp {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double val = Math.toRadians(k.nextDouble());
        try {
            if (Math.abs(val % (Math.PI / 2)) < 0.0001) {
                throw new ArithmeticException("Can't calculate for multiples of π/2 or 90°");
            } else {
                double logPara = Math.sin(val) + Math.cos(val);
                if (logPara <= 0) {
                    throw new ArithmeticException("Can't calculate logarithm for such value.");
                } else {
                    double numerator = Math.log(logPara);
                    double denominator = Math.tan(val) - (1 / Math.tan(val));
                    double result = numerator / denominator;
                    System.out.println(
                            String.format("log(sin(%1$s) + cos(%1$s)) / (tan(%1$s) - cot(%1$s)) = %2$s", val, result));
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            k.close();
        }
    }
}
// OUTPUT
/*
 * Enter a value: 90
 * Can't calculate for multiples of π/2 or 90°
 * -------------------------------------------------------
 * Enter a value: -45
 * log(sin(-0.7853981633974483) + cos(-0.7853981633974483)) /
 * (tan(-0.7853981633974483) - cot(-0.7853981633974483)) =
 * -1.10298560904254672E17
 */