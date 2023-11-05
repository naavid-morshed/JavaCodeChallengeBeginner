package i.prime_number_checker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Length of your array? ");
        int[] numArr = IntStream.range(1, stdIn.nextInt() + 1).toArray();

        ArrayList<Integer> primeArr = new ArrayList<>();

        for (int possiblePrime : numArr) {
            boolean checker = true;
            for (int count = 2; count < possiblePrime; count++) {
                if (possiblePrime % count == 0) {
                    checker = false;
                    break;
                }
            }

            if (checker) {
                primeArr.add(possiblePrime);
            }
        }

        for (int primeNumbers : primeArr) {
            if (primeNumbers != primeArr.get(primeArr.size() - 1)) System.out.print(primeNumbers + ", ");
            else System.out.print(primeNumbers + ".");
        }
    }
}
