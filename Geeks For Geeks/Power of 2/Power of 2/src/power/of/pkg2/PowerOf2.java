//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 12, 2018
// Geeks for Geeks: Power of 2
// https://practice.geeksforgeeks.org/problems/power-of-2/0
//******************************************************************************
package power.of.pkg2;

import java.util.Scanner;

public class PowerOf2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            long input = in.nextLong();

            System.out.println((input != 0 && (long) (input & (input - 1)) == 0) ? "YES" : "NO");
        }
    }
}