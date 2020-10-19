// Name: David Turnbough
// Date: Tuesday September 29, 2020
// Geeks For Geeks: Permutations Of A Given String
// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1sortBysubmissions
package permutations.of.a.given.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PermutationsOfAGivenString
{
    //ABC
    //ABSG
    
    public static String answer(String initial, String current)
    {
        System.out.printf("%s ", current);
        
        
        if(!initial.equals(current))
        {
            current = initial;
            answer(initial, current);
        }
        
        
        return initial;
    }
    
    public static String answer(String input)
    {
        return answer(input, input);
    }
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            String input = in.readLine();
            
            char charArray[] = input.toCharArray();
            
            Arrays.sort(charArray);
            
            answer(new String(charArray));
        }
    }
}