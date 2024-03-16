package Ques_9;
import java.util.ArrayList;

class Enrollment implements EnrollmentSystem{
	static ArrayList<Student> StudentList=new ArrayList<>();
	@Override
	public void enroll(Student s) {
		StudentList.add(s);
	}

	@Override
	public void drop(Student s) {
		StudentList.remove(s);
	}

	@Override
	public void display() {
		for(Student s: StudentList) {
			s.display();
		}
	}

	@Override
	public boolean checkEnrollment(Student s) {
		
		return false;
	}

}
