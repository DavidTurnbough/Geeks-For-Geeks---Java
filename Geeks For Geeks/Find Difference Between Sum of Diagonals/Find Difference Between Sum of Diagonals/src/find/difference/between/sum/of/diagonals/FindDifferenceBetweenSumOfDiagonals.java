//******************************************************************************
// Name: David Turnbough
// Date: Saturday August 11, 2018
// Geeks for Geeks: Find Difference Between Sum of Diagonals
// https://practice.geeksforgeeks.org/problems/find-difference-between-sum-of-diagonals/0
//******************************************************************************
package find.difference.between.sum.of.diagonals;

import java.util.Scanner;

public class FindDifferenceBetweenSumOfDiagonals
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[][] arr = new int[size][size];

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    arr[i][j] = in.nextInt();
                }
            }
            int firstValue = 0;
            int secondValue = 0;

            for (int i = 0; i < size; ++i)
            {
                firstValue += arr[i][i];
                secondValue += arr[i][size - 1 - i];
            }

            System.out.printf("%d%n", Math.abs(firstValue - secondValue));

        }
    }
}
