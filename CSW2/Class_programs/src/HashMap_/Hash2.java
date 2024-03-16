package HashMap_;
import java.util.*;
public class Hash2 {
    @SuppressWarnings("rawtypes")
    public static void main(String[]args){
        HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
        hmap1.put(1,"A");
        hmap1.put(2,"B");
        hmap1.put(3,"C");
        hmap1.put(4,"D");
        hmap1.put(5,"E");
        Set set1=hmap1.entrySet();
        Iterator it1=set1.iterator();
        while(it1.hasNext()){
            Map.Entry ment1=(Map.Entry)it1.next();
            System.out.println("The value is: "+ment1.getValue()+" and key is: "+ment1.getKey()); 
        }
        String va=hmap1.get(2);
        System.out.println("Index 2 has value of "+va);
        //book prog. page 379
    }
}
