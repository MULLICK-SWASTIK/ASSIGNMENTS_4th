interface I1{
	final int i=1;
	void show();
}

interface I2{
	void display();
}

public class Test implements I1,I2{
	public void show() {
		System.out.print(i);
//		System.out.print("Hello");
	}
	
	public void display() {
		System.out.println(" World!");
	}
	
	public static void main(String []arfs) {
		Test t=new Test();
		t.show();t.display();
	}
}
