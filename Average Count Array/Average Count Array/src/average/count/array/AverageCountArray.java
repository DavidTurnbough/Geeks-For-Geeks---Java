//******************************************************************************
// Name: David Turnbough
// Date: Monday May 21, 2018
// Geeks For Geeks: Average Count Array
// https://practice.geeksforgeeks.org/problems/average-count-array/0
//******************************************************************************
package average.count.array;

import java.util.Scanner;

public class AverageCountArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int value = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int[] output = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                int avg = (arr[i] + value) / 2;
                
                for(int j = 0; j < size; ++j)
                {
                    if(arr[j] == avg)
                    {
                        output[i]++;
                    }
                }
            }
            
            for(int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", output[i]);
            }
            
            System.out.printf("%n");
        }
    }
}