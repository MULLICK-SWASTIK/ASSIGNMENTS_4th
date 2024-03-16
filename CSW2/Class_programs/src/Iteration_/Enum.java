package Iteration_;
import java.util.*;
public class Enum {
    public static void main(String[]args){
        Vector<Integer> vec=new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        Enumeration<Integer> e=vec.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
