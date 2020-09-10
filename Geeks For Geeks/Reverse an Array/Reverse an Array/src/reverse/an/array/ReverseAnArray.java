//******************************************************************************
// Name: David Turnbough
// Date: January 13, 2018 Saturday
// Geeks for Geeks: Reverse an Array
// https://practice.geeksforgeeks.org/problems/reverse-an-array/0
//******************************************************************************
package reverse.an.array;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class ReverseAnArray
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
            
            for(int i = (size - 1); i >= 0; --i)
            {
                System.out.printf("%d ", arr[i]);
            }
            
            System.out.printf("%n");
        }
    }
}