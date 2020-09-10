//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Minimum Difference Pair
// https://practice.geeksforgeeks.org/problems/minimum-difference-pair/0
//******************************************************************************
package minimum.difference.pair;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MinimumDifferencePair
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
            
            sort(arr);
            
            int minimumDifference = arr[size - 1];
            
            for(int i = 0; i < size - 1; ++i)
            {
                int temp = Math.abs(arr[i] - arr[i+1]);
                if( temp < minimumDifference)
                {
                    minimumDifference = temp;
                }
            }
            
            System.out.printf("%d%n", minimumDifference);
        }
    }
}