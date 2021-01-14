/**
 * Name: David Turnbough
 * Date: Thursday January 14, 2020
 * Geeks For Geeks Find The Smallest And Second Smallest Element In An Array
 * https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1sortBysubmissions
 */
package find.the.smallest.and.second.smallest.element.in.an.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheSmallestAndSecondSmallestElementInAnArray
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());

            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int smallest = arr[0];
            int secondSmallest = arr[0];

            for (int i = 0; i < size; ++i)
            {
                if (arr[i] < smallest)
                {
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
                else if (arr[i] > smallest && arr[i] < secondSmallest
                        || smallest == secondSmallest)
                {
                    secondSmallest = arr[i];
                }
            }

            if (smallest == secondSmallest)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(smallest + " " + secondSmallest);
            }
        }
    }
}
