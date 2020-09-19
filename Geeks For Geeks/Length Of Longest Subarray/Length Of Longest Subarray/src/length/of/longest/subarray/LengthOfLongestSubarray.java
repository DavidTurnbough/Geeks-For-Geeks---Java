//******************************************************************************
// Name: David Turnbough
// Date: Friday September 18, 2020
// Geeks For Geeks: Length Of Longest Subarray
// https://practice.geeksforgeeks.org/problems/length-of-longest-subarray/0
//******************************************************************************
package length.of.longest.subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfLongestSubarray
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String[] input = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            int longestSubarray = 0;
            int currentCount = 0;
            
            for(int i = 0; i < size; ++i)
            {
                if(arr[i] < 0)
                {
                    currentCount = 0;
                }
                else
                {
                    currentCount++;
                }
                
                if(currentCount > longestSubarray)
                {
                    longestSubarray = currentCount;
                }
            }
            
            System.out.printf("%d%n", longestSubarray);
            
        }
    }
}