package Ques_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ques_4_driver {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();
        String name;
        int age, mark;
        char choice;
        while (true) {
            System.out.print("\nEnter name: ");
            name = k.nextLine();
            System.out.print("Enter age: ");
            age = k.nextInt();
            System.out.print("Enter mark: ");
            mark = k.nextInt();
            studentList.add(new Student(name, age, mark));

            System.out.print("Want to enter more student? (y/n)  ");
            choice = k.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                break;
            System.out.println("Next entry.......");
            k.nextLine();
        }
        System.out.println("\nStudent List:-\n");
        for(Student s:studentList){
            System.out.println(s);
        }
        

    }
}
