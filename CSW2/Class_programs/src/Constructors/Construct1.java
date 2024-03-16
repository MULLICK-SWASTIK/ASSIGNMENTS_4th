package Constructors;

class A{
	
	int regdno;
	String name;
	
//	private A(int regdno, String name){
	A(int regdno, String name){
		this.regdno=regdno;
		this.name=name;
	}
	
	void disp() {
		System.out.println("Regdno: "+this.regdno+"\nName: "+this.name);
	}
	
//	public static void main(String[]args) {
//		A obj = new A(1,"abc"); 
//		obj.disp();
//	}
	
}

public class Construct1 {
	
	public static void main(String[]args) {
		A obj = new A(1,"abc"); 
		obj.disp();
	}
	
}
