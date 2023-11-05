package j.prime_factorization;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Take a number : ");
        int num = stdIn.nextInt();

        ArrayList<Integer> primeFactorArr = new ArrayList<>();

        for (int count = 1; count <= num; count++) {
            if (num % count == 0) primeFactorArr.add(count);
        }

        for (int primeFactors : primeFactorArr) {
            if (primeFactors != primeFactorArr.get(primeFactorArr.size() - 1)) System.out.print(primeFactors + ", ");
            else System.out.print(primeFactors + ".");
        }
    }
}
