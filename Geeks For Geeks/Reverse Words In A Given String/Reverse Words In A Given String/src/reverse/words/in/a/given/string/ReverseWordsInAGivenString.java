//******************************************************************************
// Name: David Turnbough
// Date: Saturday September 12, 2020
// Geeks For Geeks: Reverse Words In A Given String
// https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
//******************************************************************************
package reverse.words.in.a.given.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsInAGivenString
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0)
        {
            String input = br.readLine();

            String answer = "";

            int start = 0;
            int end = 0;

            // Loop through the input string, picking out each word, then adding
            //  it to the answer.
            while (end < input.length())
            {
                while (end < input.length())
                {
                    if (input.charAt(end) == '.')
                    {
                        answer = input.subSequence(start, end) + "." + answer;
                        start = end + 1;
                    }
                    end++;
                }
                answer = input.subSequence(start, end) + "." + answer;
            }
            
            // Prints the answer created from the for loops above. There is
            //  an extra "." at the end, so I just did the substring of the 
            //  final answer, because I am to tired to fix it.
            System.out.println(answer.subSequence(0, answer.length() - 1));

        }
    }
}
