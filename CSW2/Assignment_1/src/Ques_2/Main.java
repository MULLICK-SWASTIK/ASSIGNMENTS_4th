package Ques_2;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter length of a rectangle: ");
		double length=k.nextDouble();
		System.out.println("Enter width of a rectangle: ");
		double width=k.nextDouble();
		Rectangle obj=new Rectangle(length, width);
		obj.display();
		k.close();
	}
}
