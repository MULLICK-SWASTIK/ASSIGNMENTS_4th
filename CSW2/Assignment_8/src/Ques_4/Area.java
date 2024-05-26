/*
 * Q4. Create  a functional  interface Shape  with a  method double area() and a 
default  method  void  printArea().  Implement  the  interface  using  lambda 
expressions for different shapes. Define the Shape functional interface with an 
area  method.  Implement  the  interface  for  shapes  like  circle,  square,  and 
rectangle using lambda expressions. Use the default method to print the area of 
each shape
 */
package Ques_4;

interface Shape {
    double area();

    default void printArea() {
        System.out.println("Area: " + area());
    }
}

public class Area {
    public static void main(String[] args) {
        Shape circle = () -> Math.PI * 1.3 * 1.3;
        Shape square = () -> {
            double side = 4.0;
            return side * side;
        };
        Shape rectangle = () -> {
            double length = 6.0;
            double width = 3.0;
            return length * width;
        };
        System.out.println("Circle:");
        circle.printArea();
        System.out.println("Square:");
        square.printArea();
        System.out.println("Rectangle:");
        rectangle.printArea();
    }
}
/*
 * OUTPUT---------------------------------------------
 * Circle:
 * Area: 5.3092915845667505
 * Square:
 * Area: 16.0
 * Rectangle:
 * Area: 18.0
 */