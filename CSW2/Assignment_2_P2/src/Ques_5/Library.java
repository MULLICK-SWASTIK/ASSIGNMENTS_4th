package Ques_5;

import java.util.HashMap;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();
        Scanner k = new Scanner(System.in);
        books.put(1, new Book("Sapiens", 5195, "Yuval Noah Harari", 20));
        books.put(2, new Book("Chanakya Niti", 1587, "XYZ", 10));
        System.out.println(books);
        System.out.print("\nEnter book name to search: ");
        // k.nextLine();
        String book_name=k.nextLine();
        
    }
}
