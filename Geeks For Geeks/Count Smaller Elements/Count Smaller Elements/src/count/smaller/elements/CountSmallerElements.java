//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Count Smaller Elements
// https://practice.geeksforgeeks.org/problems/count-smaller-elements/0
//******************************************************************************
package count.smaller.elements;

import java.util.Scanner;

public class CountSmallerElements
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0)
        {
            int size = sc.nextInt();

            int[] foo = new int[size];

            for (int i = 0; i < size; ++i)
            {
                foo[i] = sc.nextInt();
            }

            int[] bar = new int[size];

            for (int i = 0; i < size - 1; ++i)
            {
                int count = 0;

                for (int j = i + 1; j < size; ++j)
                {
                    if (foo[j] < foo[i])
                    {
                        count++;
                    }
                }
                
                bar[i] = count;
            }

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", bar[i]);
            }

            System.out.printf("%n");
        }
    }
}
