package Ques_6;

import java.time.LocalDate;
import java.time.LocalTime;

public class LibrarySystem {
	public static void main(String []args) {
		Book b1=new Book("Yuval Noah Harari","Sapiens",498);
		b1.displayDetails();
		Magazine m1=new Magazine("Jane Smith", "National Geographic", LocalDate.of(2024, 5, 28));
		m1.displayDetails();
		DVD d1=new DVD("The Wachowskis", "The Matrix", LocalTime.of(5, 6));
		d1.displayDetails();
	}
}
