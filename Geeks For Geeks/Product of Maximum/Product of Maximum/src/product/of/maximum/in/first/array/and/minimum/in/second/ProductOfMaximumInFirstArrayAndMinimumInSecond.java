//******************************************************************************
// Name: David Turnbough
// Date: Monday May 15, 2018
// Geeks for Geeks: Product of Maximum in First Array and Minimum in Second
// https://practice.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second/0
//******************************************************************************
package product.of.maximum.in.first.array.and.minimum.in.second;

import java.util.Scanner;
import java.util.Arrays;

public class ProductOfMaximumInFirstArrayAndMinimumInSecond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size1 = in.nextInt();
            int[] arr1 = new int[size1];
            
            for(int i = 0; i < size1; ++i)
            {
                arr1[i] = in.nextInt();
            }
            
            Arrays.sort(arr1);
            
            int size2 = in.nextInt();
            int[] arr2 = new int[size2];
            
            for(int i = 0; i < size2; ++i)
            {
                arr2[i] = in.nextInt();
            }
            
            Arrays.sort(arr2);
            
            System.out.printf("%d%n", arr1[size1 - 1] * arr2[0]);
        }
    }
}