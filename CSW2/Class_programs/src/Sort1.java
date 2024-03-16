import java.util.ArrayList;
import java.util.Collections;

public class Sort1 {
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(8);
        al.add(3);
        al.add(9);
        al.add(5);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
