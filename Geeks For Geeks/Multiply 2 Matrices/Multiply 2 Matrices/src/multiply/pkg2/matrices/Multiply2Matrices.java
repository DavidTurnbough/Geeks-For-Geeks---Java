//******************************************************************************
// Name: David Turnbough
// Date: Monday December 31, 2018
// Geeks for Geeks: Multiply 2 Matrices
// https://practice.geeksforgeeks.org/problems/multiply-2-matrices/0
//******************************************************************************
package multiply.pkg2.matrices;

import java.util.Scanner;
public class Multiply2Matrices
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {

            int size = 3;
            int[][] firstMatrix = new int[size][size];
            int[][] secondMatrix = new int[size][size];
            int[][] outputMatrix = new int[size][size];


            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    firstMatrix[i][j] = in.nextInt();
                    outputMatrix[i][j] = 0;
                }
            }

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    secondMatrix[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    for (int k = 0; k < size; ++k)
                    {
                        outputMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                        
                    }
                }
            }

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    System.out.printf("%d ", outputMatrix[i][j]);
                }
                System.out.printf("%n");
            }
        }
    }
}
