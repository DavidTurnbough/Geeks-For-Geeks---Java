//******************************************************************************
// Name: David Turnbough
// Date: Friday October 25, 2019
// Geeks For Geeks: Multiply Two Polynomials
// https://practice.geeksforgeeks.org/problems/multiply-two-polynomals/0
//******************************************************************************
package multiply.two.polynomials;

import java.util.Scanner;

public class MultiplyTwoPolynomials
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size1 = in.nextInt();
            int size2 = in.nextInt();
            
            int[] arr1 = new int[size1];
            
            for(int i = 0; i < size1; ++i)
            {
                arr1[i] = in.nextInt();
            }
            
            int[] arr2 = new int[size2];
            
            for(int i = 0; i < size2; ++i)
            {
                arr2[i] = in.nextInt();
            }
            
            int size3 = size1 + size2 - 1;
            
            int[] arr3 = new int[size3];
            
            
            for(int i = 0; i < size1; ++i)
            {
                for(int j = 0; j < size2; ++j)
                {
                    arr3[i + j] = arr1[i] * arr2[j] + arr3[i + j];
                }
            }
            
            for(int i = 0; i < size3; ++i)
            {
                System.out.printf("%d ", arr3[i]);
            }
            
            System.out.printf("%n");
        }
    }
}