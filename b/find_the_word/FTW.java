package b.find_the_word;
import java.util.Scanner;
public class FTW {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String sentence = "Man bites dog! dog fights man!";
        String targetWord = "";

        System.out.println(sentence);
        System.out.print("Choose word number from last : ");
        int wordFromLastCount = stdIn.nextInt();
        int wordCount = 1;

        for (int count = sentence.length() - 1; count >= 0; count--) {
            if (wordCount == wordFromLastCount & sentence.charAt(count) != ' ') {
                targetWord = sentence.charAt(count) + targetWord;
            }
            if (sentence.charAt(count) == ' ') {
                wordCount++;
            }
        }
        System.out.println(targetWord);
    }
}
