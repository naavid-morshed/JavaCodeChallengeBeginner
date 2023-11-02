package f.number_reversal;

public class NumReversal {
    public static void main(String[] args) {
        int num = 123451234;

//        StringBuilder numStr = new StringBuilder(String.valueOf(num));
//        numStr.reverse();
//        System.out.println(numStr);

        int reversedNum = 0;
        int temp = num;
        int counter = -1;

        while (temp != 0){
            temp = temp / 10;
            counter++;
        }

        for (int count = (int)Math.pow(10.00, counter);; count/=10) {
            if (num == 0) break;

            reversedNum += (num % 10) * count;
            num = num / 10;
        }

        System.out.println(reversedNum);
    }
}
