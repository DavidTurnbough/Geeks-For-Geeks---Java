//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Number Of Unique Paths
// https://practice.geeksforgeeks.org/problems/number-of-unique-paths/0
//******************************************************************************
package number.of.unique.paths;

import java.util.Scanner;

public class NumberOfUniquePaths
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int rows = in.nextInt();
            int cols = in.nextInt();

            int[][] arr = new int[rows][cols];

            for (int i = 0; i < rows; ++i)
            {
                arr[i][0] = 1;
            }

            for (int i = 0; i < cols; ++i)
            {
                arr[0][i] = 1;
            }

            for (int i = 1; i < rows; ++i)
            {
                for (int j = 1; j < cols; ++j)
                {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }

            System.out.printf("%d%n", arr[rows - 1][cols - 1]);
        }
    }
}
