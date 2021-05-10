/**
 * Name: David Turnbough
 * Date: Monday May 10, 2021
 * Geeks For Geeks: K Subarray Sum
 * https://practice.geeksforgeeks.org/problems/k-subarray-sum/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1difficulty[]0page1
 *
 */
package k.subarray.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KSubarraySum
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            int[] rawInput = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int size = rawInput[0];
            int subarraySize = rawInput[1];
            int sumsToFind = rawInput[2];

            int[] sums = new int[sumsToFind];

            for (int i = 0; i <= size - subarraySize; ++i)
            {
                int sum = 0;

                for (int j = 0; j < subarraySize; ++j)
                {
                    sum += arr[i + j];
                }

                for (int k = 0; k < sumsToFind; ++k)
                {
                    int temp = 0;

                    if (sum > sums[k])
                    {
                        temp = sums[k];
                        sums[k] = sum;
                        sum = temp;

                        --k;
                    }

                }
            }

            /**
             * Output Answer
             */
            for (int i = 0; i < sumsToFind; ++i)
            {
                System.out.printf("%d ", sums[i]);
            }

            System.out.printf("%n");
        }
    }
}
