import java.util.ArrayList;
public class TestArrayList {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		al.add("BJ");
		al.add("BJ");
		al.add(8);
		al.add(3.5);
		for(Object i: al) {
			System.out.println(i);
		}
		al.set(1, "DT");
		for(Object i: al) {
			System.out.println(i);
		}
		al.remove(0);
		for(Object i: al) {
			System.out.println(i);
		}
		System.out.println(al.get(0));
	}
}
