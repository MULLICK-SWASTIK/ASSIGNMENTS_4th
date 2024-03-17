package Ques_4;
import java.util.Scanner;
public class Main1 {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("How many students to enter? ");
        Student []students=new Student[k.nextInt()];
        System.out.println("\nEnter student details: ");
        String name,s_name;
        int rn,s_rn, totalMark, s_totalMark;
        for (int i=0;i<students.length;i++){
            k.nextLine();
            System.out.print("\nEnter name: ");
            name=k.nextLine();
            System.out.print("Enter roll number: ");
            rn=k.nextInt();
            System.out.print("Enter total marks: ");
            totalMark=k.nextInt();
            students[i]=new Student(name,rn,totalMark);
            System.out.println("\nEnter next set of data.....");
        }
        System.out.print("Enter searching details: \nEnter name: ");
        k.nextLine();
        s_name=k.nextLine();
        System.out.print("Enter roll number: ");
        s_rn=k.nextInt();
        System.out.print("Enter total marks: ");
        s_totalMark=k.nextInt();
        Student s_student=new Student(s_name,s_rn,s_totalMark);
        boolean isFound = false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(s_student)){
                isFound=true;
                break;
            }
        }
        if (isFound)
            System.out.println("\nStudent found");
        else
            System.out.println("Student not found!");
    }

}
