//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks : Sum of Elements K1'th and K2'th Smallest Elements
// https://practice.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements/0
//******************************************************************************
package sum.of.elements.between.k1.th.and.k2.th.smallest.elements;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class SumOfElementsBetweenK1ThAndK2ThSmallestElements
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
            
            int firstValue = in.nextInt();
            int secondValue = in.nextInt() - 1;
            
            int sum = 0;
            
            for(; (firstValue) < (secondValue); ++firstValue)
            {
                sum += arr[firstValue];
            }
            
            System.out.printf("%d%n", sum);
            
        }
    }
}
