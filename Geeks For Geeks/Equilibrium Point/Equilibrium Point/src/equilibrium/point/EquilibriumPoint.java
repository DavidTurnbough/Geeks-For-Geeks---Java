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
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String[] rawInput = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(rawInput[i]);
            }
        }
    }
}