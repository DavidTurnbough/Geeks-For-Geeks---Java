//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 23, 2019
// Geeks For Geeks: Sum Palindrome
// https://practice.geeksforgeeks.org/problems/sum-palindrome/0
//******************************************************************************
package sum.palindrome;

import java.util.Scanner;

public class SumPalindrome
{

    public static boolean isPalindrome(int input)
    {
        int reverseInput = reverseInput(input);

        return (reverseInput == input);
    }

    public static int reverseInput(int input)
    {
        int tempInput = input;
        int reverseInput = 0;

        while (tempInput > 0)
        {
            int temp = tempInput % 10;
            tempInput /= 10;
            reverseInput = reverseInput * 10 + temp;
        }

        return reverseInput;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();

            int reverseInput = 0;
            int total = 0;
            boolean isPalindrome = false;

            for (int i = 0; (i <= 5) && !isPalindrome; ++i)
            {
                isPalindrome = isPalindrome(input);

                if (!isPalindrome)
                {
                    reverseInput = reverseInput(input);
                    total = input + reverseInput;
                    input = total;
                }
                else
                {
                    total = input;
                }
            }

            System.out.printf("%d%n", isPalindrome ? total : -1);
        }
    }
}
