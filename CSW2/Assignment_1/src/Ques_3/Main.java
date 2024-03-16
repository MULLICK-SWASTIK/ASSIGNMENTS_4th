package Ques_3;

public class Main {
	public static void main(String []args) {
		Point obj1=new Point(10,20);
		Point obj2=new Point(obj1);
		System.out.println("Object1\nx="+obj1.getX()+"\ny="+obj1.getY());
		System.out.println("\nObject2\nx="+obj2.getX()+"\ny="+obj2.getY());
		obj1.setX(5);obj1.setY(90);
		System.out.println("\nObject1\nx="+obj1.getX()+"\ny="+obj1.getY());
		System.out.println("\nObject2\nx="+obj2.getX()+"\ny="+obj2.getY());
	}
}
