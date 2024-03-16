package ArraysList;

public class Student {

	String name;
	int age, mark, roll_no;

	Student(String name, int age, int mark, int roll_no) {
		this.name = name;
		this.age = age;
		this.mark = mark;
		this.roll_no = roll_no;
	}

	public String toString() {
		return "[" + this.name + ": " + this.age + " years: " + this.mark + " M: roll-" + this.roll_no + "]";
	}

}
