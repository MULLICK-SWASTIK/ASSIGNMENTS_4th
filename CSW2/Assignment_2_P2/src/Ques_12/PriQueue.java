package Ques_12;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriQueue {
    public static void main(String[]args){
        int arr[]={1,2,10,8,7,3,4,6,5,9};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i: arr){
            pq.offer(i);
        }
        System.out.println("Min-Heap:-");
        Iterator it=pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }System.out.println();
        System.out.println("Removal Sequence: ");
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}
