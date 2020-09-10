//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 17, 2018
// Geeks for Geeks: Pronic Number
// https://practice.geeksforgeeks.org/problems/pronic-number/0
//******************************************************************************
package pronic.number;

import java.util.Scanner;

public class PronicNumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();

            int firstValue = 0;
            int secondValue = 1;

            while (firstValue * secondValue <= input)
            {
                System.out.printf("%d ", firstValue * secondValue);
                firstValue = secondValue;
                secondValue++;
            }

            System.out.printf("%n");
        }
    }
}
