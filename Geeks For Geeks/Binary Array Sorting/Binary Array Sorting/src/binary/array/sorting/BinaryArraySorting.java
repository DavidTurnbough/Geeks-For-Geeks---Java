//******************************************************************************
// Name: David Turnbough
// Date: January 8, 2018 Monday
// Geeks for Geeks: Binary Array Sorting
// https://practice.geeksforgeeks.org/problems/binary-array-sorting/0
//******************************************************************************
package binary.array.sorting;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class BinaryArraySorting
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
            
            for(int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", arr[i]);
            }
            
            System.out.printf("%n");
        }
        
    }
}