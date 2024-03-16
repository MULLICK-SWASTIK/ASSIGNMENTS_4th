package Iteration_;
import java.util.*;
public class I2{
    @SuppressWarnings("rawtypes")
    public static void main(String[]atgs){
        ArrayList<String> al=new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        System.out.println("Iterable.forEach method(Java 8): ");
        al.forEach(s->System.out.println(s));
        System.out.println();
        System.out.println("Java \"foreach\" loop (Java 5): ");
        for(String s: al){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Three part for loop: ");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }System.out.println();
        System.out.println("while loop: ");
        Iterator<String> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }System.out.println();
        System.out.println("java.util.Iterator (Java 2)");
        Iterator it1=al.iterator();
        while(it1.hasNext()){
            Object o=it1.next();
            System.out.println(o);
        }System.out.println();
        //creating object of type Enumeration<String>
        Enumeration<String> e=Collections.enumeration(al);
        System.out.println("Enumeration over list: ");
        while(e.hasMoreElements()){
            System.out.println("Value is: "+e.nextElement());
        }
    }
}