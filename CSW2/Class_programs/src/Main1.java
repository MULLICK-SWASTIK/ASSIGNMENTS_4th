import java.util.*;
public class Main1 {
    public static void main(String[]args){
        ArrayList<student> al=new ArrayList<student>();
        al.add(new student(101,"Swastik",20));
        al.add(new student(102,"Ayushman",19));
        al.add(new student(103,"Amit",21));
        System.out.println(al);
        // Collections.sort()
    }
}
class student{
    public int compareTo(student other) {
        return this.age-other.age;
    }
    String name;
    int roll_no,age;
    student(int roll_no, String name, int age){
        this.roll_no=roll_no;
        this.age=age;
        this.name = name;
    }

    public String toString(){
        return "Name: "+this.name+"\nRoll no.: "+this.roll_no+"\nAge: "+this.age+"\n\n";
    }
}