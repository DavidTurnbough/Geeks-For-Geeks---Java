//******************************************************************************
// Name: David Turnbough
// Date: January 8, 2018 Monday
// Geeks for Geeks: Find Minimum and Maximum Element in an Array
// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array/0
//******************************************************************************
package find.minimum.and.maximum.element.in.an.array;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class FindMinimumAndMaximumElementInAnArray
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
            
            System.out.printf("%d %d%n", arr[0], arr[size-1]);
        }
    }
}