package Ques_19;

import java.util.Scanner;
import java.util.Arrays;

public class Arr_indE {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = k.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = k.nextInt();
        }
        System.out.println("\nInitial array:");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        Arrays.sort(arr);
        System.out.println("\nSorted array:");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println("\nEnter index to retrieve element: ");
        try {
            int search = k.nextInt();
            if (search >= size || search < 0) {
                throw new ArrayIndexOutOfBoundsException(
                        String.format("Index %1$s is out of bounds for size %2$s", search, size));
            } else {
                System.out.println(String.format("Element at index %1$s : %2$s", search, arr[search]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.print("Enter element to search: ");
        int ele = k.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                System.out.println("Element found!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
// OUTPUT
/*
 * Enter array size: 6
 * Enter elements:
 * 4 8 1 2 3 6
 * 
 * Initial array:
 * 4 8 1 2 3 6
 * Sorted array:
 * 1 2 3 4 6 8
 * Enter index to retrieve element:
 * 1
 * Element at index 1 : 2
 * Enter element to search: 6
 * Element found!
 */