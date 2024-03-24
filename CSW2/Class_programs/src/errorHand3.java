// import java.util.*;

public class errorHand3 {
    public static void main(String[]arfs){
        // Scanner k=new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String str=k.nextLine();
        String str="My name is Swastik";
        String[] str_arr=str.split("");
        try{
            boolean isExist=false;
            for (int i=0;i<str_arr.length;i++){
                if( str_arr[i]=="a" || str_arr[i]=="e" || str_arr[i]=="i" || str_arr[i]=="o" || str_arr[i]=="u" || str_arr[i]=="A" || str_arr[i]=="E" || str_arr[i]=="I" || str_arr[i]=="O" || str_arr[i]=="U" ){
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