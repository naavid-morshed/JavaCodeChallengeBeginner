package c.word_search;

public class WordSearch {
    public static void main(String[] args) {
        String sentence = "Man bites dog bites bites man bites dog";
        String[] arrayOfWords = sentence.split(" ");
        String word = "bites";
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
