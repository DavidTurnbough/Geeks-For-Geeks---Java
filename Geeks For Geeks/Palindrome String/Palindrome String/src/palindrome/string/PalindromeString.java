//******************************************************************************
// Name: David Turnbough
// Date: January 15, 2018 Monday
// Geeks for Geeks: Palindrome String
// https://practice.geeksforgeeks.org/problems/palindrome-string/0/?ref=self
//******************************************************************************
package palindrome.string;

import java.util.Scanner;

public class PalindromeString
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int length = in.nextInt();
            String word = in.next();

            String isPalindrome = "Yes";

            for (int i = 0; i < (length / 2); ++i)
            {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                {
                    isPalindrome = "No";
                    break;
                }
            }

            System.out.printf("%s%n", isPalindrome);
        }
    }
}
