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
        System.out.println("\nStudent List: ");
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("\nEnter a Student's detail to check its existence:-");
        k.nextLine();
        System.out.print("Enter name: ");
        String s_name = k.nextLine();
        System.out.print("Enter age: ");
        int s_age = k.nextInt();
        System.out.print("Enter mark: ");
        int s_mark = k.nextInt();
        Student s_student = new Student(s_name, s_age, s_mark);
        Boolean isExist = false;
        int student_count = 0;
        for (Student s : studentList) {
            if (s_student.equals(s)) {
                isExist = true;
            }
            student_count++;
        }
        System.out.println("\nIs the searched student present in the Student List? : " + isExist
                + "\nTotal number of students in Student List: " + student_count);
    }
}
//OUTPUT
// Enter name: a
// Enter age: 20
// Enter mark: 98
// Want to enter more student? (y/n)  y
// Next entry.......

// Enter name: b
// Enter age: 21
// Enter mark: 87
// Want to enter more student? (y/n)  y
// Next entry.......

// Enter name: c
// Enter age: 19
// Enter mark: 65
// Want to enter more student? (y/n)  n

// Student List:
// Name: a  Age: 20         Mark: 98
// Name: b  Age: 21         Mark: 87
// Name: c  Age: 19         Mark: 65

// Enter a Student's detail to check its existence:-
// Enter name: a
// Enter age: 20
// Enter mark: 98

// Is the searched student present in the Student List? : true
// Total number of students in Student List: 3