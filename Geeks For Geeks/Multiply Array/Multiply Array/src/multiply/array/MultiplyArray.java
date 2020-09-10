//******************************************************************************
// Name: David Turnbough
// Date: January 8, 2018 Monday
// Geeks for Geeks: Multiply Array
// https://practice.geeksforgeeks.org/problems/multiply-array/0
//******************************************************************************
package multiply.array;

import java.util.Scanner;

public class MultiplyArray
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
            
            int total = 1;
            
            for(int i = 0; i < size; ++i)
            {
                total *= arr[i];
            }
            
            System.out.printf("%d%n", total);
        }
    }
}