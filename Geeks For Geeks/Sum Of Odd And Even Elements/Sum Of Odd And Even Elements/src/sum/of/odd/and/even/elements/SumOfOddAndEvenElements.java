//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geeks For Geeks: Sum Of Odd And Even Elements
// https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements/0
//******************************************************************************
package sum.of.odd.and.even.elements;

import java.util.Scanner;

public class SumOfOddAndEvenElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int inputValue = in.nextInt();
            
            long evenSum = 0;
            long oddSum = 0;
            
            for(int i = 1; i <= inputValue; ++i)
            {
                if(i % 2 == 1)
                {
                    oddSum += i;
                }
                else
                {
                    evenSum += i;
                }
            }
            
            System.out.printf("%d %d%n", oddSum, evenSum);
            
        }
    }
}