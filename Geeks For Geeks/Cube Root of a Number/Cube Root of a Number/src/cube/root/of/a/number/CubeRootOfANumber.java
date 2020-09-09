//******************************************************************************
// Name: David Turnbough
// Date: Friday October 28, 2018
// Geeks for Geeks: Cube Root of a Number
// https://practice.geeksforgeeks.org/problems/cube-root-of-a-number/0
//******************************************************************************
package cube.root.of.a.number;

import java.util.Scanner;

public class CubeRootOfANumber
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            double input = in.nextDouble();

            System.out.printf("%.0f%n", Math.floor(Math.pow(input, 1.0 / 3.0)));
        }
    }
}
