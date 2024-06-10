package LAB9;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter array length:");
        int n = k.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        QuickSort obj = new QuickSort();
        obj.Quick_Sort(arr, 0, n - 1);
        System.out.println("After Sorting:" + Arrays.toString(arr));
    }

    void Quick_Sort(int arr[], int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            Quick_Sort(arr, start, p - 1);
            Quick_Sort(arr, p + 1, end);
        }
    }

    public int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int k = start - 1, temp;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                temp = arr[k + 1];
                arr[k + 1] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        temp = arr[k + 1];
        arr[k + 1] = arr[end];
        arr[end] = temp;
        return k + 1;
    }
}
/*
 * OUTPUT----------------------------------
 * Enter array length:8
 * Enter elements
 * 6 1 3 10 4 2 8 0
 * After Sorting:[0, 1, 2, 3, 4, 6, 8, 10]
 */