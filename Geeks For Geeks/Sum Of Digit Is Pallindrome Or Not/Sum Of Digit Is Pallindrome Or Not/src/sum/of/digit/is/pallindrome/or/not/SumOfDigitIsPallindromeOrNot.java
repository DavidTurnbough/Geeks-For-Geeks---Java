//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 23, 2019
// Geeks For Geeks: Sum Of Digit Is Pallindrome Or Not
// https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not/0
//******************************************************************************
package sum.of.digit.is.pallindrome.or.not;

import java.util.Scanner;

public class SumOfDigitIsPallindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int value = in.nextInt();
            
            int total = 0;
            
            while(value > 0)
            {
                total += (value % 10);
                value /= 10;
            }
            
            String sum = Integer.toString(total);
            
            boolean isPallindrome = true;
            
            for(int i = 0; (i < sum.length() / 2) && isPallindrome; ++i)
            {
                if(sum.charAt(i) != sum.charAt(sum.length() - 1))
                {
                    isPallindrome = false;
                }
            }
            
            
            System.out.printf("%s%n", isPallindrome ? "YES" : "NO");
            
        }
    }
}