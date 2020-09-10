//******************************************************************************
// Name: David Turnbough
// Date: Thursday July 5, 2019
// Geeks For Geeks: Smallest Power Of 2 Greater Than Or Equal To N
// https://practice.geeksforgeeks.org/problems/smallest-power-of-2-greater-than-or-equal-to-n/0
//******************************************************************************
package smallest.power.of.pkg2.greater.than.or.equal.to.n;

import java.util.Scanner;

public class SmallestPowerOf2GreaterThanOrEqualToN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            int output = 0;
            
            for(int i = 0; output < input; ++i)
            {
                output = (int)Math.pow(2, i);
            }
            
            System.out.printf("%d%n", output);
        }
    }
}