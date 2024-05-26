/*
 * Q1.    Create  a  functional  interface  Calculator  with  methods  for  addition, 
subtraction,  multiplication,  and  division.  Implement  these  methods  using 
lambda expressions. Define the Calculator functional interface with methods for 
arithmetic  operations.  Implement  the  interface  methods  using  lambda 
expressions for basic arithmetic operations.
 */
package Ques_1;

interface Calculator {
    double calculate(double x, double y);
}

public class Calc {
    public static void main(String[] args) {
        Calculator addition = (x, y) -> x + y;
        System.out.println("Addition: " + addition.calculate(5, 7));
        Calculator subtraction = (x, y) -> x - y;
        System.out.println("Subtraction: " + subtraction.calculate(5, 7));
        Calculator multiplication = (x, y) -> x * y;
        System.out.println("Multiplication: " + multiplication.calculate(5, 7));
        Calculator division = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("Division by zero error!");
            }
        };
        System.out.println("Division: " + division.calculate(5, 2));
    }
}
/*
 * OUTPUT-----------------------------------------------------------
 * Addition: 12.0
 * Subtraction: -2.0
 * Multiplication: 35.0
 * Division: 2.5
 */