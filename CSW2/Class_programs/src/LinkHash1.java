import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkHash1 {
    public static void main(String[]args){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        lhs.add(5);
        lhs.add(55);
        lhs.add(555);
        lhs.add(5555);
        lhs.add(55555);
        Iterator<Integer> itr =lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
