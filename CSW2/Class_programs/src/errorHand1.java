import java.util.Scanner;
public class errorHand1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n=k.nextInt();
        System.out.println("Is "+n+" an odd number? "+IsOdd(n));
        k.close();
    }

    static boolean IsOdd(int n){
        return ((n&1)==1)?true:false;
    }

}
//OUTPUT
// Enter an integer: 
// 1368361431
// Is 1368361431 an odd number? true