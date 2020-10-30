// Name: David Turnbough
// Date: Thursday October 29, 2020
// Geeks For Geeks: Sort A String
// https://practice.geeksforgeeks.org/problems/sort-a-string/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1
package sort.a.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortAString
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String input = in.readLine();
            
            char[] tempInput = input.toCharArray();
            
            Arrays.sort(tempInput);
            
            System.out.printf("%s%n", new String(tempInput));
        }
    }
}