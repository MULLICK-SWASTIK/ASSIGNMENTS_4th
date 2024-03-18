package Ques_5;

import java.util.Scanner;
// import java.util.Arrays;

public class Ques_5_driver {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("How many students to enter? ");
        Student students[] = new Student[k.nextInt()];
        System.out.println("\nEnter student details:");
        String name;
        int rn, mark;
        for (int i = 0; i < students.length; i++) {
            System.out.print("\nEnter name: ");
            k.nextLine();
            name = k.nextLine();
            System.out.print("Enter roll number: ");
            rn = k.nextInt();
            System.out.print("Enter mark: ");
            mark = k.nextInt();
            students[i] = new Student(name, rn, mark);
            System.out.println("Entry updated.....");
        }
        // Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            boolean b = false;
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    b = true;
                }
            }
            if (!b)
                break;
        }

        System.out.println("\nSorted student list:-");
        for (Student s : students) {
            System.out.println(s);
        }
        k.close();
    }
}
// OUTPUT
// How many students to enter? 5

// Enter student details:

// Enter name: s1
// Enter roll number: 6
// Enter mark: 1
// Entry updated.....

// Enter name: s2
// Enter roll number: 1
// Enter mark: 2
// Entry updated.....

// Enter name: s3
// Enter roll number: 8
// Enter mark: 3
// Entry updated.....

// Enter name: s4
// Enter roll number: 4
// Enter mark: 4
// Entry updated.....

// Enter name: s5
// Enter roll number: 2
// Enter mark: 5
// Entry updated.....

// Sorted student list:-
// Name: s2 Roll no.: 1 Marks: 2
// Name: s5 Roll no.: 2 Marks: 5
// Name: s4 Roll no.: 4 Marks: 4
// Name: s1 Roll no.: 6 Marks: 1
// Name: s3 Roll no.: 8 Marks: 3