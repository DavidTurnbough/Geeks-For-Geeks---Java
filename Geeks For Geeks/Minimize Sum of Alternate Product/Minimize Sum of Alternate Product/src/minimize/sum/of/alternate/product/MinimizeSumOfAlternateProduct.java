//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks : Minimize sum of alternate product
// https://practice.geeksforgeeks.org/problems/minimize-sum-of-alternate-product/0
//******************************************************************************
package minimize.sum.of.alternate.product;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MinimizeSumOfAlternateProduct
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
            
            int sum = 0;
            
            for(int i = 0; i < (size / 2); ++i)
            {
                sum += arr[i] * arr[(size - 1) - i];
            }
            
            System.out.printf("%d%n", sum);
            
        }
    }
}