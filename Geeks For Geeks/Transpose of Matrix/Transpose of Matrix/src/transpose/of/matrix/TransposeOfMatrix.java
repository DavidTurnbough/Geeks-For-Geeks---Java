//******************************************************************************
// Name: David Turnbough
// Date: Friday May 18, 2018
// Geeks for Geeks: Transpose of Matrix
// https://practice.geeksforgeeks.org/problems/transpose-of-matrix/0
//******************************************************************************
package transpose.of.matrix;

import java.util.Scanner;

public class TransposeOfMatrix
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

            int row = 0;
            int column = 0;

            while (column < size)
            {
                row = column;
                while (row < size)
                {
                    int temp = arr[row][column];
                    arr[row][column] = arr[column][row];
                    arr[column][row] = temp;
                    row++;
                }
                column++;
            }

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    System.out.printf("%d ", arr[i][j]);
                }
            }

            System.out.printf("%n");
        }
    }
}
