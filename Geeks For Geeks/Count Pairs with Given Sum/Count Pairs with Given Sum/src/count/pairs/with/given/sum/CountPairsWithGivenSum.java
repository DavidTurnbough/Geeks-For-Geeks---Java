//******************************************************************************
// Name: David Turnbough
// Date: January 11, 2018 Thursday
// Geeks for Geeks: Count Pairs with Given Sum
// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum/0
//******************************************************************************
package count.pairs.with.given.sum;

import java.util.Scanner;

public class CountPairsWithGivenSum
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0)
        {
            int size = sc.nextInt();
            int sum = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for (int i = 0; i < size - 1; ++i)
            {
                for (int j = i + 1; j < size; ++j)
                {
                    int temp = arr[i] + arr[j];

                    if (temp == sum)
                    {
                        count++;
                    }
                }
            }

            System.out.printf("%d%n", count);
        }
    }
}
