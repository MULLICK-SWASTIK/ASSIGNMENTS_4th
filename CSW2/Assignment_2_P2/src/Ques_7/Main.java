package Ques_7;
import java.util.*;
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[]args){
        TreeMap<String,Address> AdrsList=new TreeMap<>();
        Scanner k=new Scanner(System.in);
        System.out.println("Enter prompted details:-");
        while(true){
            System.out.print("Enter name of a person: ");
            String name=k.nextLine();
            System.out.print("Enter plot number: ");
            String plot_no=k.nextLine();
            System.out.print("Enter locality: ");
            String at=k.nextLine();
            System.out.print("Enter post office: ");
            String post=k.nextLine();
            AdrsList.put(name,new Address(plot_no,at,post));
            
            System.out.println("Continue adding data? (y/n)");
            char c=k.next().charAt(0);
            if(c=='n' || c=='N')
                break;
            k.nextLine();
        }
        Set set=AdrsList.entrySet();
        Iterator it=set.iterator();
        System.out.println("Name ---- Address");
        while(it.hasNext()){
            Map.Entry sa= (Map.Entry)it.next();
            System.out.println(sa.getKey()+" ---- "+sa.getValue());
        }
    }
}
