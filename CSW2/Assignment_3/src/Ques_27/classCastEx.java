package Ques_27;

import java.util.ArrayList;

public class classCastEx {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Object1");
        list.add(123);
        list.add(2.4);
        for (Object obj : list) {
            try {
                String s = (String) obj;
                System.out.println(String.format("Casting successful: %1$s", s));
            } catch (ClassCastException e) {
                System.out.println(String.format("\n%2$s\nCasting failed: %1$s", obj, e.getMessage()));
            }
        }
    }
}
// OUTPUT
/*
 * Casting successful: Object1
 * 
 * class java.lang.Integer cannot be cast to class java.lang.String
 * (java.lang.Integer and java.lang.String are in module java.base of loader
 * 'bootstrap')
 * Casting failed: 123
 * 
 * class java.lang.Double cannot be cast to class java.lang.String
 * (java.lang.Double and java.lang.String are in module java.base of loader
 * 'bootstrap')
 * Casting failed: 2.4
 */