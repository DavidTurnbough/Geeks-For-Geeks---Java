//******************************************************************************
// Name: David Turnbough
// Date: January 11, 2018 Thursday
// Geeks for Geeks: Find Second Largest Element
// https://practice.geeksforgeeks.org/problems/find-second-largest-element/0
//******************************************************************************
package find.second.largest.element;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class FindSecondLargestElement
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

            sort(arr);

            int largestElement = arr[size - 1];
            int secondLargestElement = -1;

            for (int i = (size - 1); i >= 0; --i)
            {
                if (arr[i] < largestElement)
                {
                    secondLargestElement = arr[i];
                    break;
                }
            }

            System.out.printf("%d%n", secondLargestElement);
        }
    }
}
