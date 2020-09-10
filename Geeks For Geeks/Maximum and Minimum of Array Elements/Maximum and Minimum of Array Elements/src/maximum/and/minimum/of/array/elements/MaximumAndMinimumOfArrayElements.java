package maximum.and.minimum.of.array.elements;
//******************************************************************************
// Name: David Turnbough
// Date: January 4, 2018 Thursday
// Geeks for Geeks : Maximum and Minimum of Arrays Elements
// https://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/0
//******************************************************************************

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MaximumAndMinimumOfArrayElements
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

            sort(arr);

            System.out.printf("%d %d%n", arr[size - 1], arr[0]);
        }
    }
}
