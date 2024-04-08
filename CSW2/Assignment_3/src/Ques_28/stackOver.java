package Ques_28;

public class stackOver {
    public static void main(String[] args) {
        try {
            recursiveMethod(1000000);
        } catch (StackOverflowError e) {
            System.out.println("Main method: Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int num) {
        try {
            if (num == 0) {
                return;
            } else {
                recursiveMethod(num - 1);
            }
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

}
