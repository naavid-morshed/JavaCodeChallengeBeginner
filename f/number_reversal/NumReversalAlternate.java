package f.number_reversal;

public class NumReversalAlternate {
    public static void main(String[] args) {
        int num = 123451234;
        System.out.println("Your Number : " + num);

        num = Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(num)).reverse()));

        System.out.println("After inversion : " + num);
    }
}
