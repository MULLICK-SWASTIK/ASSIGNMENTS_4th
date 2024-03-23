public class TestException {
    public static void main(String[] args) throws Exception {
        int a = 5, b = 0;
        String s = "iter";
        try {
            System.out.println(a / b);
            System.out.println(s.charAt(4));
        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
            // e.printStackTrace();
            // System.out.println(e.toString());
            // System.out.println(e.getMessage());
            // System.out.println("Denominator should not be zero!");
            // System.out.println(e.getStackTrace());
            System.out.println(e);
        }
    }
}
