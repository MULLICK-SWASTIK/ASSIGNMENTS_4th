/*
 * Q5. Implement a program that demonstrates the  use   of   locks  (e.g., ReentrantLock) for thread
synchronization. Create a scenario where multiple threads access a shared resource, and use locks to
ensure that only one thread can access the resource at a time
 */
package Ques_5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class threadLock {
    private static final int NUM_THREADS = 5;
    private static final int NUM_ITERATIONS = 10000;
    private static int counter = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new CounterIncrementer());
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final counter value: " + counter);
    }

    static class CounterIncrementer implements Runnable {
        public void run() {
            for (int i = 0; i < NUM_ITERATIONS; i++) {
                lock.lock();
                try {
                    counter++;
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
/*
 * OUTPUT---------------------------------------------------------
 * Final counter value: 50000
 */