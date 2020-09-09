//******************************************************************************
// Name: David Turnbough
// Date: Thursday August 7, 2018
// Geeks for Geeks: Convert An Array To Reduced Form
// https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form/0
//******************************************************************************
package convert.an.array.to.reduced.form;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class ConvertAnArrayToReducedForm
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();

            int[] foo = new int[size];

            for (int i = 0; i < size; ++i)
            {
                foo[i] = in.nextInt();
            }

            int[] bar = new int[size];

            for (int i = 0; i < size; ++i)
            {
                bar[i] = foo[i];
            }

            sort(foo);

            for (int i = 0; i < size; ++i)
            {
                for (int j = 0; j < size; ++j)
                {
                    if (bar[i] == foo[j])
                    {
                        bar[i] = j;
                        break;
                    }
                }
            }

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", bar[i]);
            }

            System.out.printf("%n");
        }
    }
}
