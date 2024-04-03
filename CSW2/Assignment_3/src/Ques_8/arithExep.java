package Ques_8;

import java.util.Scanner;

public class arithExep {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String inp;
        Double sqrt = 0.0;
        boolean isD;
        do {
            while (true) {
                System.out.println("\nGive input: ");
                inp = k.nextLine();
                try {
                    if (inp == null || inp.isEmpty()) {
                        throw new NullPointerException("Empty input!");
                    } else
                        break;
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
            isD = false;
            try {
                sqrt = Double.parseDouble(inp);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
                isD = true;
            }
        } while (isD);
        /* double fsrt = */ findSqrt(sqrt);
        k.close();
    }

    static void findSqrt(double sqrt) {
        try {
            if (sqrt < 0) {
                throw new ArithmeticException("Can't find square root of number less than 0!");
            } else {
                System.out.println(String.format("Square root of %1$s is %2$s", sqrt, Math.sqrt(sqrt)));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
// OUTPUT------------------------------------------------------
// Give input:

// Empty input!

// Give input:
// d5f4
// Not a number!

// Give input:
// -7
// Can't find square root of number less than 0!
// ----------------------------------------------------------------
// Give input:
// 9.9
// Square root of 9.9 is 3.146426544510455