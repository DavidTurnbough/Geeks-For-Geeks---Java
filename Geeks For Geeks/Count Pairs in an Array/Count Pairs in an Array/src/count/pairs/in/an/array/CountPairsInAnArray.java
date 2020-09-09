//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Count Pairs in an Array
// https://practice.geeksforgeeks.org/problems/count-pairs-in-an-array/0
//******************************************************************************
package count.pairs.in.an.array;

import java.util.Scanner;

public class CountPairsInAnArray
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
            
            int count = 0;
            
            for(int i = 0; i < size-1; ++i)
            {
                for(int j = i; j < size; ++j)
                {
                    if(i * arr[i] > j * arr[j])
                    {
                        count++;
                    }
                }
            }
            
            System.out.printf("%d%n", count);
            
        }
    }
}