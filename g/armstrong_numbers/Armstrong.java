package g.armstrong_numbers;

import java.util.ArrayList;
import java.util.Collections;

public class Armstrong {
    public static void main(String[] args) {
        int num = 8208;
        int total = num;
        int numCount = 0;

        ArrayList<Integer> numArr = new ArrayList<>();

        // add nums to array while counting length of number
        while (num != 0) {
            numArr.add(num % 10);
            num /= 10;
            numCount++;
        }

        Collections.reverse(numArr);

        for (int n : numArr) {
            num += (int)Math.pow(n,numCount);
        }

        if (num == total) System.out.println(num + " is an armstrong number.");
        else System.out.println(num + " is not an armstrong number.");
    }
}
