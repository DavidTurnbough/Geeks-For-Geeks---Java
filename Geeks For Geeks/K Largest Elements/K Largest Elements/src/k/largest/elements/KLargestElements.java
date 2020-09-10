//******************************************************************************
// Name: David Turnbough
// Date: January 15, 2018 Monday
// Geeks for Geeks: K Largest Elements
// https://practice.geeksforgeeks.org/problems/k-largest-elements/0
//******************************************************************************
package k.largest.elements;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class KLargestElements
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            int elementsToPrint = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            sort(arr);
            
            for(int i = 0; i < elementsToPrint; ++i)
            {
                System.out.printf("%d ", arr[(size - 1) - i]);
            }
            
            System.out.printf("%n");
        }
    }
}
