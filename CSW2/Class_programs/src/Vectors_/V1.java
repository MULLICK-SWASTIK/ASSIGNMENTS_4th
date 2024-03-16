package Vectors_;

import java.util.*;

public class V1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] astg) {
		// Setting up initial size and increments
		Vector vec = new Vector(3, 2);
		System.out.println("Initial size: " + vec.size());
		System.out.println("Initial Capacity: " + vec.capacity());
		// Adding elements
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement(3);
		vec.addElement(4);
		System.out.println("The capacity after four additions is: " + vec.capacity());
		vec.addElement(3.2);
		System.out.println("Now capacity is: " + vec.capacity());
		vec.addElement(5);
		vec.addElement(9.9);
		System.out.println("Now capacity is: " + vec.capacity());
		System.out.println("First element is: " + /* (Integer) */ vec.firstElement());
		System.out.println("Last element is: " + /* (Double) */ vec.lastElement());
		// enumerate the vector elements
		Enumeration vecEnum = vec.elements();
		System.out.println("Elements in the vector: ");
		while (vecEnum.hasMoreElements()) {
			System.out.print(vecEnum.nextElement() + " ");
		}
		System.out.println();

	}
}
