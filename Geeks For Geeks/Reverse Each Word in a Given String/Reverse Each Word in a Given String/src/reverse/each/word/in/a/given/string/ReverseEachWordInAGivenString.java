// Name: David Turnbough
// Date: Sunday October 18, 2020
// Geeks For Geeks: Reverse Each Word in a Given String
// https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1

package reverse.each.word.in.a.given.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWordInAGivenString
{
    public static void main(String[] args) throws IOException
    {
        // Create a reader to get input values
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Get the number of test cases
        int testCases = Integer.parseInt(in.readLine());
        
        // Loop through each test case
        while(testCases-- > 0)
        {
            // Get the input string, and store it in an array. Each element is
            //  seperated by a period, so the words are stored up to the period
            //  and the the period is discarded.
            String[] input = in.readLine().split("\\.");

            // Loop through each word in the sentence, reversing the word
            for(int i = 0; i < input.length; ++i)
            {
                // Generating a string builder to hold each word from the sentence.
                //  String builder has a built in method to reverse a string.
                //  Each word is used to create a string builder, the word is
                //  reversed, and the word builder is converted back into a string
                //  and added back to the array of words.
                StringBuilder temp = new StringBuilder();
                temp.append(input[i]);
                temp = temp.reverse();
                input[i] = temp.toString();
            }
            
            // Loop through each of the now reversed words, displaying them to the
            //  screen. A period is added between each of the words, as before.
            //  The if statement is used to add a period after each word, but
            //  does not add a period after the final word. 
            for(int i = 0 ;i < input.length; ++i)
            {
                System.out.printf("%s", input[i]);
                
                if(i < input.length - 1)
                {
                    System.out.printf(".");
                }
            }
            
            // Moves the output to the next line, for the next test case output.
            System.out.printf("%n");
        }
    }
}