package a.word_reversal;
import java.util.Scanner;
public class WordReversal {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Write a sentence : ");
        String sentence = stdIn.nextLine();

//        String sentence = "Dog bites man bites dog fights man.";
        String reversed = "";
        String tempWordHolder = "";
        String punctuation = "";

        for (int count = sentence.length() - 1; count >= 0; count--) {
            if (count == sentence.length() - 1 & (sentence.charAt(sentence.length() - 1) == '.' || sentence.charAt(sentence.length() - 1) == '!')) {
                punctuation += (sentence.charAt(sentence.length() - 1));
                continue;
            }
            if (sentence.charAt(count) != ' ') {
                tempWordHolder = sentence.charAt(count) + tempWordHolder;
            } else {
                reversed = reversed.concat(tempWordHolder) + (sentence.charAt(count));
                tempWordHolder = "";
            }
            if (count == 0) reversed = reversed.concat(tempWordHolder);
        }

        reversed = reversed.toLowerCase();
        reversed = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1);
        reversed = reversed.concat(punctuation);
        System.out.println(reversed);
    }
}
