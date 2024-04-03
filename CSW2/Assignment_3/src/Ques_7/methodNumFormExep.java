package Ques_7;

import java.util.Scanner;

public class methodNumFormExep {
    static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give input: ");
        String inp = k.nextLine();
        int result = intConvertor(inp);
        System.out.println(String.format("\nResultant integer: %1$s", result));
    }

    static int intConvertor(String input) {
        while (true) {
            try {
                Integer result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input type! Try again;");
                input = k.nextLine();
            }
        }
    }
}
//OUTPUT
// Give input: 
// hash
// Invalid input type! Try again;
// 7d
// Invalid input type! Try again;
// 5.1
// Invalid input type! Try again;
// 4

// Resultant integer: 4