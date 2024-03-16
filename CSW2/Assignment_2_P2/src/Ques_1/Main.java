package Ques_1;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("How many elements? ");
        int n=k.nextInt();
        Pair<String, String> parr[]=new Pair[n];
        System.out.println("Enter elements: ");
        String key;String value;
        for(int i=0;i<parr.length;i++){
            key=k.next();
            value=k.next();
            parr[i]=new Pair<String, String>(key, value);
            System.out.println("Enter next....");
        }
        System.out.println("\n(Key, Value)\n");
        for(Pair i: parr){
            System.out.println(i);
        }
    }
}
// How many elements? 
// 3
// Enter elements: 
// i 1
// Enter next....
// 1 2
// Enter next....
// one 1
// Enter next....

// (Key, Value)

// (i, 1)
// (1, 2)
// (one, 1)