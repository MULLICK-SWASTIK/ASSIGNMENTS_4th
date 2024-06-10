package LAB8;

import java.util.*;

public class CountingInversions {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = k.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        CountingInversions obj = new CountingInversions();
        int invCount = obj.merge_sort(arr, 0, n - 1);
        System.out.println(
                String.format("Number of inversions are %1$s.\nAfter sorting: %2$s", invCount, Arrays.toString(arr)));
    }

    public int merge_sort(int arr[], int l, int r) {
        int c = 0;
        if (l < r) {
            int mid = (l + r) / 2;
            c += merge_sort(arr, l, mid);
            c += merge_sort(arr, mid + 1, r);
            c += merge(arr, l, mid, r);
        }
        return c;
    }

    public int merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l, count = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (m - (l + i) + 1);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return count;
    }
}
/*
 * OUTPUT------------------------
 * Enter number of elements: 6
 * Enter elements:
 * 2 4 1 8 3 10
 * Number of inversions are 4.
 * After sorting: [1, 2, 3, 4, 8, 10]
 */