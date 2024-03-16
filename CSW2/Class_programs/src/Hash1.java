import java.util.HashSet;
public class Hash1 {
    public static void main(String[]args){
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(45);
        hs.add(10);
        hs.add(5);
        hs.add(5);
        hs.add(100);
        hs.add(500);
        System.out.println(hs);
        hs.remove(10);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        System.out.println("Is 100 present: "+hs.contains(100));
    }
}
