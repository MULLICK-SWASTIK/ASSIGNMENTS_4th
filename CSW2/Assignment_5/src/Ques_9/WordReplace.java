/*
 * Word Replacement in Sentences: Request a sentence and two words from the user: one to search for and one to replace it
with. Find the first occurrence of the search word in the sentence. Replace the word using substring operations and
concatenation. Display the original and the modified sentences.
 */
package Ques_9;

import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = k.nextLine();
        System.out.println("Enter two words: ");
        String w1 = k.next(), w2 = k.next();
        int n1 = s.indexOf(w1), n2 = s.indexOf(w2);
        System.out.println("First occurence of " + w1 + " is at index " + n1);
        System.out.println("Modified string: " + (s.substring(0, n2) + s.substring(w2.length() + n2)));
    }
}
/*
 * OUTPUT-----------------------------------------
 * Enter a sentence:
 * Hello guys, let's code in Java
 * Enter two words:
 * code in
 * First occurence of code is at index 18
 * Modified string: Hello guys, let's code Java
 */