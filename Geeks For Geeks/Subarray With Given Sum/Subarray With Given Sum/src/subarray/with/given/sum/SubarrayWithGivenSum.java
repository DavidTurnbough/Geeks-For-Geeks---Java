// Name: David Turnbough
// Date: Thursday October 29, 2020
// Geeks For Geeks: Subarray With Given Sum
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1sortBysubmissions
package subarray.with.given.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubarrayWithGivenSum
{
    public static void main(String[] args) throws IOException
    {
        // Create an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());

        // Loop throug the test cases
        while (testCases-- > 0)
        {
            // Get all input information and convert it to integers
            String[] sizeAndSum = in.readLine().split(" ");

            int size = Integer.parseInt(sizeAndSum[0]);
            int sum = Integer.parseInt(sizeAndSum[1]);

            String[] values = in.readLine().split(" ");

            int[] arr = new int[size];

            for (int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(values[i]);
            }

            // Start and end variables are used to keep track of the position of
            //  the sub array postions.
            int start = 0;
            int end = 0;
            
            // Current sum and sum found are used to keep a tally of the current
            //  sum, and weather the sum has been located.
            int currentSum = 0;
            boolean sumFound = false;

            // Loop through the array until the sum has been found, or the end
            //  of the array is reached.
            while (!sumFound && start < size && end < size)
            {
                if (currentSum + arr[end] < sum) //the subarray is to small
                {
                    currentSum += arr[end];
                    end++;
                }
                else if (currentSum + arr[end] > sum) // the subarray is to big
                {
                    currentSum -= arr[start];
                    start++;
                }
                else // the subarray has been found
                {
                    currentSum += arr[end];
                    sumFound = true;
                }
            }

            // Print the answer, if there is one, or -1 if there is not one.
            if (sumFound)
            {
                System.out.printf("%d %d%n", start + 1, end + 1);
            }
            else
            {
                System.out.printf("%d%n", -1);
            }

        }
    }
}
