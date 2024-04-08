package Ques_22;

public class customExep {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            if (b == 0) {
                throw new CustomException("Division by zero error");
            } else {
                System.out.println(String.format("Result : %1$s", a / b));
            }
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}
// OUTPUT
// Ques_22.CustomException: Division by zero error