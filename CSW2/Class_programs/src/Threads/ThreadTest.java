package Threads;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        System.out.println("Hello printed by " + Thread.currentThread().getName());
        ThreadTest t1 = new ThreadTest();
        t1.start();
        ThreadTest t2 = new ThreadTest();
        t2.setName("ITER");
        t2.start();
        System.out.println(Thread.currentThread().isAlive());
    }

    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}
