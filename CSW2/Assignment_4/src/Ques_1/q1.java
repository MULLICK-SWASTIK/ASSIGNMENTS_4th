package Ques_1;

class q1 {
    String name;

    q1(String name) {
        this.name = name;
    }

    show(){
        q1 obj1=new q1("Swastik");
        display();
    }

    display(){
        q1 obj2=new q1("Mullick");
    }

    public static void main(String[] args) {
        show();
        System.gc();
        System.runFinalization();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection successful for " + this.name);
    }
}
