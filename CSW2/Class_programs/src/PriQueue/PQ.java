package PriQueue;

import java.util.*;

public class PQ {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("C");
        pq.add("Java");
        pq.add("Python");
        pq.add("C++");
        System.out.println("The head value by using peek function is: " + pq.peek());
        System.out.println("The total queue elements are:");
        Iterator it1 = pq.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        pq.poll();
        System.out.println("After removing an element with poll function: ");
        Iterator<String> it2 = pq.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        pq.remove("Java");
        System.out.println("After removing Java with remove function: ");
        Iterator<String> it3=pq.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        boolean a=pq.contains("C");
        System.out.println("Does this priority queue contains C: "+a);
    }
}
// The head value by using peek function is: C
// The total queue elements are:
// C
// C++
// Python
// Java
// After removing an element with poll function:
// C++
// Java
// Python
// After removing Java with remove function:
// C++
// Python
// Does this priority queue contains C: false