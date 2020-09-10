//******************************************************************************
// Name: David Turnbough
// Date:
// Geeks for Geeks: Rank of Matrix
// https://practice.geeksforgeeks.org/problems/rank-of-matrix/0
//******************************************************************************
package rank.of.matrix;

import java.util.Scanner;

public class RankOfMatrix
{

    final static int SIZE = 3;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

//        int testCases = in.nextInt();
        int testCases = 1;

        while (testCases-- > 0)
        {
//            int[][] arr = new int[SIZE][SIZE];

            int[][] arr =
            {
                {
                    10, 20, 10
                },
                {
                    -20, -30, 10
                },
                {
                    30, 50, 0
                }
            };

//            for (int row = 0; row < SIZE; ++row)
//            {
//                for (int column = 0; column < SIZE; ++column)
//                {
//                    arr[row][column] = in.nextInt();
//                }
//            }

            //find pivot row
            for (int row = 0; row < SIZE; ++row)
            {
                int pivotRow = -1;
                int pivotColumn = -1;

                for (int column = row; column < SIZE && pivotRow == -1; ++column)
                {
                    pivotRow = findPivotRow(arr, column);

                    pivotColumn = findPivotColumn(arr, pivotRow);

                    //swap rows if needed
                    if (pivotRow != row)
                    {
                        swapRows(arr, pivotRow, row);
                        pivotRow = row;
                    }
                }

                //multiply row by scalar to bring pivot value to 1
                int scalarValue = arr[pivotRow][pivotColumn];

                for (int column = 0; column < SIZE; ++column)
                {
                    arr[pivotRow][column] = arr[pivotRow][column] / scalarValue;
                }

                //multiply other rows by needed value in order to bring them to zero
                switch (pivotRow)
                {
                    case 0:
                        for (int column = 0; column < SIZE; ++column)
                        {
                            arr[pivotRow + 1][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow + 1][pivotColumn] - arr[pivotRow + 1][pivotColumn];
                            arr[pivotRow + 2][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow + 2][pivotColumn] - arr[pivotRow + 2][pivotColumn];
                        }
                        break;
                    case 1:
                        for (int column = 0; column < SIZE; ++column)
                        {
                            arr[pivotRow - 1][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow - 1][pivotColumn] - arr[pivotRow - 1][pivotColumn];
                            arr[pivotRow + 1][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow + 1][pivotColumn] - arr[pivotRow + 1][pivotColumn];
                        }
                        break;
                    default:
                        for (int column = 0; column < SIZE; ++column)
                        {
                            arr[pivotRow - 1][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow - 1][pivotColumn] - arr[pivotRow - 1][pivotColumn];
                            arr[pivotRow - 2][pivotColumn] = arr[pivotRow][pivotColumn] * arr[pivotRow - 2][pivotColumn] - arr[pivotRow - 2][pivotColumn];
                        }
                        break;
                }
                
                print(arr);
            }

            // get matrix rank
            System.out.printf("%d%n", getRank(arr));

        }
    }

    public static void swapRows(int[][] arr, int firstRow, int secondRow)
    {
        for (int row = 0; row < SIZE; ++row)
        {
            int temp = arr[firstRow][row];
            arr[firstRow][row] = arr[secondRow][row];
            arr[secondRow][row] = temp;
        }
    }

    public static int findPivotRow(int[][] arr, int column)
    {
        int pivot = -1;

        for (int row = 0; row < SIZE; ++row)
        {
            if (arr[row][column] != 0)
            {
                pivot = row;
            }
        }

        return pivot;
    }

    public static int findPivotColumn(int[][] arr, int row)
    {
        int pivot = -1;

        for (int column = 0; column < SIZE; ++column)
        {
            if (arr[row][column] != 0)
            {
                return column;
            }
        }

        return pivot;
    }

    public static int getRank(int[][] arr)
    {
        int rank = 0;

        for (int row = 0; row < SIZE; ++row)
        {
            for (int column = row; column < SIZE; ++column)
            {
                if (arr[row][column] == 1)
                {
                    rank++;
                }
            }
        }

        return rank;
    }

    public static void print(int[][] arr)
    {
        for (int row = 0; row < SIZE; ++row)
        {
            for (int column = 0; column < SIZE; ++column)
            {
                System.out.printf("%d ", arr[row][column]);
            }
            System.out.printf("%n");
        }
    }
}
