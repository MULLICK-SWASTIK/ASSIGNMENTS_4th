package Garbage_Collection;

public class GCDemo2 {
    public static void main(String[] args) {
        Runtime run_ref = Runtime.getRuntime();
        GCDemo2 obj1 = new GCDemo2();
        obj1 = null;
        long freeMemo, freeMemoInMB, totalMemo, totalMemoInMB;
        totalMemo = run_ref.totalMemory();
        totalMemoInMB = totalMemo / (1024 * 1024);
        System.out.println(String.format("Total memory: %1$s", totalMemoInMB));
        freeMemo = run_ref.freeMemory();
        freeMemoInMB = freeMemo / (1024 * 1024);
        System.out.println(String.format("Free Memory: %1$s", freeMemoInMB));
        run_ref.gc();
        // System.runFinalization();
        freeMemo = run_ref.freeMemory();
        freeMemoInMB = freeMemo / (1024 * 1024);
        System.out.println(String.format("Free Memory when garbage is collected: %1$s", freeMemoInMB));
    }

    protected void finalize() {
        System.out.println("Object is destroyed.");
    }

}
