//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks : Sum of Series
// https://practice.geeksforgeeks.org/problems/sum-of-series/0
//******************************************************************************
package sum.of.series;

import java.util.Scanner;

public class SumOfSeries
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int inputValue = in.nextInt();
            
            int sum = 0;
            
            for(int i = 0; i <= inputValue; ++i)
            {
                sum += i;
            }
            
            System.out.printf("%d%n", sum);
        }
    }
}