package Ques_5;

import java.util.Scanner;

public class mathComp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Give input: ");
        try {
            String input = k.nextLine();
            if (input == null || input.isEmpty())
                throw new NullPointerException("No input provided!");
            Double num = Double.parseDouble(input);
            double result = computation(num);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type!");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        k.close();
    }

    static double computation(double num) {
        double result = Math.sin(num) + Math.log(num) + Math.sqrt(num);
        return result;
    }

}
// OUTPUT
// Give input:
// java.lang.NullPointerException: No input provided!

// Give input: q
// Invalid input type!

// Give input: 2
// Result: 3.0166581697587223