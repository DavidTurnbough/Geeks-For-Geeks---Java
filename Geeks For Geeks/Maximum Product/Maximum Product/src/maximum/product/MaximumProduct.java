//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks : Maximum Product
// https://practice.geeksforgeeks.org/problems/maximum-product/0
//******************************************************************************
package maximum.product;

import static java.util.Arrays.sort;
import java.math.BigInteger;
import java.util.Scanner;

public class MaximumProduct
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            int subSequenceSize = in.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            sort(arr);

            BigInteger sum = new BigInteger("1");

            for (int i = 0; i < subSequenceSize; ++i)
            {
                sum = sum.multiply(BigInteger.valueOf(arr[(size - 1) - i]));
            }

            System.out.printf("%d%n", sum);

        }
    }
}