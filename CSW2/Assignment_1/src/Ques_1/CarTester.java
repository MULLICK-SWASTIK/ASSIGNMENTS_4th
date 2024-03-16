package Ques_1;

import java.util.Scanner;

public class CarTester {
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter make for myCar1: ");
		String make1=k.next();
		System.out.println("Enter model for myCar1: ");
		String model1=k.next();
		String make2=null, model2=null;
		Car myCar1=new Car(make1,model1), myCar2=new Car(make2,model2);
		System.out.println("Make of myCar1: "+myCar1.getMake());
		System.out.println("Model of myCar1: "+myCar1.getModel());
		System.out.println("Make of myCar2: "+myCar2.getMake());
		System.out.println("Model of myCar2: "+myCar2.getModel());
		System.out.println("\nEnter make for myCar2: ");
		make2=k.next();
		System.out.println("Enter model for myCar2: ");
		model2=k.next();
		myCar2.setMake(make2);myCar2.setModel(model2);
		System.out.println("\nUpdated myCar2: ");
		System.out.println("Make of myCar2: "+myCar2.getMake());
		System.out.println("Model of myCar2: "+myCar2.getModel());
		k.close();
	}
}
