import java.util.Scanner;
public class TestException2 {
    @SuppressWarnings("resource")
    public static void main(String[]aergs){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=k.nextInt();
        try{
            if(age<18)
                throw new VotingAgeException("You are not eligible to vote yet.");
            else
                System.out.println("\nYou are eligible to vote.");
        }catch(VotingAgeException e){
            System.out.println(e);
        }
        System.out.println("\nGood day!");
        k.close();
    }
    
}

class VotingAgeException extends Exception{
    VotingAgeException(String e){
        super(e);
    }
}
