
/*
 * Q3.  Write  a  program  that  demonstrates  lazy  evaluation  by  creating  a  lazy 
sequence of prime numbers. Define a lazy sequence using lambda expressions 
that generates prime numbers. Demonstrate lazy evaluation by printing the first 
few prime numbers from the lazy sequence
 */
package Ques_3;

import java.util.stream.Stream;

public class lazySeq {
    public static void main(String[] args) {
        Stream<Integer> lazyPrimes = generatePrimes();
        System.out.println("First 10 prime numbers:");
        lazyPrimes.limit(7).forEach(System.out::println);
    }

    private static Stream<Integer> generatePrimes() {
        return Stream.iterate(2, n -> n + 1)
                .filter(lazySeq::isPrime);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
 * OUTPUT--------------------------------------
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 */