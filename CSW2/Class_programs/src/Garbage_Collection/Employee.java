package Garbage_Collection;

public class Employee {
    private int id, age;
    private static int nextId=1;
    private String name;

    public Employee(String name,/*  int id, */int age) {
        this.name = name;
        this.id = nextId++;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("a", 10);
        Employee e2=new Employee("b", 20);
        Employee e3=new Employee("c", 30);
        Employee e4=new Employee("d", 40);
        Employee e5=new Employee("e", 50);
        show(e1);
        show(e2);
        show(e3);
        e4=null;
        e5=null;
        showNextId();
        System.gc();
        System.runFinalization();
        showNextId();
    }

    static void show(Employee emp){
        System.out.println(String.format("Name: %1$s \t ID: %2$s \t\t Age: %3$s", emp.name, emp.id, emp.age));
    }

    static void showNextId(){
        System.out.println(String.format("Next ID: %1$s", nextId));
    }

    protected void finalize(){
        nextId--;
        System.out.println(nextId);
    }
}