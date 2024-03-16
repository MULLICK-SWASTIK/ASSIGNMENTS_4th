package TreeMap_;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;
@SuppressWarnings("unused")
public class Tree1 {
    @SuppressWarnings("rawtypes")
    public static void main(String[]args){
        TreeMap<Integer,String> trmap=new TreeMap<Integer,String>();
        trmap.put(1, "Object1");
        trmap.put(2, "Object2");
        trmap.put(3, "Obejct3");
        trmap.put(4, "Obejct4");
        trmap.put(5, "Obejct5");
        Set set=trmap.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            Map.Entry ment=(Map.Entry)it.next();
            System.out.println("Key: "+ment.getKey()+" Value: "+ment.getValue());
        }
    }
}
