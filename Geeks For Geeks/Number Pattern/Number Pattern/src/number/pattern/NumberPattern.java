//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 11, 2020
// Geeks For Geeks: Number Pattern
// https://practice.geeksforgeeks.org/problems/number-pattern/0
//******************************************************************************
package number.pattern;

import java.util.Scanner;

public class NumberPattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            int currentValue = 1;

            for(int i = 0; i < input; ++i)
            {
                for(int j = 1; j < currentValue; ++j)
                {
                    System.out.printf("%d", j);
                }
                
                for(int j = currentValue; j >= 1; --j)
                {
                    System.out.printf("%d", j);
                }
                
                System.out.printf(" ");
                
                currentValue++;
            }
            
            System.out.printf("%n");
        }
    }
}