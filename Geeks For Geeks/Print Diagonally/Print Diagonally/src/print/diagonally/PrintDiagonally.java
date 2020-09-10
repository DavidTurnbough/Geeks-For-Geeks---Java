//******************************************************************************
// Name: David Turnbough
// Date: Sunday May 20, 2018
// Geeks for Geeks: Print Diagonally
// https://practice.geeksforgeeks.org/problems/print-diagonally/0
//******************************************************************************
package print.diagonally;

import java.util.Scanner;

public class PrintDiagonally
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
            int col = 0;

            while (col < size && row < size)
            {
                int c = col;
                int r = row;

                while (c >= 0 && r < size)
                {
                    System.out.printf("%d ", arr[r++][c--]);
                }

                if (col < size - 1)
                {
                    col++;
                    row = 0;
                }
                else
                {
                    row++;
                }
            }

            System.out.printf("%n");
        }
    }
}
