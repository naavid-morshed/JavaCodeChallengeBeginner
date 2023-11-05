package h.product_maximizer;
import java.util.Scanner;
public class ProductMaximizer {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        System.out.print("First Array size? ");
        int maxOfArr1 = initializeArrAndGetMax(stdIn, 0);

        System.out.print("Second Array size? ");
        int maxOfArr2 = initializeArrAndGetMax(stdIn, 0);

        System.out.println("Result : " + maxOfArr1 + " X " + maxOfArr2 + " = " + maxOfArr1*maxOfArr2);
    }

    private static int initializeArrAndGetMax(Scanner stdIn, int maxOfArr) {
        int[] numArr = new int[stdIn.nextInt()];

        for (int count = 0; count < numArr.length; count++) {
            System.out.print("Element " + (count + 1) + " : ");
            numArr[count] = stdIn.nextInt();

            if (count == 0) maxOfArr = numArr[count];

            if (maxOfArr < numArr[count]) maxOfArr = numArr[count];
        }
        System.out.println();
        return maxOfArr;
    }
}
