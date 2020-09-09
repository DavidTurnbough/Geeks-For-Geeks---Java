//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Addition Of Submatrix
// https://practice.geeksforgeeks.org/problems/addition-of-submatrix/0
//******************************************************************************
package addition.of.submatrix;

import java.util.Scanner;

public class AdditionOfSubmatrix
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int rows = in.nextInt();
            int columns = in.nextInt();
            
            int[][] matrix = new int[rows][columns];
            
            for(int i = 0; i < rows; ++i)
            {
                for(int j = 0; j < columns; ++j)
                {
                    matrix[i][j] = in.nextInt();
                }
            }
            
            int x1 = in.nextInt() - 1;
            int y1 = in.nextInt() - 1;
            int x2 = in.nextInt() - 1;
            int y2 = in.nextInt() - 1;
            
            int total = 0;
            
            for(int i = x1; i <= x2; ++i)
            {
                for(int j = y1; j <= y2; ++j)
                {
                    total += matrix[i][j];
                }
            }
            
            System.out.printf("%d%n", total);
        }
    }
}