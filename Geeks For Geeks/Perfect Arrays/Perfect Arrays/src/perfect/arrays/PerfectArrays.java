//******************************************************************************
// Name: David Turnbough
// Date: Monday June 17, 2019
// Geeks For Geeks: Perfect Arrays
// https://practice.geeksforgeeks.org/problems/perfect-arrays/0         
//******************************************************************************
package perfect.arrays;

import java.util.Scanner;

public class PerfectArrays
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
            
            int[] revArr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                revArr[i] = arr[size - 1 - i];
            }
            
            boolean isPerfect = true;
            
            for(int i = 0; i < size && isPerfect; ++i)
            {
                if(revArr[i] != arr[i])
                {
                    isPerfect = false;
                }
            }
            
            System.out.printf("%s%n", isPerfect ? "PERFECT" : "NOT PERFECT");
        }
    }
}