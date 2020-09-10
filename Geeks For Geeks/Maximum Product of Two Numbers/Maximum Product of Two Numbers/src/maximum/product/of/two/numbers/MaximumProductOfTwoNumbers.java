//******************************************************************************
// Name: David Turnbough
// Date: January 7, 2018 Sunday
// Geeks for Geeks : Maximum Product of Two Numbers
// https://practice.geeksforgeeks.org/problems/maximum-product-of-two-numbers/0
//******************************************************************************
package maximum.product.of.two.numbers;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MaximumProductOfTwoNumbers
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
            
            System.out.printf("%d%n", (arr[size-1] * arr[size-2]));
        }
    }
}