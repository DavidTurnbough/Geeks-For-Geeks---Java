//******************************************************************************
// Name: David Turnbough
// Date: Sunday May 6, 2018
// Geeks for Geeks: Fibonacci to N
// https://practice.geeksforgeeks.org/problems/fibonacci-to-n/0
//******************************************************************************
package fibonacci.to.n;

import java.util.Scanner;

public class FibonacciToN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int fibonacciValue = in.nextInt();
            int currentValue = 0;
            int previousValue = 1;
            int tempValue = 0;
            
            while(currentValue <= fibonacciValue)
            {
                System.out.printf("%d ", currentValue);
                tempValue = currentValue;
                currentValue = currentValue + previousValue;
                previousValue = tempValue;
            }
            System.out.printf("%n");
        }
    }
}