//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Nuts And Bolts Problem
// https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem/0
//******************************************************************************
package nuts.and.bolts.problem;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class NutsAndBoltsProblem
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            in.nextLine();

            String[] foo = new String[size];
            String[] bar = new String[size];

            for (int i = 0; i < size; ++i)
            {
                foo[i] = in.next();
            }

            for (int i = 0; i < size; ++i)
            {
                bar[i] = in.next();
            }

            sort(foo);
            sort(bar);

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%s ", foo[i]);
            }

            System.out.printf("%n");

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%s ", bar[i]);
            }

            System.out.printf("%n");
        }
    }
}
