//******************************************************************************
// Name: David Turnbough
// Date: Friday May 18, 2018
// Geeks for Geeks: Print Elements of Array
// https://practice.geeksforgeeks.org/problems/print-elements-of-array/0/
//******************************************************************************
package print.elements.of.array;

import java.util.Scanner;

public class PrintElementsOfArray
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
            
            for(int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", arr[i]);
            }
            
            System.out.printf("%n");
        }
    }
}