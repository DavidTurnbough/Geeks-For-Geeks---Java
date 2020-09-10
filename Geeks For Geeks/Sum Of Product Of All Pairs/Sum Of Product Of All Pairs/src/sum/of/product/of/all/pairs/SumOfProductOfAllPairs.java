//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Sum Of Product Of All Pairs
// https://practice.geeksforgeeks.org/problems/sum-of-product-of-all-pairs/0
//******************************************************************************
package sum.of.product.of.all.pairs;

import java.util.Scanner;

public class SumOfProductOfAllPairs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            int arr[] = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int total = 0;
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = i + 1; j < size; ++j)
                {
                    total += arr[i] * arr[j];
                }
            }
            
            System.out.printf("%d%n", total);
        }
    }
}