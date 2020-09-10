//******************************************************************************
// Name: David Turnbough
// Date: Sunday May 20, 2018
// Geeks for Geeks: Largest Number Formed From an Array
// https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0/
//******************************************************************************
package largest.number.formed.from.an.array;

import java.util.Scanner;
import java.util.Arrays;

public class LargestNumberFormedFromAnArray
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
            
            Arrays.sort(arr);
            
            String output = "";
            
            for(int i = size - 1; i > 0; i--)
            {
                output += arr[i];
            }
            
            System.out.printf("%s%n", output);
        }
    }
}