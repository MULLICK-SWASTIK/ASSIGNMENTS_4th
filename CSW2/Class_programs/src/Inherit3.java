class O2{
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	public int getD() {
		return d;
	}
}

class T2 extends O2{
	public void display() {
		System.out.println(a+" "+b+" "+c+" "+getD());
	}
}

public class Inherit3 {
	public static void main(String []argfs) {
		T2 t=new T2();
		t.display();
	}
}
