/*
 * Q7.Write  a  program  that  calculates  factorial  using  a  recursive  lambda 
expression. Define a recursive lambda expression to calculate factorial. Use the 
lambda expression to calculate factorial of a given number.
 */
package Ques_7;

import java.util.function.Function;

public class factNum {
    public static void main(String[] args) {
        Function<Integer, Long> factorial = factNum::calculateFactorial;
        int number = 5;
        long result = factorial.apply(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1L;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

/*
 * OUTPUT-----------------------------------------------------------------
 * Factorial of 5 is: 120
 */