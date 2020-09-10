//******************************************************************************
// Name: David Turnbough
// Date: Sunday May 13, 2018
// Geeks for Geeks: Missing Number
// https://practice.geeksforgeeks.org/problems/missing-number/0
//******************************************************************************
package missing.number;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MissingNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt() - 1;
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            sort(arr);
            
            int missingNumber = -1;
            
            for(int i = 0; i < size - 1 && missingNumber < 0; ++i)
            {
                if(arr[i+1] - arr[i] != 1)
                {
                    missingNumber = arr[i] + 1;
                }
            }
            
            if(missingNumber == -1)
            {
                if(arr[size-1] == size + 1)
                {
                    missingNumber = arr[size-1] - size;
                }
                else
                {
                    missingNumber = size + 1;
                }
            }
            
            System.out.printf("%d%n", missingNumber);
        }
    }
}