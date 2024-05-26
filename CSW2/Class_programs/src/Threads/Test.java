package Threads;

public class Test {
    public static void main(String[] args) {
        testTot t = new testTot();
        t.start();
        synchronized (t) {
            try {
                t.wait();
            } catch (InterruptedException e) {
                System.out.println("An error occured: " + e.getMessage());
            }
            System.out.println(t.total);
        }
    }
}

class testTot extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 100;
            }
        }
        //this.notify();
    }
}
