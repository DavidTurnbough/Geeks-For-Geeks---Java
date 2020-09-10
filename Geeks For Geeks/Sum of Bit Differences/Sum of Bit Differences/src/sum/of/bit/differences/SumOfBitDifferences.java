//******************************************************************************
// Name: David Turnbough
// Date: Tuesday August 14, 2018
// Geeks for Geeks: Sum of Bit Differences
// https://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0
//******************************************************************************
package sum.of.bit.differences;

import java.util.Scanner;

public class SumOfBitDifferences
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            int total = 0;

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    int firstValue = arr[i];
                    if (i != j)
                    {
                        int secondValue = arr[j];

                        while (firstValue > 0 || secondValue > 0)
                        {
                            int firstBit = firstValue % 2;
                            int secondBit = secondValue % 2;

                            firstValue = firstValue / 2;
                            secondValue = secondValue / 2;

                            if (firstBit != secondBit)
                            {
                                total++;
                            }
                        }
                    }

                }
            }

            System.out.printf("%d%n", total);
        }
    }
}
