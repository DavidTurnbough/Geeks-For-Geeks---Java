//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 25, 2019
// Geeks For Geeks: Sum Of Diagonals
// https://practice.geeksforgeeks.org/problems/sum-of-diagonals/0
//******************************************************************************
package sum.of.diagonals;

import java.util.Scanner;

public class SumOfDiagonals
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

            int principalSum = 0;
            int secondarySum = 0;

            for(int i = 0; i < size; ++i)
            {
                principalSum += arr[i][i];
                secondarySum += arr[i][size - 1 - i];
            }
            

            System.out.printf("%d %d%n", principalSum, secondarySum);

        }
    }
}
