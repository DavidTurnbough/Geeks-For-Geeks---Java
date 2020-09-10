//******************************************************************************
// Name: David Turnbough
// Date: Monday February 10, 2020
// Geeks For Geeks: NPR
// https://practice.geeksforgeeks.org/problems/npr/0
//******************************************************************************
package npr;

import java.util.Scanner;

public class NPR
{
    public static long factorial(int numerator, int denominator)
    {
        if(numerator == denominator)
        {
            return 1;
        }
        else
        {
            return (numerator * factorial(numerator - 1, denominator));
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int n = in.nextInt();
            int r = in.nextInt();
            
            long permetation = factorial(n, n - r);
            
            System.out.println(permetation);
        }
    }
}