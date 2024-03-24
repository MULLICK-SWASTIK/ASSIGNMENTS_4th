import java.util.*;

public class errorHand3 {
    public static void main(String[]arfs){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=k.nextLine();
        String[] str_arr=str.split("");
        try{
            boolean isExist=false;
            for (String s:str_arr){
                if (s=="a"||s=="e"||s=="i"||s=="o"||s=="u"||s=="A"||s=="E"||s=="I"||s=="O"||s=="U"){
                    isExist=true;
                    break;
                }
            }
            if(isExist==false){
                throw new NoVowelException("String doesn't contains any vowels.");
            }else{
                System.out.println("Vowels are present.");
            }
        }catch(NoVowelException e){
            System.out.println(e);
        }
        System.out.println("EOF");
    }
}

class NoVowelException extends Exception{
    NoVowelException(String msg){
        super(msg);
    }
}