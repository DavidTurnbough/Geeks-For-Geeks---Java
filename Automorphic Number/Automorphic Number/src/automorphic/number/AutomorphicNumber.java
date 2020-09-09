//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 11, 2020
// Geeks For Geeks: Automorphic Number
// https://practice.geeksforgeeks.org/problems/automorphic-number/0
//******************************************************************************
package automorphic.number;

import java.util.Scanner;

public class AutomorphicNumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();

            int inputSquared = input * input;

            boolean isAutomorphic = true;

            while (input > 0 && isAutomorphic)
            {
                if (input % 10 != inputSquared % 10)
                {
                    isAutomorphic = false;
                }
                else
                {
                    input /= 10;
                    inputSquared /= 10;
                }
            }

            System.out.printf("%s%n", isAutomorphic ? "Automorphic" : "Not Automorphic");
        }
    }
}
