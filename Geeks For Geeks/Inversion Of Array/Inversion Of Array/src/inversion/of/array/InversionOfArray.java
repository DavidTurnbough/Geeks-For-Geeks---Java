// Name: David Turnbough
// Date: 
// Geeks For Geeks: Inversion Of Array
// https://practice.geeksforgeeks.org/problems/inversion-of-array/0/?problemStatus=unsolved&problemType=full&difficulty[]=1&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]1page1sortBysubmissions
package inversion.of.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionOfArray
{
    public static int getInversionCount(int[] arr)
    {
        int count = 0;
        
        for(int i = 0; i < arr.length - 1; ++i)
        {
            for(int j = i + 1; j < arr.length; ++j)
            {
                if(arr[i] > arr[j])
                {
                    count++;
                }
            }
        }
        
        return count;
    }
    
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
            
            System.out.printf("%d%n", getInversionCount(arr));
        }
    }
}