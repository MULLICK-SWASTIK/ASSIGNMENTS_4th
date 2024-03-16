package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		ArrayList<Student> stud = new ArrayList<Student>();
		System.out.println(stud);
		String name;
		int age, mark, roll_no;
		System.out.println("Enter number of students to enter: ");
		int n = k.nextInt();

		for (int i = 0; i < n; i++) {
			k.nextLine();
			System.out.println("Enter name of Student: ");
			name = k.nextLine();
			System.out.println("Enter age: ");
			age = k.nextInt();
			System.out.println("Enter mark: ");
			mark = k.nextInt();
			System.out.println("Enter roll no.: ");
			roll_no = k.nextInt();
			stud.add(new Student(name, age, mark, roll_no));
		}
		System.out.println(stud);
		k.close();
	}
}
