package Ques_4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("How many students to enter? ");
        Student[] students = new Student[k.nextInt()];
        System.out.println("\nEnter student details: ");
        String name, s_name;
        int rn, s_rn, totalMark, s_totalMark;
        for (int i = 0; i < students.length; i++) {
            k.nextLine();
            System.out.print("\nEnter name: ");
            name = k.nextLine();
            System.out.print("Enter roll number: ");
            rn = k.nextInt();
            System.out.print("Enter total marks: ");
            totalMark = k.nextInt();
            students[i] = new Student(name, rn, totalMark);
            System.out.println("\nDetails updated......");
        }

        System.out.print("\nEnter searching details: \nEnter name: ");
        k.nextLine();
        s_name = k.nextLine();
        System.out.print("Enter roll number: ");
        s_rn = k.nextInt();
        System.out.print("Enter total marks: ");
        s_totalMark = k.nextInt();
        Student s_student = new Student(s_name, s_rn, s_totalMark);

        int isFound = 0;
        for (int i = 0; i < students.length; i++) {
            isFound = students[i].compareTo(s_student);
            // System.out.println(isFound);
            if (isFound == 1) {
                break;
            }
        }

        if (isFound == 1)
            System.out.println("\nStudent found");
        else
            System.out.println("Student not found!");
    }

}
//OUTPUT
// How many students to enter? 
// 3

// Enter student details: 

// Enter name: Swastik Mullick
// Enter roll number: 43
// Enter total marks: 98

// Details updated......

// Enter name: Ayushman Lal
// Enter roll number: 25
// Enter total marks: 87

// Details updated......

// Enter name: Suvomoy Goswami
// Enter roll number: 50
// Enter total marks: 65

// Details updated......

// Enter searching details:
// Enter name: Swastik Mullick
// Enter roll number: 43
// Enter total marks: 98

// Student found