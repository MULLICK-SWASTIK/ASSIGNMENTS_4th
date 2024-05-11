package Ques_5;

public class q5 {
    int a;
    double b;

    q5(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        q5 o1 = new q5(1, 2), o2 = new q5(3, 4);
        Runtime rt = Runtime.getRuntime();
        long freeMemory = rt.freeMemory();
        long totalMemory = rt.totalMemory();
        System.out.println("Total memory before garbage collection: " + totalMemory + "\nFree memory before garbage collection: " + freeMemory);
        o1 = null;
        o2 = null;
        rt.gc();
        freeMemory = rt.freeMemory();
        totalMemory = rt.totalMemory();
        System.out.println("Total memory after garbage collection: " + totalMemory + "\nFree memory after garbage collection: " + freeMemory);
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collected");
    }
}