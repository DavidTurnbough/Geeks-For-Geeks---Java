//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 24, 2018
// Geeks For Geeks: Max Possible Amount
// https://practice.geeksforgeeks.org/problems/max-possible-amount/0
//******************************************************************************
package max.possible.amount;

import java.util.Scanner;

public class MaxPossibleAmount
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }

            int left = 0;
            int right = size - 1;
            int total = 0;

            while (left <= right)
            {
                if (arr[left] >= arr[right])
                {
                    if (arr[left + 1] > arr[left])
                    {
                        total += arr[right];
                        right--;
                    }
                    else
                    {
                        total += arr[left];
                        left++;
                    }
                }
                else if (arr[left] < arr[right])
                {
                    if (arr[right - 1] > arr[right])
                    {
                        total += arr[left];
                        left++;
                    }
                    else
                    {
                        total += arr[right];
                        right--;
                    }
                }

                System.out.printf("Left %d  Right %d%n", left, right);
            }

            System.out.printf("%d%n", total);
        }
    }
}
