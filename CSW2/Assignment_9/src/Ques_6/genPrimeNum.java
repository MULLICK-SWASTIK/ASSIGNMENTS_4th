/*
 * Q6.   Write a Java program that generates  prime numbers up to a given limit using multiple
threads. Each thread should generate a subset of the prime numbers.
 */
package Ques_6;

import java.util.List;
import java.util.ArrayList;

public class genPrimeNum {
    public static void main(String[] args) {
        int limit = 100;
        List<Integer> primes = generatePrimes(limit);
        System.out.println("Prime numbers up to " + limit + ":");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static List<Integer> generatePrimes(int limit) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        List<Integer> primes = new ArrayList<>();
        int segmentSize = limit / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * segmentSize + 2;
            int end = (i == numThreads - 1) ? limit : (i + 1) * segmentSize + 1;
            threads[i] = new Thread(() -> {
                List<Integer> segmentPrimes = new ArrayList<>();
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        segmentPrimes.add(num);
                    }
                }
                synchronized (primes) {
                    primes.addAll(segmentPrimes);
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
 * OUTPUT--------------------------------------------------------------
 * Prime numbers up to 100:
 * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */