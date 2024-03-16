package Ques_10;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HashT {
    @SuppressWarnings({ "resource", "rawtypes" })
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter a sentence to evaluate: ");
        String sentence=k.nextLine();
        // String sentence="After a long day of hiking through the dense forest, forest sounds surrounded us, echoing through the trees, trees that stood tall and majestic, providing shelter and shade along the winding trails.";
        String words[]=sentence.split(" ");
        Hashtable<String, Integer> ht= new Hashtable<String, Integer>();
        ArrayList<String> al=new ArrayList<>();
        int j=0;
        for (int i=0;i<words.length;i++){
            ht.put(words[i], ht.getOrDefault(words[i],0)+1);
            if (ht.get(words[i]) > j){
                j=ht.get(words[i]);
                al.clear();
            }
            if(ht.get(words[i])==j)
                al.add(words[i]);
        }
        Iterator it=al.iterator();
        System.out.println("Most frequent word: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
