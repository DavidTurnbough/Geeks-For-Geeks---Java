/**
 * Name: David Turnbough
 * Date: Thursday January 14, 2020
 * Geeks For Geeks: Sort The Array
 * https://practice.geeksforgeeks.org/problems/sort-the-array/0/?problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1page1sortBysubmissions
 */
package sort.the.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SortTheArray
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            Arrays.sort(arr);
            
            for(int i = 0; i < size; ++i)
            {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
        }
    }
}