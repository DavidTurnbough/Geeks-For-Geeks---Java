//******************************************************************************
// Name: David Turnbough
// Date: Tuesda2 July 14, 2020
// Geeks For Geeks: Parallel Or Perpendicular?
// https://practice.geeksforgeeks.org/problems/parallel-or-perpendicular/0
//******************************************************************************
package parallel.or.perpendicular;

import java.util.Scanner;

public class ParallelOrPerpendicular
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            try
            {
                int a1 = in.nextInt();
                int a2 = in.nextInt();
                int a3 = in.nextInt();
                int b1 = in.nextInt();
                int b2 = in.nextInt();
                int b3 = in.nextInt();

                int perpendicularTest = (a1 * b1 + a2 * b2 + a3 * b3);

                int parallelPart = ((a2 * b3 - a3 * b2) - (a1 * b3 - b1 * a3) + (a1 * b2 - a2 * b1));

                int parallelTest = Math.abs(parallelPart * parallelPart);

                if (perpendicularTest == 0)
                {
                    System.out.println(2);
                }
                else if (parallelTest == 0)
                {
                    System.out.println(1);
                }
                else if (perpendicularTest != 0 && parallelTest != 0)
                {
                    System.out.println(0);
                }
            }
            catch (Exception e)
            {
                System.out.println(0);
            }
        }
    }
}
