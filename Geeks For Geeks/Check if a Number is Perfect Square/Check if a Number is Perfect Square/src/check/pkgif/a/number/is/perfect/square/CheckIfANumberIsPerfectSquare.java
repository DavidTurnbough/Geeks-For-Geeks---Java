//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 8, 2018
// Geeks for Geeks - Check if a Number is Perfect Square
// https://practice.geeksforgeeks.org/problems/check-if-a-number-is-perfect-square/0
//******************************************************************************
package check.pkgif.a.number.is.perfect.square;

import java.util.Scanner;

public class CheckIfANumberIsPerfectSquare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            boolean perfectSquare = false;
            int input = in.nextInt();

            for(int i = 0; i <= input && !perfectSquare; ++i)
            {
                if(i * i == input)
                {
                    System.out.printf("%d%n", 1);
                    perfectSquare = true;
                }
            }

            if(!perfectSquare)
            {
                System.out.printf("%d%n", 0);
            }
        }
    }
}