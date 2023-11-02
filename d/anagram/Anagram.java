package d.anagram;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "binary";
        String str2 = "brainy";

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
