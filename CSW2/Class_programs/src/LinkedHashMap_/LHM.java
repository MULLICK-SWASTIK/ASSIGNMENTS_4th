package LinkedHashMap_;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("unused")
public class LHM {
    @SuppressWarnings("rawtypes")
    public static void main(String[]aargs){
        LinkedHashMap<Integer,String> liHmap=new LinkedHashMap<Integer,String>();
        liHmap.put(1, "A");
        liHmap.put(2, "B");
        liHmap.put(3, "C");
        liHmap.put(4, "D");
        liHmap.put(5, "E");
        // System.out.println(liHmap);
        // for (int i: liHmap.keySet()){
        //     System.out.println(i+" :"+liHmap.get(i));
        // }
        Set set=liHmap.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
