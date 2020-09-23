// Name: David Turnbough
// Date: Wednesday September 23, 2020
// Geeks For Geeks: Leaders In An Array
// https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]0page1sortBysubmissions
package leaders.in.an.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LeadersInAnArray
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int size = Integer.parseInt(in.readLine());
            
            String[] input = in.readLine().split(" ");
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            int leader = Integer.MIN_VALUE;
            String answer = "";
            
            for(int i = size - 1; i >= 0; --i)
            {
                if(arr[i] >= leader)
                {
                    leader = arr[i];
                    answer = leader + " " + answer;
                }
            }
            
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            
            out.write(answer + '\n');
            out.flush();
            
            in.close();
            out.close();
        }
    }
}