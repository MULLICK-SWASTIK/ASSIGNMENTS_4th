package Ques_17;

public class linkLarrInd {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;
    private static final int MAX_SIZE = 100; // Maximum size of the linked list

    linkLarrInd() {
        head = null;
        size = 0;
    }

    // Method to add a new element to the end of the linked list
    public void add(int data) {
        if (size >= MAX_SIZE) {
            System.out.println("Cannot add more elements. Maximum size reached.");
            return;
        }

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to get the element at the specified index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        linkLarrInd linkedList = new linkLarrInd();

        // Add some elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Attempt to access elements beyond the bounds
        try {
            System.out.println("Element at index 2: " + linkedList.get(2));
            System.out.println("Element at index 5: " + linkedList.get(5)); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
// OUTPUT
// Element at index 2: 3
// Caught ArrayIndexOutOfBoundsException: Index is out of bounds.