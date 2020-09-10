//******************************************************************************
// Name: David Turnbough
// Date: Monday May 28, 2018
// Geeks For Geeks: Sum of Dependencies in a Graph
// https://practice.geeksforgeeks.org/problems/sum-of-dependencies-in-a-graph/0
//******************************************************************************
package sum.of.dependencies.in.a.graph;

import java.util.Scanner;

public class SumOfDependenciesInAGraph
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int vertices = in.nextInt();
            int edges = in.nextInt();

            int[][] graph = new int[vertices][vertices];
            int sum = 0;

            for (int i = 0; i < edges; ++i)
            {
                int row = in.nextInt();
                int column = in.nextInt();
                

                if (graph[row][column] != 1)
                {
                    graph[row][column] = 1;
                    sum++;
                }
            }

            System.out.printf("%d%n", edges);
        }
    }
}
