//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: Reverse Digit
// https://practice.geeksforgeeks.org/problems/reverse-digit/0
//******************************************************************************
package reverse.digit;

import java.util.Scanner;

public class ReverseDigit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            int output = 0;
            
            while(input > 0)
            {
                output *= 10;
                output += input % 10;
                input = input / 10;
            }
            
            System.out.printf("%d%n", output);
        }
    }
}