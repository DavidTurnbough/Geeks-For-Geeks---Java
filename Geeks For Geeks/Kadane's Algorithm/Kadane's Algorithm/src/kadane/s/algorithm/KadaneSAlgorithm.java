// Name: David Turnbough
// Date: Sunday September 20, 2020
// Geeks For Geeks: Kadane's Algorithm
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
package kadane.s.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaneSAlgorithm
{
    
    // Helper method used to determine the sum
    public static int getMaxSum(int size, int[] arr)
    {
        // initialize the return value with the first value from the array as
        //  the maximum subarray sum.
        int answer = arr[0];
        
        // Array used to keep a running total of the subarray
        int[] dp = new int[size];
        
        // Initial value for the subarray running total
        dp[0] = arr[0];
        
        for(int i = 1; i < size; ++i)
        {
            // determine if the current element should be added to the running
            //  sum of subarray totals, or if the current element will be greater
            //  by itself. That is, if the current element should start a new
            //  subarray starting from the current position.
            dp[i] = Math.max(dp[i - 1], 0) + arr[i];
            
            // determine if the previous subarray sum is greater than the currently
            //  generated subarray sum.
            answer = Math.max(answer, dp[i]);
        }
        
        // Return the maximum subarray sum
        return answer;
    }
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            // Get the input and convert the array into an array of integers
            int size = Integer.parseInt(in.readLine());
            
            String[] input = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            // Call on method to determine the max sum, and output
            System.out.printf("%d%n", getMaxSum(size, arr));
        }
    }
}