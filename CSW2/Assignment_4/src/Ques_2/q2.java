package Ques_2;

class q2 {
    public static void main(String[] args) {
        q2 obj1 = new q2();
        q2 obj2 = new q2();
        obj1 = obj2;
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection ");
    }
}
