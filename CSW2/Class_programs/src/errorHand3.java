import java.util.*;

public class errorHand3 {
    public static void main(String[] arfs) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=k.nextLine();
        // String str = "My name is Swastik";
        String[] str_arr = str.split("");

        try {
            boolean isExist = false;
            for (String s : str_arr) {
                if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A")
                        || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U")) {
                    isExist = true;
                    break;
                }
            }
            if (isExist == false) {
                throw new NoVowelException("String doesn't contains any vowels.");
            } else {
                System.out.println("Vowels are present.");
            }
        } catch (NoVowelException e) {
            System.out.println(e);
        }
        System.out.println("EOF");
    }
}

class NoVowelException extends Exception {
    NoVowelException(String msg) {
        super(msg);
    }
}