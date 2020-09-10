//******************************************************************************
// Name: David Turnbough
// Date: January 11, 2018 Thursday
// Geeks for Geeks: Nearly Sorted Algorithm
// https://practice.geeksforgeeks.org/problems/nearly-sorted-algorithm/0
//******************************************************************************
package nearly.sorted.algorithm;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class NearlySortedAlgorithm
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int size = sc.nextInt();
            int offset = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
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