package Linked_List;
import java.util.LinkedList;

public class LL1 {
	public static void main(String[]arsg) {
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.add("d");
		obj.addFirst("e");
		obj.addLast("f");
		System.out.println(obj);
		obj.add(2, "g");
		obj.add("h");
		obj.add("i");
		System.out.println(obj);
		// obj.remove();
		obj.remove("b");
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		System.out.println("First element: "+obj.getFirst());
	}
}
