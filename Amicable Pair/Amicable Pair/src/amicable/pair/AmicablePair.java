//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Amicable Pair
// https://practice.geeksforgeeks.org/problems/amicable-pair/0
//******************************************************************************
package amicable.pair;

import java.util.Scanner;

public class AmicablePair
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();

            int firstSum = 0;
            int secondSum = 0;

            for (int i = 1; i <= (firstValue / 2); ++i)
            {
                if (firstValue % i == 0)
                {
                    firstSum += i;
                }
            }

            for (int i = 1; i <= (secondValue / 2); ++i)
            {
                if (secondValue % i == 0)
                {
                    secondSum += i;
                }
            }
            
            System.out.printf("%d%n", firstSum == secondValue && secondSum == firstValue ? 1 : 0);
        }
    }
}
