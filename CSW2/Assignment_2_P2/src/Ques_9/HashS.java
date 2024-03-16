package Ques_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashS {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("How many elements for array: ");
        int arr[] = new int[k.nextInt()];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> rpt = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(i)) {
                rpt.add(i);
            }
            hs.add(i);
        }
        System.out.println("Repeated elements:-");
        Iterator it = rpt.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
//*Output:-
// How many elements for array: 6
// Enter elements in array: 
// 1
// 1
// 2
// 3
// 4
// 4
// Repeated elements:-
// 1 4