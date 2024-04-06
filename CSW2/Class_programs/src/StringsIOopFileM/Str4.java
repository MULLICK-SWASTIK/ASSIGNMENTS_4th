package StringsIOopFileM;

import java.util.Arrays;

public class Str4 {
    public static void main(String[] args) {
        String greet = "Hello! World";
        System.out.println("String: " + greet);
        int length = greet.length();
        System.out.println("Length: " + length + "\n-----------------------------------------------------");
        String first = "Java ";
        String second = "Programming";
        String joinedString = first.concat(second);
        System.out.println("Joined string: " + joinedString + "\n---------------------------------------------------");
        String s1 = "java programming";
        String s2 = "java programming";
        String s3 = "JAva programming";
        boolean res1 = s1.equals(s3);
        System.out.println("String s1 and s2 equal? " + s1.equals(s2));
        System.out.println("String s1 and s3 equal? " + res1);
        boolean res2 = s1.equalsIgnoreCase(s3);
        System.out.println("Ignoring case, string s1 and s3 equal? " + res2);
        boolean res3 = s1.contains("java");
        boolean res4 = s3.contains("java");
        System.out.println("String s1 contains \"java\"? " + res3);
        System.out.println("String s3 contains \"java\"? " + res4);
        String s4 = String.join("°", "Java", "is", "fun");
        System.out.println(s4);
        int res5 = s3.compareTo(s1);
        int res6 = s1.compareTo(s3);
        System.out.println(res5 + " " + res6);
        int res7 = s1.compareToIgnoreCase(s3);
        System.out.println(res7);
        String s5 = "       Hello                  ";
        System.out.println(s5.trim());
        int count = 30;
        String lang = "Java";
        System.out.println(String.format("Language: %s", lang));
        System.out.println(String.format("Count: %d", count));
        System.out.println(String.format("Hexadecimal value: %x", count));
        String ss = "Java is a fun programming language";
        String subs[] = ss.split(" ");
        for (String s : subs) {
            System.out.println(s);
        }
        String ss1 = "a:bc:def:g:hi:jkl";
        String[] splitStr = ss1.split(":", -1);
        System.out.println(Arrays.toString(splitStr));
        String[] splitStr1 = ss1.split(":", 4);
        System.out.println(Arrays.toString(splitStr1));
        // str.toLowerCase()
        // str.toUpperCase()
        // String.valueOf(int) --> "<value in int>"
        // String.valueOf(double) --> "<value in double>"
        char ch[] = { 'J', 'a', 'v', 'a' };
        System.out.println(String.valueOf(ch));
        String bs = "Java";
        System.out.println(bs.toCharArray());
    }
}
