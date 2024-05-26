/*
 * Q6. Write a program that demonstrates a function returning another function, 
where the inner function calculates the square of a number. Define a function 
that returns another function. The inner function should calculate the square of a 
given number. Demonstrate the use of the returned function to calculate squares.
 */
package Ques_6;

import java.util.function.Function;

public class sqrtNum {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = createSquareFunction();
        System.out.println("Square of 5: " + squareFunction.apply(5));
        System.out.println("Square of 8: " + squareFunction.apply(8));
    }

    private static Function<Integer, Integer> createSquareFunction() {
        return (Integer x) -> x * x;
    }
}

/*
 * OUTPUT------------------------------------------------------------------
 * Square of 5: 25
 * Square of 8: 64
 */