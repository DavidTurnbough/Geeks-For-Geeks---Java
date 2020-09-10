//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 23, 2019
// Geeks For Geeks: Palindrome
// https://practice.geeksforgeeks.org/problems/palindrome/0
//******************************************************************************
package palindrome;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            String value = String.valueOf(input);
            
            boolean isPalindrome = true;
            
            for(int i = 0; (i < value.length() / 2) && isPalindrome; ++i)
            {
                if(value.charAt(i) != value.charAt(value.length() - 1 - i))
                {
                    isPalindrome = false;
                }
            }
            
            
            System.out.printf("%s%n", isPalindrome ? "Yes" : "No");
            
        }
    }
}