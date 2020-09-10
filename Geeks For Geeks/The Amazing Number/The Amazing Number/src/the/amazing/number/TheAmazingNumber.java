//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 10, 2018
// Geeks for Geeks - The Amazing Number
// https://practice.geeksforgeeks.org/problems/the-amazing-number/0
//******************************************************************************
package the.amazing.number;

import java.util.Scanner;

public class TheAmazingNumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int theNumber = in.nextInt();
            int count = 0;

            for (int i = 1; i <= theNumber || count > 3; ++i)
            {
                if (theNumber % i == 0)
                {
                    count++;
                }
            }

            if (count == 3)
            {
                System.out.printf("1%n");
            }
            else
            {
                System.out.printf("0%n");
            }
        }
    }
}
