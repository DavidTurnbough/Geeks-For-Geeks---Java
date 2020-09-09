//******************************************************************************
// Name: David Turnbough
// Date: Monday May 21, 2018
// Geeks For Geeks: Balanced Array
// https://practice.geeksforgeeks.org/problems/balanced-array/0
//******************************************************************************
package balanced.array;

import java.util.Scanner;

public class BalancedArray
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
            
            int leftSum = 0;
            int rightSum = 0;
            
            for(int i = 0; i < size / 2; ++i)
            {
                leftSum += arr[i];
            }
            
            for(int i = size / 2; i < size; ++i)
            {
                rightSum += arr[i];
            }
            
            System.out.printf("%d%n", Math.abs(leftSum - rightSum));
        }
    }
}