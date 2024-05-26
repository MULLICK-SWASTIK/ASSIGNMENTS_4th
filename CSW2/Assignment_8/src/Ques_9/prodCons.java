/*
 * Q9. Write  a program that  implements the  producer-consumer problem  using 
lambda expressions and threads. Define a bounded buffer class that implements 
a queue. Create producer and consumer classes that use lambda expressions to 
produce and consume items from the bounded buffer. Create and start multiple 
producer and consumer threads to demonstrate the producer-consumer problem.
 */
package Ques_9;

import java.util.LinkedList;
import java.util.Queue;

public class prodCons {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5);
        Thread producer1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                buffer.put(i);
                System.out.println("Producer 1 produced: " + i);
            }
        });
        Thread consumer1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                int item = buffer.get();
                System.out.println("Consumer 1 consumed: " + item);
            }
        });
        producer1.start();
        consumer1.start();
    }
}

class BoundedBuffer<T> {
    private Queue<T> buffer;
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new LinkedList<>();
    }

    public synchronized void put(T item) {
        while (buffer.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.offer(item);
        notifyAll();
    }

    public synchronized T get() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T item = buffer.poll();
        notifyAll();
        return item;
    }
}
/*
 * OUTPUT------------------------------------------------------------------
 * Consumer 1 consumed: 0
Producer 1 produced: 0
Producer 1 produced: 1
Producer 1 produced: 2
Producer 1 produced: 3
Consumer 1 consumed: 1
Producer 1 produced: 4
Consumer 1 consumed: 2
Producer 1 produced: 5
Consumer 1 consumed: 3
Consumer 1 consumed: 4
Consumer 1 consumed: 5
 */