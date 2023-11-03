package d.anagram;

import java.util.Arrays;

public class AnagramAlternate {
    public static void main(String[] args) {
        String str1 = "binary";
        String str2 = "brainy";

        if (anagramChecker(str1, str2)) {
            System.out.println("Anagram found");
        } else {
            System.out.println("Anagram not found");
        }
    }

    public static boolean anagramChecker(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Anagrams must have the same length
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
