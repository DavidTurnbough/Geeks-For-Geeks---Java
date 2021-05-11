/**
 * Name: David Turnbough
 * Date: Monday May 10, 2021
 * Geeks For Geeks: Geek And Contest II
 * https://practice.geeksforgeeks.org/problems/geek-and-contest-1611828920/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1difficulty[]0page1
 *
 */
package geek.and.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GeekAndContest
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());

            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[] placement = new int[size];

            for (int i = 0; i < size; ++i)
            {
                int index = 0;
                int largest = 0;

                while (index < size)
                {
                    if (arr[index] >= arr[largest])
                    {
                        largest = index;
                    }

                    index++;
                }

                placement[i] = largest;
                arr[largest] = Integer.MIN_VALUE;
            }

            for (int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", placement[i] + 1);
            }

            System.out.printf("%n");
        }
    }
}
