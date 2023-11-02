package e.panagram;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayOfAlphabets = alphabets.toCharArray();

        int alphabetCounter = 0;
        for (char c : arrayOfAlphabets) {
            if (sentence.contains(String.valueOf(c))) {
                alphabetCounter++;
            }
        }

        if (alphabetCounter == 26) System.out.println("pangram Found");
    }
}
