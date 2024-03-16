class a{

	protected Object show() throws RuntimeException{
		System.out.println("Hello");
		return null;
	}

}

public class overriding1 extends a {

	public StringBuffer show() throws ArithmeticException{
		try {
			System.out.println("Hi");
			return null;
		}catch(Exception e) {
			throw new ArithmeticException("Error");
		}
	}
	
	public static void main(String []args) {
		a t=new a();
		t.show();	//Hello
		overriding1 o=new overriding1();
		o.show();	//Hi
	}

}
