class One{
	int i=10;
	void show() {
		System.out.println("Super class method i="+i);
	}
	
	void msg() {
		System.out.println("Hello");
	}
	
	public One() {
		System.out.println("Super construct");
	}
}

class Two extends One{
	int i=20;
	
	void show() {
		System.out.println("Sub class method i="+super.i);
		super.show();
	}
	
	public Two() {
		System.out.println("Sub construct");
	}
}

public class Inherit1 {
	public static void main(String []aars) {
		Two t=new Two();
		t.show();
		t.msg();
	}
}
