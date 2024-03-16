import java.util.HashSet;
public class Hash2 {
    public static void main(String[]args){
        HashSet<String> hs=new HashSet<String>();
        hs.add("Apricot");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Strawberry");
        hs.add("Dates");
        hs.add("Banana");
        //Adding duplicates
        hs.add("Apricot");
        hs.add("Mango");
        //Multiple null values
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}
