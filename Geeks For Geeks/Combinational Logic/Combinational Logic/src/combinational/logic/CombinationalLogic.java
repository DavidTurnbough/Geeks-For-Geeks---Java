//******************************************************************************
// Name: David Turnbough
// Date: Wednesday June 17, 2020
// Geeks For Geeks: Combinational Logic
// https://practice.geeksforgeeks.org/problems/combinational-logic/0
//******************************************************************************
package combinational.logic;

import java.util.Scanner;

public class CombinationalLogic
{

    public static void main(String[] args)
    {
        final int SIZE = 6;

        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();

            int output = 0;

            if (not(a) * b == 1 || c * d == 1 || e * not(f) == 1)
            {
                output = 1;
            }

            System.out.printf("%d%n", output);
        }
    }

    private static int not(int input)
    {
        if (input == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
