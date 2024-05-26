/*
 * Write a Java program to create a simple calculator that performs arithmetic operations
(addition, subtraction, multiplication, division) using multiple threads. Each arithmetic operation
should be handled by a separate thread
 */
package Ques_1;

public class Calculate {
    public static void main(String[] args) {
        Addition a = new Addition(5, 6);
        Subtraction b = new Subtraction(5, 4);
        Multiplication c = new Multiplication(4, 5);
        Division d = new Division(3, 0);
        a.start();
        b.start();
        c.start();
        d.start();
    }
}

class Addition extends Thread {
    double a, b;

    Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(String.format("%1$s + %2$s = %3$s", a, b, (a + b)));
    }
}

class Subtraction extends Thread {
    double a, b;

    Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(String.format("%1$s - %2$s = %3$s", a, b, (a - b)));
    }
}

class Multiplication extends Thread {
    double a, b;

    Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(String.format("%1$s * %2$s = %3$s", a, b, (a * b)));
    }
}

class Division extends Thread {
    double a, b;

    Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(String.format("%1$s / %2$s = %3$s", a, b, (a / b)));
    }
}
/*
 * OUTPUT---------------------------------
 * 4.0 * 5.0 = 20.0
 * 5.0 + 6.0 = 11.0
 * 5.0 - 4.0 = 1.0
 * 3.0 / 0.0 = Infinity
 */