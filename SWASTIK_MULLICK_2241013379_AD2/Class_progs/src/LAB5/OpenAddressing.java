package LAB5;

import java.util.*;

public class OpenAddressing {
    int ar[];
    static Scanner k = new Scanner(System.in);

    void create() {
        System.out.print("How many numbers to enter? ");
        int mod = k.nextInt();
        ar = new int[mod];
        System.out.println("\nEnter elements: ");
        for (int i = 0; i < mod; i++) {
            ar[i] = Integer.MIN_VALUE;
        }
        for (int j = 0; j < mod; j++) {
            int inp = k.nextInt();
            int i = 0, ind = (inp + i) % mod;
            while (ar[ind] != Integer.MIN_VALUE) {
                i++;
                ind = (inp + i) % mod;
            }
            ar[ind] = inp;
        }
    }

    void display() {
        System.out.println("key \t values");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != Integer.MIN_VALUE)
                System.out.println(String.format("%1$s \t %2$s", i, ar[i]));
        }
    }

    void search() {
        System.out.print("Enter number to search: ");
        int inp = k.nextInt(), i = 0, ind = (inp + i) % ar.length;
        while (inp != ar[ind] && i < ar.length) {
            i++;
            ind = (inp + i) % ar.length;
        }
        if (ar[ind] == inp) {
            System.out.println(String.format("Found at key: %1$s", ind));
        } else {
            System.out.println("Element not found");
        }
    }

    void delete() {
        System.out.print("Enter element to delete: ");
        int inp = k.nextInt(), i = 0, ind = (inp + i) % ar.length;
        while (inp != ar[ind] && i < ar.length) {
            i++;
            ind = (inp + i) % ar.length;
        }
        if (ar[ind] == inp) {
            System.out.println(String.format("Deleted element: %1$s", ar[ind]));
            ar[ind] = Integer.MIN_VALUE;
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        OpenAddressing obj = new OpenAddressing();
        while (true) {
            System.out.println("\nSelect an option:-");
            System.out.println("0: Exit");
            System.out.println("1: Create new list");
            System.out.println("2: Display list");
            System.out.println("3: Search element");
            System.out.println("4: Delete element");
            System.out.print("\nEnter choice: ");
            int choice = k.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.delete();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

}
// OUTPUT
/*
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 1
 * How many numbers to enter? 5
 * 
 * Enter elements:
 * 42 19 24 5 10
 * 
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 2
 * key values
 * 0 24
 * 1 5
 * 2 42
 * 3 10
 * 4 19
 * 
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 3
 * Enter number to search: 5
 * Found at key: 1
 * 
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 4
 * Enter element to delete: 42
 * Deleted element: 42
 * 
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 2
 * key values
 * 0 24
 * 1 5
 * 3 10
 * 4 19
 * 
 * Select an option:-
 * 0: Exit
 * 1: Create new list
 * 2: Display list
 * 3: Search element
 * 4: Delete element
 * 
 * Enter choice: 0
 */