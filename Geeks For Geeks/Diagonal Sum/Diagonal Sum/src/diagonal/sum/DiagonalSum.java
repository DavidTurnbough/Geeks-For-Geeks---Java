//******************************************************************************
// Name: David Turnbough
// Date: Saturday June 8, 2019
// Geeks For Geeks: Diagonal Sum
// https://practice.geeksforgeeks.org/problems/diagonal-sum/0
//******************************************************************************
package diagonal.sum;

import java.util.Scanner;

public class DiagonalSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[][] arr = new int[size][size];
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = 0; j < size; ++j)
                {
                    arr[i][j] = in.nextInt();
                }
            }
            
            int total = 0;
            
            int index = 0;
            
            while(index < size)
            {
                total += arr[index][index] + arr[index][size - 1 - index];
                index++;
            }
            
            System.out.printf("%d%n", total);
        }
    }
}