//******************************************************************************
// Name: David Turnbough
// Date: Thursday July 5, 2019
// Geeks For Geeks: Rotate Array
// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
//******************************************************************************
package rotate.array;

import java.util.Scanner;

public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            int rotations = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int temp = 0;
            
            for(int i = 0; i < rotations; ++i)
            {
                for(int j = 0; j < size - 1; ++j)
                {
                    if(j == size - 1)
                    {
                        arr[0] = arr[j];
                    }
                    
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                }
            }
        }
    }
}