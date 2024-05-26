package Threads;

public class BookMovieSeat {
    int total_seats = 10;

    /* synchronized */void bookseat(int seats) {
        System.out.println("Hello");
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println("Seats booked successfully!");
                total_seats -= seats;
                System.out.println("Seats left: " + total_seats);
            } else {
                System.out.println("Seats can't be booked");
                System.out.println("Seats left: " + total_seats);
            }
        }
    }
}

class MovieApp extends Thread {
    static BookMovieSeat b;
    int seats;

    public void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b = new BookMovieSeat();
        MovieApp A1 = new MovieApp();
        A1.seats = 7;
        A1.start();
        MovieApp A2 = new MovieApp();
        A2.seats = 6;
        A2.start();
    }
}