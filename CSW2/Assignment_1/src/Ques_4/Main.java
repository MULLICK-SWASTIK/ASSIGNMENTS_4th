package Ques_4;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner k=new Scanner(System.in);
		Laptop lap1=new Laptop();
		System.out.println("Enter laptop model: ");
		lap1.setModel(k.nextLine());
		System.out.println("Enter laptop price: ");
		lap1.setPrice(k.nextLong());
		System.out.print("{Model, Price} : ");
		System.out.println(lap1);
		k.close();
	}
}
