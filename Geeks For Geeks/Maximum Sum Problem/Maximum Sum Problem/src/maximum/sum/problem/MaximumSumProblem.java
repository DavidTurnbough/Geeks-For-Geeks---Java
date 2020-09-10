//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Maximum Sum Problem
// https://practice.geeksforgeeks.org/problems/maximum-sum-problem/0
//******************************************************************************
package maximum.sum.problem;

import java.util.Scanner;

public class MaximumSumProblem
{

    public static int maximumSum(int input)
    {
        int maximum = input;

        if (input == 0)
        {
            return 0;
        }
        else if ((input / 2) + (input / 3) + (input / 4) > maximum)
        {
            maximum = maximumSum(input / 2) + maximumSum(input / 3) + maximumSum(input / 4);
            
        }
        return maximum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int inputValue = in.nextInt();

            int result = maximumSum(inputValue);

            System.out.printf("%d%n", result);
        }
    }
}
