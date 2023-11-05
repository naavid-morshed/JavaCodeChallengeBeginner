package c.word_search;
import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Write a sentence : ");
        String sentence = stdIn.nextLine();
//        String sentence = "Man bites dog bites bites man bites dog";
//        String word = "bites";
        System.out.print("Find which word? ");
        String word = stdIn.nextLine();

        String[] arrayOfWords = sentence.split(" ");
        int count = 0;

        for (String wordFromArray : arrayOfWords) {
            if (word.equals(wordFromArray)) {
                count++;
            }
        }

        System.out.println(sentence);
        System.out.println(word + " found " + count + " times.");
    }
}
