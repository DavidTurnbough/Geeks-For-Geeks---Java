// Name: David Turnbough
// Date: Tuesday October 20, 2020
// Geeks For Geeks: Replace A Word
// https://practice.geeksforgeeks.org/problems/replace-a-word/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=2&query=problemStatusunsolvedproblemTypefulldifficulty[]0page2

package replace.a.word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceAWord
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            String str = in.readLine();
            String oldW = in.readLine();
            String newW = in.readLine();
            
            System.out.printf("%s%n", str.replace(oldW, newW));
        }
    }
}