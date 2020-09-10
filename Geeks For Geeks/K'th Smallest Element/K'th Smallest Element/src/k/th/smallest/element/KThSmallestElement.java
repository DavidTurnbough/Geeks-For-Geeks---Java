//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: K'th Smallest Element
// https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
//******************************************************************************
package k.th.smallest.element;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class KThSmallestElement
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
            
            int position = in.nextInt();
            
            sort(arr);
            
            System.out.printf("%d%n", arr[position - 1]);
        }
    }
}