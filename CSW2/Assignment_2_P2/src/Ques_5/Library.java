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
        String book_name = k.nextLine();
        for (Book book : books.values()) {
            if (book.book_name.equals(book_name)) {
                System.out.println(book_name + " is present in the Library.");
                break;
            }
        }
        System.out.print("Enter a key to remove: ");
        int ke = k.nextInt();
        books.remove(ke);
        System.out.println("After removal: \n" + books);
        k.close();
    }
}

// OUTPUT
// {1=Name: Sapiens ID: 5195 Author: Yuval Noah Harari Quantity: 20, 2=Name:
// Chanakya Niti ID: 1587 Author: XYZ Quantity: 10}

// Enter book name to search: Sapiens
// Sapiens is present in the Library.
// Enter a key to remove: 2
// After removal:
// {1=Name: Sapiens ID: 5195 Author: Yuval Noah Harari Quantity: 20}