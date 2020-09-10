//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Sum Of Query II
// https://practice.geeksforgeeks.org/problems/sum-of-query-ii/0
//******************************************************************************
package sum.of.query.ii;

import java.util.Scanner;

public class SumOfQueryII
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
            
            int querySize = in.nextInt();
            
            querySize *= 2;
            
            int[] queries = new int[querySize];
            
            for(int i = 0; i < querySize; ++i)
            {
                queries[i] = in.nextInt();
            }

            for(int i = 0; i < querySize; i += 2)
            {
                int start = queries[i] - 1;
                int end = queries[i + 1] - 1;
                int sum = 0;
                
                while(start <= end)
                {
                    sum += arr[start];
                    start++;
                }
                
                System.out.printf("%d ", sum);
            }
            
            System.out.printf("%n");
        }
    }
}