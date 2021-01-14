// Name: David Turnbough
// Date: Tuesday November 3, 2020
// Geeks For Geeks: Eulerian Path In An Undirected Graph
// https://practice.geeksforgeeks.org/problems/eulerian-path-in-an-undirected-graph/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1

package eulerian.path.in.an.undirected.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EulerianPathInAnUndirectedGraph
{
    public static void main(String[] args) throws IOException
    {
        // Generate an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());
        
        // Loop through the test cases
        while(testCases-- > 0)
        {
            // Get the total number of vertices in the graph
            int vertices = Integer.parseInt(in.readLine());
            
            // Create a graph matrix to contain the edges between vertices
            int[][] graph = new int[vertices][vertices];
            
            // Get the edges between vertices and store them in the graph
            for(int i = 0; i < vertices; ++i)
            {
                String[] rawInput = in.readLine().split(" ");
                
                for(int j = 0; j < vertices; ++j)
                {
                    graph[i][j] = Integer.parseInt(rawInput[j]);
                }
            }
            
            for(int i = 0; i < vertices; ++i)
            {
                for(int j = 0; j < vertices; ++j)
                {
                    
                }
            }
            
            
            
        }
    }
}