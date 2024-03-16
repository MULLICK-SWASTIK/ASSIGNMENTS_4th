import java.util.Scanner;

class O1{
	int i;

	public O1(int i) {
		this.i=i;
	}
}

class T1 extends O1{
	int a;
	
	public T1(int i, int b) {
//	public T1(int i) {
		super(i);
		a=b;
	}
}

public class Inherit2 {
	public static void main(String []arfs) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter data: ");
		T1 t=new T1(k.nextInt(),k.nextInt());
//		T1 t=new T1(k.nextInt());
		System.out.println(t.i+" "+t.a);
//		System.out.println(t.i);	
		k.close();
	}
}
