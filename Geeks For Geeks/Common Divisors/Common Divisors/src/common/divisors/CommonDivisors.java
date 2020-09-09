//******************************************************************************
// Name: David Turnbough
// Date: Monday May 21, 2018
// Geeks For Geeks: Common Divisors
// https://practice.geeksforgeeks.org/problems/common-divisors/0
//******************************************************************************
package common.divisors;

import java.util.Scanner;

public class CommonDivisors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int value1 = in.nextInt();
            int value2 = in.nextInt();
            
            if(value2 > value1)
            {
                int temp = value1;
                value1 = value2;
                value2 = temp;
            }
            
            int count = 0;
            
            for(int i = 1; i <= value1; ++i)
            {
                if(value1 % i == 0 && value2 % i == 0)
                {
                    count++;
                }
            }
            
            System.out.printf("%d%n", count);
        }
    }
}