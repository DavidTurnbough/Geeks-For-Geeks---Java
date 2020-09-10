//******************************************************************************
// Name: David Turnbough
// Date: January 12, 2018 Friday
// Geeks for Geeks: Minimum Sum of Two Elements From Two Arrays
// https://practice.geeksforgeeks.org/problems/minimum-sum-of-two-elements-from-two-arrays/0
//******************************************************************************
package minimum.sum.of.two.elements.from.two.arrays;

import java.util.Scanner;

public class MinimumSumOfTwoElementsFromTwoArrays
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int size = sc.nextInt();
            
            int[] foo = new int[size];
            int[] bar = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                foo[i] = sc.nextInt();
            }
            
            for(int i = 0; i < size; ++i)
            {
                bar[i] = sc.nextInt();
            }
            
            int minimumSum = 9999;
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = 0; j < size; ++j)
                {
                    int temp = (foo[i] + bar[j]);
                    
                    if(i != j && temp < minimumSum)
                    {
                        minimumSum = temp;
                    }
                }
            }
            
            System.out.printf("%d%n", minimumSum);
        }
    }
}