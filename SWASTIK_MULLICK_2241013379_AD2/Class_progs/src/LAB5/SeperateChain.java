package LAB5;

import java.util.*;

public class SeperateChain {
    Node[] ar;
    static Scanner k = new Scanner(System.in);

    public static void main(String[] ars) {
        SeperateChain obj = new SeperateChain();
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

    void create() {
        System.out.print("How many numbers to enter? ");
        int len = k.nextInt();
        ar = new Node[len];
        System.out.println("Enter elements:");
        for (int i = 0; i < len; i++) {
            Node num = new Node(k.nextInt());
            int ind = num.data % len;
            num.next = ar[ind];
            ar[ind] = num;
        }
    }

    void search() {
        System.out.print("Enter number to search: ");
        int inp = k.nextInt(), ind = inp % ar.length;
        if (ar[ind] != null) {
            Node temp = ar[ind];
            while (temp != null) {
                if (temp.data == inp) {
                    System.out.println(String.format("Found at key: %1$s", ind));
                    return;
                }
                temp = temp.next;
            }
        }
        System.out.println("Number not found");
    }

    void delete() {
        System.out.print("Enter value to delete: ");
        int inp = k.nextInt(), ind = inp % ar.length;
        Node temp, prev;
        if (ar[ind] != null) {
            if (ar[ind].data == inp) {
                ar[ind] = ar[ind].next;
                System.out.println("Deleted");
                return;
            }
            prev = ar[ind];
            temp = ar[ind].next;
            while (temp != null) {
                if (temp.data == inp) {
                    prev.next = temp.next;
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        System.out.println("Number not found");
    }

    void display() {
        System.out.println("HashTable data--");
        int len = ar.length;
        for (int i = 0; i < len; i++) {
            if (ar[i] != null) {
                System.out.print("Key: " + i + "\tValue: ");
                Node temp = ar[i];
                while (temp != null) {
                    System.out.print(temp.data + "  ");
                    temp = temp.next;
                }
                System.out.println();
            }

        }
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}