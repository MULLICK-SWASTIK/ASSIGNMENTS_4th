package Ques_6;
import java.util.TreeSet;
import java.util.Scanner;
public class Q6 {
    public static void main(String[]args){
        TreeSet<Integer> set=new TreeSet<Integer>();
        Scanner k=new Scanner(System.in);

        System.out.println("Initial TreeSet:\n"+set+"\nEnter 5 elements: ");
        for(int i=0;i<5;i++){
            System.out.print("Enter element: ");
            set.add(k.nextInt());
        }
        System.out.println("\nEnter a number to search: ");
        int search=k.nextInt();
        System.out.println("\n"+search+(set.contains(search)?" is present in tree set":" is not present in the tree set"));
        System.out.print("\nEnter an element to remove: ");
        int remove=k.nextInt();
        set.remove(remove);
        System.out.println("Final TreeSet: \n"+set);
    }
}
/*
Initial TreeSet:
[]
Enter 5 elements: 
Enter element: 1
Enter element: 2
Enter element: 3
Enter element: 4
Enter element: 5

Enter a number to search: 
8

8 is not present in the tree set

Enter an element to remove: 4
Final TreeSet: 
[1, 2, 3, 5]
 */