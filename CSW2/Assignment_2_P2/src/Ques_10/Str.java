package Ques_10;
public class Str {
    public static void main(String[]args){
        String sentence="This is a sample sentence to learn the split method.";
        String words[]=sentence.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }
}
