package Iteration_;
import java.util.ArrayList;
import java.util.ListIterator;
public class LI2 {
    public static void main(String[]args){
        ArrayList<Integer> as = new ArrayList<>();
        as.add(10);
        as.add(20);
        as.add(30);
        ListIterator<Integer> it=as.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
        // it.add(40);
        // System.out.println(as);
        it.set(200);
        System.out.println(as);
    }
}
