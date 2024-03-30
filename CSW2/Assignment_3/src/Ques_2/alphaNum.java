package Ques_2;

import java.util.Scanner;

public class alphaNum {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Give input: ");
        String str = k.nextLine();
        try {
            if (str == null || str.isEmpty())
                throw new NullPointerException("Given input is Empty!");
            int count = 0;
            System.out.println("\nPrevious Characters \t Current Character");
            for (int i = 2; i < str.length(); i++) {
                char curChar = str.charAt(i), prevChar = str.charAt(i - 1), preprevChar = str.charAt(i - 2);

                if (Character.isDigit(curChar) && ((isVowel(preprevChar) && !isVowel(prevChar) && !Character.isDigit(prevChar) && !Character.isDigit(preprevChar))
                        || (isVowel(prevChar) && !isVowel(preprevChar) && !Character.isDigit(prevChar) && !Character.isDigit(preprevChar))))

                {
                    System.out.println(String.format("%3$s-%2$s\t\t\t  %1$s", curChar, prevChar, preprevChar));
                    count++;
                }
            }
            if (count == 0) {
                System.out
                        .println("\nThere is no such number in the input which is preceded by vowel and consonant");
            }
        } catch (NullPointerException e) {
            System.out.println("\nPressed enter without input <┘\n" + e.toString());
        }
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
//OUTPUT
// *Give input: 1fa5ff6ao7565vi6sddw5ssu25adf46a5d4f

// Previous Characters      Current Character
// f-a                       5
// v-i                       6
// s-u                       2


// *Give input: 

// Pressed enter without input <┘
// java.lang.NullPointerException: Given input is Empty!


// *Give input: a1d1f2r55y5g5h8gf556f5hfj5kh5l

// Previous Characters      Current Character

// There is no such number in the input which is preceded by vowel and consonant