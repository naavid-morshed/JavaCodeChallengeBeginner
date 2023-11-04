package f.number_reversal;

public class NumReversal {
    public static void main(String[] args) {
        int num = 123451234;
        System.out.println("Your number : " + num);

        int reversedNum = 0;
        int temp = num;
        int counter = -1;

        while (temp != 0) {
            temp = temp / 10;
            counter++;
        }

        for (int count = (int) Math.pow(10.00, counter); num != 0; count /= 10) {
            reversedNum += (num % 10) * count;
            num = num / 10;
        }

        num = reversedNum;

        System.out.println("After inversion : " + num);
    }
}
