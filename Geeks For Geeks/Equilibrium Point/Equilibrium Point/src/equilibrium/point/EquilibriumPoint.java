// Name: David Turnbough
// Date: Thursday October 29, 2020
// Geeks For Geeks: Equilibrium Point
// https://practice.geeksforgeeks.org/problems/equilibrium-point/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1sortBysubmissions
package equilibrium.point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint
{

    public static void main(String[] args) throws IOException
    {
        // Generate an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());

        // Loop through the test cases
        while (testCases-- > 0)
        {
            // Get the size of the array
            int size = Integer.parseInt(in.readLine());

            // Get the elements of the input array
            String[] rawInput = in.readLine().split(" ");

            // Generate an array of integers to convert the input array into
            int[] arr = new int[size];
            
            // Determine the total of all of the elements in the array
            int arrSum = 0;

            // Convert the input array into the int array, and add the total 
            //  of all of the array elements up
            for (int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(rawInput[i]);
                arrSum += arr[i];
            }

            // Keep a running sum of the array elements
            int currentSum = 0;
            
            // The index that is the equilibrium, or -1 if no equilibrium is found
            int answer = -1;

            // Loop through the array looking for the index at which point all
            //  values to the left of a given index are equal to all of the 
            //  values to the right
            for (int i = 0; i < size; ++i)
            {
                // The equilibrium index is found. The total array sum, deducting
                //  the current running total, and the element at the equilibrium
                //  point are removed, and if it matches the current sum the
                //  equilibrium index has been located.
                if (arrSum - currentSum - arr[i] == currentSum)
                {
                    currentSum += arr[i];
                    answer = i + 1;
                    break;
                }
                
                // Add the current element to the running table, the left side
                //   of the equilibrium total.
                currentSum += arr[i];
            }

            // Print the answer
            System.out.printf("%d%n", answer);
        }
    }
}
