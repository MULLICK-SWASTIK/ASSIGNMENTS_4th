package Ques_11;
import java.util.Scanner;
import java.util.HashMap;

public class HashM{
    public static void main(String []args){
        HashMap<Integer, Integer> hm=new HashMap<>();
        Scanner k=new Scanner(System.in);
        for (int i=0;i<10;i++){
            hm.put(i+1, -1);
        }
        System.out.println("How many elements? ");
        int arr[]=new int[k.nextInt()];
        System.out.println("\nEnter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=k.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        int min=10;
        for(int i:hm.keySet()){
            if(min>i && hm.get(i)==-1)
                min=i;
        }
        System.out.println("Smallest missing number: "+min);
    }
}
// How many elements? 
// 5

// Enter elements:
// 8 4 1 2 6
// Smallest missing number: 3