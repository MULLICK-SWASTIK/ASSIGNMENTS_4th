package Ques_3;

class q3 {
    String name;

    q3(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        q3 obj = new q3("object");
        obj = null;
        System.gc();
        // System.runFinalization();
    }
}
