//******************************************************************************
// Name: David Turnbough
// Date: January 6, 2018 Saturday
// Geeks for Geeks : Index of First 1 in a Sorted Array of 0's and 1's
// https://www.facebook.com/messages/t/autumn.smith7107
//******************************************************************************
package index.of.first.pkg1.in.a.sorted.array.of.pkg0.s.and.pkg1.s;

import java.util.Scanner;

public class IndexOfFirst1InASortedArrayOf0SAnd1S
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

            int location = -1;

            for (int i = 0; i < size; ++i)
            {
                if (arr[i] == 1)
                {
                    location = i;
                    break;
                }
            }

            System.out.printf("%d%n", location);
        }
    }
}
