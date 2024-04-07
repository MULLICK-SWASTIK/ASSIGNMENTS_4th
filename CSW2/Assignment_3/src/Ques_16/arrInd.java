package Ques_16;

import java.util.Scanner;

public class arrInd {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = k.nextInt();
        int arr[] = new int[size];
        while (true) {
            try {
                System.out.print("\nEnter position to enter element: ");
                int pos = k.nextInt();
                if (pos >= size) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Index %1$s out of bounds for length %2$s", pos, size));
                }
                System.out.print("Enter element: ");
                arr[pos] = k.nextInt();
                System.out.println("Enter more? (y/n) ");
                char ch = k.next().charAt(0);
                if (ch == 'n' || ch == 'N')
                    break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println("\nArray: ");
        for (int i : arr)
            System.out.print(i + " ");
        k.close();
    }
}
//OUTPUT
// Enter array size: 6

// Enter position to enter element: 7
// java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6

// Enter position to enter element: 5
// Enter element: 4
// Enter more? (y/n) 
// y

// Enter position to enter element: 1
// Enter element: 7
// Enter more? (y/n) 
// n

// Array:
// 0 7 0 0 0 4