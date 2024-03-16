import java.util.ArrayList;
public class TestArrayList1 {
	public static void main(String[]args) {
		ArrayList a1=new ArrayList();
		for(int i=1;i<6;i++) {
			a1.add(i);
		}
//		for(Object i: a1) {
//			System.out.print(i+"..");
//		}
		System.out.println(a1);
		a1.remove(3);
//		for(Object i: a1) {
//			System.out.print(i+"..");
//		}
		System.out.println(a1);
		System.out.println(a1.contains(5));
		a1.clear();
		System.out.println(a1);
		
	}
}
