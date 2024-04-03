package Garbage_Collection;

public class GCDemo {
    protected void finalize() {
        System.out.println("Garbage collected!");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        GCDemo g1 = new GCDemo();
        GCDemo g2 = new GCDemo();
        g1 = null;
        g2 = null;
        g1 = g2;
        new GCDemo();
        System.gc();
    }
}
