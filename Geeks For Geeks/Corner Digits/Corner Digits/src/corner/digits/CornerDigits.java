//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: Cornder Digits
// https://practice.geeksforgeeks.org/problems/corner-digits/0
//******************************************************************************
package corner.digits;

import java.util.Scanner;

public class CornerDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            int firstDigit = input;
            int lastDigit = input % 10;
            
            while(input > 0)
            {
                firstDigit = input % 10;
                input /= 10;
            }
            
            System.out.printf("%d %d%n", firstDigit, lastDigit);
        }
    }
}