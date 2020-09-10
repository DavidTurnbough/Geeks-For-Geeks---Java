//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Sort an Array of 0s, 1s, and 2s
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
//******************************************************************************
package sort.an.array.of.pkg0s.pkg1s.and.pkg2s;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class SortAnArrayOf0s1sAnd2s
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

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", arr[i]);
            }

            System.out.println();

        }
    }

}
