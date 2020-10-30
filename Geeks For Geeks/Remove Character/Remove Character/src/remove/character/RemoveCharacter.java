// Name: David Turnbough
// Date: Thursday October 29, 2020
// Geeks For Geeks: Remove Character
// https://practice.geeksforgeeks.org/problems/remove-character/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1

package remove.character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharacter
{
    public static void main(String[] args) throws IOException
    {
        // Generate an input stream
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());
        
        // Loop through the test cases
        while(testCases-- > 0)
        {
            // Get the two input strings
            String string1 = in.readLine();
            String string2 = in.readLine();
            
            // Loop through the characters of the second string and replace any
            //  instance of those characters in the first string with an empty
            //  character.
            for(int i = 0; i < string2.length(); ++i)
            {
                string1 = string1.replace(String.valueOf(string2.charAt(i)), "");
            }
            
            // Print the answer
            System.out.printf("%s%n", string1);
        }
    }
}