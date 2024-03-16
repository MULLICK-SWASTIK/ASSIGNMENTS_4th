package Ques_1;

public class Student<T> {
    String name;
    int age;
    T roll_no;

    Student(String name, T roll_no, int age) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    public String toString(){
        return "Name: "+this.name+"\tRoll no.: "+this.roll_no+"\tAge: "+this.age;
    }

}
