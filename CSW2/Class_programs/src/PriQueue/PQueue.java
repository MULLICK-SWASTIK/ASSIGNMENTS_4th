package PriQueue;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(3);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
/*
 * [1, 3, 2, 4]
 * 1
 * 2
 * 3
 * 4
 */