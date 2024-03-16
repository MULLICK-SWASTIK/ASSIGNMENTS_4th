interface J1{
	final int i=10;
	void show();
	default void msg() {
		System.out.println("Hi");
	}
}
public class Test1 implements J1 {
//	public void msg() {
//		
//	}

	@Override
	public void show() {
		System.out.println("Hello World");
	}
	
	public static void main(String []argfs) {
		Test1 t=new Test1();
		
	}
}
