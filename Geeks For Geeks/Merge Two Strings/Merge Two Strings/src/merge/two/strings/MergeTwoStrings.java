// Name: David Turnbough
// Date: Thursday October 29, 2020
// Geeks For Geeks: Merge Two Strings
// https://practice.geeksforgeeks.org/problems/merge-two-strings/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1
package merge.two.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwoStrings
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String[] rawInput = in.readLine().split(" ");

            String string1 = rawInput[0];
            String string2 = rawInput[1];

            int maxLength = string1.length() > string2.length() ? string1.length() : string2.length();

            String answer = "";
            int index = 0;

            while (index < maxLength)
            {
                if (index < string1.length())
                {
                    answer += string1.charAt(index);
                }

                if (index < string2.length())
                {
                    answer += string2.charAt(index);
                }
                
                index++;
            }

            System.out.printf("%s%n", answer);
        }
    }
}
