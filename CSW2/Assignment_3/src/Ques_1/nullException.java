package Ques_1;

public class nullException {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("\n\n" + str.charAt(0));
        } catch (NullPointerException e) {
            // System.out.println("Null Pointer Exception....");
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
