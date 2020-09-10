//******************************************************************************
// Name: David Turnbough
// Date: 
// Geeks for Geeks: 0 - 1 Knapsack Problem
// https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem/0
//******************************************************************************
package knapsack.problem;

import java.util.Scanner;

public class KnapsackProblem
{

    public static int max(int firstValue, int secondValue)
    {
        return firstValue >= secondValue ? firstValue : secondValue;
    }

    public static int knapsack(int[] values, int[] weights, int size, int maxWeight)
    {
        int[][] table = new int[size + 1][maxWeight + 1];

        int i;
        int j;

        for (i = 0; i <= size; ++i)
        {
            for (j = 0; j <= maxWeight; ++j)
            {
                if (i == 0 || j == 0)
                {
                    table[i][j] = 0;
                }
                else if (weights[i - 1] <= j)
                {
                    table[i][j] = max(values[i - 1] + table[i - 1][j - weights[i - 1]], table[i - 1][j]);
                }
                else
                {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        return table[size][maxWeight];
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            int maxWeight = in.nextInt();

            int[] values = new int[size];
            int[] weights = new int[size];

            for (int i = 0; i < size; ++i)
            {
                values[i] = in.nextInt();
            }

            for (int i = 0; i < size; ++i)
            {
                weights[i] = in.nextInt();
            }

            System.out.printf("%d%n", knapsack(values, weights, size, maxWeight));
        }
    }
}
