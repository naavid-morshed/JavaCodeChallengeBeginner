package h.product_maximizer;
import java.util.Scanner;
public class ProductMaximizer {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int maxOfArr1 = 0;
        int maxOfArr2 = 0;


        System.out.print("First Array size? ");
        maxOfArr1 = initializeArrAndGetMax(stdIn, maxOfArr1);

        System.out.print("Second Array size? ");
        maxOfArr2 = initializeArrAndGetMax(stdIn, maxOfArr2);

        System.out.println("Result : " + maxOfArr1 + " X " + maxOfArr2 + " = " + maxOfArr1*maxOfArr2);
    }

    private static int initializeArrAndGetMax(Scanner stdIn, int maxOfArr1) {
        int[] numArr = new int[stdIn.nextInt()];

        for (int count = 0; count < numArr.length; count++) {

            System.out.print("Element " + (count + 1) + " : ");
            numArr[count] = stdIn.nextInt();

            if (count == 0) maxOfArr1 = numArr[count];

            if (maxOfArr1 < numArr[count]) maxOfArr1 = numArr[count];
        }
        System.out.println();
        return maxOfArr1;
    }
}
