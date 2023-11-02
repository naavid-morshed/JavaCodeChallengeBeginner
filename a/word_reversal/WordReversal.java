package a.word_reversal;

public class WordReversal {
    public static void main(String[] args) {
        String word = "Dog bites man bites dog fights man!";
        String reversed = "";
        String temp = "";
        String punctuation = "";

        for (int count = word.length() - 1; count >= 0; count--) {
            if (count == word.length() - 1 & (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '!')) {
                punctuation += (word.charAt(word.length() - 1));
                continue;
            }
            if (word.charAt(count) != ' ') {
                temp = word.charAt(count) + temp;
            } else {
                reversed = reversed.concat(temp) + (word.charAt(count));
                temp = "";
            }
            if (count == 0) reversed = reversed.concat(temp);
        }
        reversed = reversed.toLowerCase();
        reversed = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1);
        reversed = reversed.concat(punctuation);
        System.out.println(reversed);
    }
}
