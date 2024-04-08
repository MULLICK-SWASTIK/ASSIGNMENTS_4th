package Ques_26;

public class Exep {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            System.out.println("End of block_1");
        }
    }
}
// OUTPUT
/*
 * Class not found: NonExistentClass
 * End of block_1
 */