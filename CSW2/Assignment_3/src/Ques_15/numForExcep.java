package Ques_15;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class numForExcep {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            Double dnd = Double.parseDouble(k.next());
            try {
                System.out.print("Enter divisor: ");
                Double dvs = Double.parseDouble(k.next());
                if (dvs == 0) {
                    throw new ArithmeticException("Divisor can't be zero!");
                } else {
                    System.out.println(String.format("Result: %1$s", dnd / dvs));
                }
            } catch (ArithmeticException e) {
                System.out.println("\n" + e.toString());
            }
        } catch (NumberFormatException e) {
            System.out.println("\n" + e.toString());
        } finally {
            k.close();
        }
    }
}
// OUTPUT
// Enter dividend: 78
// Enter divisor: as

// java.lang.NumberFormatException: For input string: "as"
// -----------------------------------------------------------
// Enter dividend: 45
// Enter divisor: 0

// java.lang.ArithmeticException: Divisor can't be zero!
// -----------------------------------------------------------
// Enter dividend: 78
// Enter divisor: 16
// Result: 4.875