//******************************************************************************
// Name: David Turnbough
// Date: January 11, 2018 Thursday
// Geeks for Geeks: Pairs which are Divisible by 4
// https://practice.geeksforgeeks.org/problems/pairs-which-are-divisible-by-4/0
//******************************************************************************
package pairs.which.are.divisible.by.pkg4;

import java.util.Scanner;

public class PairsWhichAreDivisibleBy4
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0)
        {
            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for (int i = 0; i < size - 1; ++i)
            {
                for (int j = i + 1; j < size; ++j)
                {
                    int temp = arr[i] + arr[j];

                    if (temp % 4 == 0)
                    {
                        count++;
                    }
                }
            }

            System.out.printf("%d%n", count);

        }
    }
}
