package d.anagram;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "binary";
        String str2 = "brainy";

        // Did not need to import any packages but none of the original strings are
        // preserved, also needed to run nested for loop
        // Also had to reduce counter each time string length is reduced

        for (int count = 0; count < str2.length(); count++) {
            for (int counter = 0; counter < str1.length(); counter++) {
                if (str1.charAt(counter) == str2.charAt(count)){
                    str2 = str2.replace(String.valueOf(str1.charAt(counter)), "");
                    str1 = str1.replace(String.valueOf(str1.charAt(counter)), "");
                    count--;
                    break;
                }
            }
        }

        if (str2.isEmpty()) {
            System.out.println("Anagram found");
        } else {
            System.out.println("Anagram not found");
        }
    }
}
