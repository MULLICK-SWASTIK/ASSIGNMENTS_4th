/*
 * Q4. Implement a program where two threads  communicate with each other using wait() and
notify() methods. One thread should print even numbers, and the other should print odd numbers in
sequence.
 */
package Ques_4;

public class threadComm {
    private static final Object lock = new Object();
    private static volatile boolean isEvenTurn = true;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 2; i <= 10; i += 2) {
                    while (!isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even: " + i);
                    isEvenTurn = false;
                    lock.notify();
                }
            }
        });
        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 9; i += 2) {
                    while (isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd: " + i);
                    isEvenTurn = true;
                    lock.notify();
                }
            }
        });
        evenThread.start();
        oddThread.start();
    }
}

/*
 * OUTPUT--------------------------------------------------------------------
 * Even: 2
 * Odd: 1
 * Even: 4
 * Odd: 3
 * Even: 6
 * Odd: 5
 * Even: 8
 * Odd: 7
 * Even: 10
 * Odd: 9
 */