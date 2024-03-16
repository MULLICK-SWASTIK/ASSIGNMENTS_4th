package Ques_5;

public class Main {
	public static void main(String[]args) {
		College c1=new College("Iter","Bhubaneshwar");
		College c2=new College("Kiit","Bhubaneshwar");
		Student s1=new Student("Swastik Mullick",2468846,c1);
		Student s2=new Student("Soham Chakraborty",1546656,c2);
		s1.displayStudentInfo();
		s2.displayStudentInfo();
	}
}
