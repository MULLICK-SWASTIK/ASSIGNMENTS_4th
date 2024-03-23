import java.util.Scanner;
import java.util.ArrayList;

public class errorHand2 {
    public static void main(String[]aegfs){
        Scanner k=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter a list of integers: ");
        while(true){
            System.out.print("Enter element: ");
            int n=k.nextInt();
            // arr.add(n);
            try{
                if(arr.contains(n))
                    throw new DuplicateElementException("List already contains "+n+"!");
                else
                    arr.add(n);
            }catch(DuplicateElementException e){
                System.out.println(e);
            }
            System.out.print("Enter more elements in the list? (y/n) ");
            char ch=k.next().charAt(0);
            if(ch=='n'||ch=='N')
                break;
        }
        System.out.println("Integer List: \n"+arr);
    }
}

class DuplicateElementException extends Exception {
    DuplicateElementException(String e) {
        super(e);
    }
}
//OUTPUT
// Enter a list of integers: 
// Enter element: 5
// Enter more elements in the list? (y/n) y
// Enter element: 3
// Enter more elements in the list? (y/n) y
// Enter element: 9
// Enter more elements in the list? (y/n) y
// Enter element: 3
// DuplicateElementException: List already contains 3!
// Enter more elements in the list? (y/n) n
// Integer List: 
// [5, 3, 9]