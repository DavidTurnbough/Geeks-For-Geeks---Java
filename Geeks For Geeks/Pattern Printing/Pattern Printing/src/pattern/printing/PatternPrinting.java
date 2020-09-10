//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 10, 2018
// Geeks for Geeks - Pattern Printing
// https://practice.geeksforgeeks.org/problems/pattern-printing/0
//******************************************************************************
package pattern.printing;

import java.util.Scanner;

public class PatternPrinting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int value = in.nextInt();
            
            for(int i = 1; i <= value; ++i)
            {
                for(int j = 0; j < i; ++j)
                {
                    System.out.printf("*");
                }
                System.out.printf(" ");
            }
            System.out.printf("%n");
        }
    }
}