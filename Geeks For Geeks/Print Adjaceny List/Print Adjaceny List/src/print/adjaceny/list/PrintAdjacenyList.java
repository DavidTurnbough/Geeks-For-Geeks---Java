//******************************************************************************
// Name: David Turnbough
// Date: Monday May 28, 2018
// Geeks For Geeks: Print Adjacency List
// https://practice.geeksforgeeks.org/problems/print-adjacency-list/0
//******************************************************************************
package print.adjaceny.list;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintAdjacenyList
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int vertices = in.nextInt();
            int edges = in.nextInt();

            LinkedList<Integer>[] graph = new LinkedList[vertices];

            for (int i = 0; i < edges; ++i)
            {
                int a = in.nextInt();
                int b = in.nextInt();

                if (graph[a] == null)
                {
                    graph[a] = new LinkedList<>();
                }

                if (graph[b] == null)
                {
                    graph[b] = new LinkedList<>();
                }

                graph[a].add(b);
                graph[b].add(a);
            }

            for (int i = 0; i < vertices; ++i)
            {
                System.out.printf("%d", i);

                for (int j = 0; j < vertices; ++j)
                {
                    System.out.printf("-> %d", graph[j]);
                }

                System.out.printf("%n");
            }
        }
    }
}
