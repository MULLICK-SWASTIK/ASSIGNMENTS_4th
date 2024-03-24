package LAB5;

import java.util.*;

public class OpenAddressing {
    public static void main(String[] args) {
        // Scanner k = new Scanner(System.in);
        // System.out.println("Enter size: ");
        // int n=k.nextInt(), arr[]=new int[n];
        int ar[] = { 42, 19, 24, 0, 10 }, mod = ar.length, output[] = new int[mod];
        for (int i = 0; i < mod; i++) {
            output[i] = Integer.MIN_VALUE;
        }
        System.out.println("keys \t values");
        for (int j = 0; j < mod; j++) {
            int i = 0, ind;
            ind = (ar[j] + i) % mod;
            while (output[ind] != Integer.MIN_VALUE) {
                i++;
                ind = (ar[j] + i) % mod;
            }
            output[ind] = ar[j];
            System.out.println(ind + " \t " + ar[j]);
        }
    }

    // int calcKey(int num, int output[]){
    //     int i=0, ind;
    //     ind=(num+i)%output.length;
        
    // }

    void searchKey(int num){
        boolean found=false;

    }
    // int hashout(int val, int mod){

    // }
}
