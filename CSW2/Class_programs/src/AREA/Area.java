package AREA;

import java.util.Scanner;

public class Area {
	void area(float a) {
		System.out.println("Area of circle is "+(Math.PI*a*a)+" unit square.");
	}
	
	void area(float a, float b) {
		System.out.println("Area of rectangle is "+(a*b)+" unit squre.");
	}
	
	void area(double a) {
		System.out.println("Area of square is "+(a*a)+" unit squre.");
	}
	
	public static void main(String []args) {
		Scanner k=new Scanner(System.in);
		Area a=new Area();
		System.out.print("Enter radius of a circle: ");
		a.area(k.nextFloat());
		System.out.print("Enter length of side of a square: ");
		a.area(k.nextDouble());
		System.out.print("Enter length and width of a rectangle: ");
		a.area(k.nextFloat(),k.nextFloat());
		k.close();
	}
}
