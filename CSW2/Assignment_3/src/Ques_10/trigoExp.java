package Ques_10;

import java.util.Scanner;

public class trigoExp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double val = Math.toRadians(k.nextDouble());
        try {
            if (Math.abs(val % (Math.PI / 2)) < 0.0001) {
                throw new ArithmeticException("Can't calculate for multiples of π/2 or 90°");
            } else {
                double result = ((Math.sin(val) + Math.cos(val)) / Math.tan(val));
                System.out.println(String.format("(sin(%1$s) + cos(%1$s)) / tan(%1$s) = %2$s", val, result));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        k.close();
    }
}
//OUTPUT
// Enter a value: 
// 270
// Can't calculate for multiples of π/2 or 90°

//--------------------------------------------------
// Enter a value: 
// 26
// (sin(0.4537856055185257) + cos(0.4537856055185257)) / tan(0.4537856055185257) = 2.741594932214949