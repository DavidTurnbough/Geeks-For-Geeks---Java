//******************************************************************************
// Name: David Turnbough
// Date: Wednesday February 12, 2020
// Geeks For Geeks: Perfect Number
// https://practice.geeksforgeeks.org/problems/perfect-number/0
//******************************************************************************
package perfect.number;

import java.util.Scanner;

public class PerfectNumber
{
    
    public static int factorial(int input)
    {
        if(input <= 1)
        {
            return 1;
        }
        else
        {
            return (input * factorial(input - 1));
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();
            int tempInput = input;
            
            int factorialSum = 0;
            
            while(tempInput > 0)
            {
                int leastSignificantNumber = tempInput % 10;
                
                factorialSum += factorial(leastSignificantNumber);
                
                tempInput = tempInput / 10;
            }
            
            System.out.printf("%s%n", factorialSum == input ? "Perfect" : "Not Perfect");
        }
    }
}
