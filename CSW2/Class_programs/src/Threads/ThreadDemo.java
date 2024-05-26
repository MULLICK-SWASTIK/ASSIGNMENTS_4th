package Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("CSW2");
        // System.out.println(10 / 0);
        System.out.println(Thread.currentThread().getName());
    }
}
