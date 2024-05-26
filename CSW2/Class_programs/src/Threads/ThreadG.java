package Threads;

public class ThreadG implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadG runab = new ThreadG();
        ThreadGroup myThreadGroup = new ThreadGroup("My Thread Group");
        Thread t1 = new Thread(myThreadGroup, runab, "My First thread");
        t1.start();
        Thread t2 = new Thread(myThreadGroup, runab, "My Second thread");
        t2.start();
        Thread t3 = new Thread(myThreadGroup, runab, "My Third thread");
        t3.start();
        System.out.println("My Thread Group Name: " + myThreadGroup.getName());
        myThreadGroup.list();
    }
}
