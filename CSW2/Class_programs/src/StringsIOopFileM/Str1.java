package StringsIOopFileM;

public class Str1 {
    public static void main(String[] ags) {
        String str = new String("College");
        System.out.println(str.replace("l", "m")); // Commege
        System.out.println(str); // College
        str = str.replace("l", "m");
        System.out.println(str); // Commege
        String s1 = "This is a demo";
        System.out.println(s1.replace("is", "was")); // Thwas was a demo
        System.out.println(s1.replaceFirst("is", "was")); // Thwas is a demo
        System.out.println(s1.replaceAll("is", "was")); // Thwas was a demo
    }
}
