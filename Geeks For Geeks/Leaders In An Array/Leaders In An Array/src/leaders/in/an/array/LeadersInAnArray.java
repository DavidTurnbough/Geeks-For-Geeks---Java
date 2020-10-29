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
        // Generate an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Get the number of testcases
        int testCases = Integer.parseInt(in.readLine());
        
        // Loop through all of the testcases
        while(testCases-- > 0)
        {
            // Get the size of the array
            int size = Integer.parseInt(in.readLine());
            
            // Get the elements in the array
            String[] input = in.readLine().split(" ");
            
            // Create an array of integers, convert the user input elements into
            //  integers.
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            
            // Variables used to keep track of the current largest leader, and the
            //  final answer
            int leader = arr[size - 1];
            String answer = "";

            // Beging from the final element, since it is always considered to be
            //  a leader, search for each element to the left for an element that
            //  is larger than the current leader.
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