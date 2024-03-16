import java.util.TreeSet;
public class TreeS1 {
    public static void main(String[]argfs){
        TreeSet<String> t1=new TreeSet<String>();
        TreeSet<Integer> t2=new TreeSet<Integer>();
        t2.add(5);
        t2.add(7);
        t2.add(90);
        t2.add(-7);
        t2.add(1);
        t1.add("g");
        t1.add("a");
        t1.add("");
        System.out.println(t1);
        System.out.println(t2);
    }
}
