//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Number Of Unique Paths
// https://practice.geeksforgeeks.org/problems/number-of-unique-paths/0
//******************************************************************************
package number.of.unique.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfUniquePaths
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String[] sizes = in.readLine().split(" ");
            
            int rows = Integer.parseInt(sizes[0]);
            int cols = Integer.parseInt(sizes[1]);
            
            int[][] arr = new int[rows][cols];
            
            // Initialize the first row. Only one unique way of reaching each
            //  square.
            for(int i = 0; i < rows; ++i)
            {
                arr[i][0] = 1;
            }
            
            // Initialize the first col. Only one unique way of reaching each
            //  square.
            for(int i = 0; i < cols; ++i)
            {
                arr[0][i] = 1;
            }
            
            // Fill ine the remaining squares, with the number of unique ways
            //   of reaching them, until the end is reached.
            for(int i = 1; i < rows; ++i)
            {
                for(int j = 1; j < cols; ++j)
                {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
            
            // Print the final square, bottom right.
            System.out.printf("%d%n", arr[rows - 1][cols - 1]);
            
        }
    }
}
