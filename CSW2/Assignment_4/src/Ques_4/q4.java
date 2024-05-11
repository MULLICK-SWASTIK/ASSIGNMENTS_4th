package Ques_4;

public class q4 {
    String name;

    q4(String name) {
        this.name = name;
    }

    display(){
        System.out.println("Name: "+this.name);
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        new q4("Swastik");
        System.gc();
        System.runFinalization();
    }
}
