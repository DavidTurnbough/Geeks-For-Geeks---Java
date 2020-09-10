//******************************************************************************
// Name: David Turnbough
// Date: 
// Geeks For Geeks: Perfect Sum Problem
// https://practice.geeksforgeeks.org/problems/perfect-sum-problem/0
//******************************************************************************
package perfect.sum.problem;

import java.util.Scanner;

public class PerfectSumProblem
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int sum = in.nextInt();
            
            int[][] mem = new int[size][size];
            
            
            System.out.printf("%d%n", recursion(arr, size, mem, 0, 0, sum));
        }
    }
    
    public static int recursion(int[] arr, int size, int[][] mem, int row, int col, int sum)
    {
        if(row >= size || col >= size)
        {
            return 0;
        }
        
        
        mem[row][col] = recursion(arr, size, mem, ++row, col, sum) + recursion(arr, size, mem, row, --col, sum);
        
        return sum;
    }
}