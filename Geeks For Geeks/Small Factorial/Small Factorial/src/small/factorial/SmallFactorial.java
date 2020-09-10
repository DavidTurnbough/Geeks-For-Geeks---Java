//******************************************************************************
// Name: David Turnbough
// Date: January 13, 2018 Saturday
// Geeks for Geeks: Small Factorial
// https://practice.geeksforgeeks.org/problems/small-factorial/0/?ref=self
//******************************************************************************
package small.factorial;

import java.util.Scanner;

public class SmallFactorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            long factorialNumber = in.nextLong();
            
            for(long i = (factorialNumber - 1); i >= 1; --i)
            {
                factorialNumber *= i;
            }
            
            System.out.printf("%d%n", factorialNumber);
        }
    }
}