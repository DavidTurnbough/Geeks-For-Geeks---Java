//******************************************************************************
// Name: David Turnbough
// Date: January 13, 2018 Saturday
// Geeks for Geeks: Sum of Digits
// https://practice.geeksforgeeks.org/problems/sum-of-digits/0
//******************************************************************************
package sum.of.digits;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int value = in.nextInt();
            
            int total = 0;
            
            while(value > 0)
            {
                total += value % 10;
                value = value / 10;
            }
            
            System.out.printf("%d%n", total);
        }
    }
}