// Name: David Turnbough
// Date: Monday November 2, 2020
// Geeks For Geeks: Count Number Of Hops
// https://practice.geeksforgeeks.org/problems/count-number-of-hops/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1
package count.number.of.hops;

// Had to look at the comments for the answer. Was stuck on this one for quite
// a while. Initially attempted to solve this recursively, then attempted to use
// a for loop, but could not solve the problem. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumberOfHops
{

    public static int numberOfWays(int numberOfSteps)
    {
        // If/else statements are used to ensure the number of steps are greater
        //  enough to use the previous three calculations, or the calculated
        //  number of steps are returned
        if (numberOfSteps <= 1)
        {
            return 1;
        }
        else if (numberOfSteps <= 2)
        {
            return 2;
        }
        else if (numberOfSteps <= 3)
        {
            return 4;
        }
        else
        {

            // Create an array to contain all past calculated number of hops
            int[] arr = new int[numberOfSteps + 1];

            // Initial values for hops 
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;

            // Loop through the steps, calculating the number of hops required based
            //  on the previously calculated hops.
            for (int i = 4; i < arr.length; ++i)
            {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }

            // Return the total number of hops needed to climb the stairs
            return arr[numberOfSteps];
        }
    }

    public static void main(String[] args) throws IOException
    {
        // Generate an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());

        // Loop through each test case
        while (testCases-- > 0)
        {
            // Get the total number of steps to move
            int numberOfSteps = Integer.parseInt(in.readLine());

            // Call the method to determine how many steps are taken, and print
            //  the answer
            System.out.printf("%d%n", numberOfWays(numberOfSteps));
        }
    }
}
