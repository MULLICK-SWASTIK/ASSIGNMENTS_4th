package Threads;

public class ThreadTest1 extends Thread {
    public static void main(String[] args) {
        System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);// 1-10
        /*
         * NORM_PRIORITY-5
         * MIN_PRIORITY-1
         * MAX_PRIORITY0-10
         */
        System.out.println(Thread.currentThread().getPriority());
        ThreadTest1 t = new ThreadTest1();
        t.start();
    }

    public void run() {
        System.out.println("Child Thread");
        System.out.println("Child Thread priority " + Thread.currentThread().getPriority());
    }
}
