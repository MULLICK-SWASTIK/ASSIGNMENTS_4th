package HashMap_;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Hash1 {
    @SuppressWarnings("rawtypes")
    public static void main(String []args){
        HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        System.out.println(hm);
        hm.put(2,null);
        hm.put(null,null);
        hm.put(null,"null1");
        hm.put(4,null);
        System.out.println(hm+"\n");
        Set s=hm.entrySet();
        System.out.println(s+"\n");
        Iterator it=s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        it=s.iterator();
        System.out.println();
        while(it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
        System.out.println();
        for(Map.Entry e: hm.entrySet()){
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
    }

}
