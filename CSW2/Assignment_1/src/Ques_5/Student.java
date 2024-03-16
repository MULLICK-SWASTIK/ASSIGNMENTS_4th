package Ques_5;

public class Student {
	int studentId;
	String studentName;
	College c;
	Student(String studentName, int studentId, College c){
		this.c=c;
		this.studentId=studentId;
		this.studentName=studentName;
	}
	void displayStudentInfo() {
		System.out.println("\nStudent name: "+this.studentName+
				"\nStudent ID: "+this.studentId+
				"\nCollege: "+c.collegeName+", "+c.collegeLoc);
	}
}
