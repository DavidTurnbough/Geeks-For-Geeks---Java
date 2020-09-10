//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 24, 2018
// Geeks For Geeks: Sum Of Query I
// https://practice.geeksforgeeks.org/problems/sum-of-query-i/0
//******************************************************************************
package sum.of.query.i;

import java.util.Scanner;

public class SumOfQueryI
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            long[] arr = new long[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            int numberOfQueries = in.nextInt();
            numberOfQueries *= 2;

            int[] queries = new int[numberOfQueries];

            for (int i = 0; i < numberOfQueries; ++i)
            {
                queries[i] = in.nextInt();
            }

            for (int i = 0; i < numberOfQueries - 1; i += 2)
            {
                int left = queries[i];
                int right = queries[i + 1];
                int total = 0;
                
                while(left <= right)
                {
                    total += (left - queries[i] + 1) * (left - queries[i] + 1) * arr[left - 1];
                    left++;
                }

                System.out.printf("%d ", total);
            }

            System.out.printf("%n");
        }
    }
}
