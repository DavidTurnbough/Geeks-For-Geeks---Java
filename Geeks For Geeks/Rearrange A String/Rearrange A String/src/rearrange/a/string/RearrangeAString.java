//******************************************************************************
// Name: David Turnbough
// Date: Friday September 18, 2020
// Geeks For Geeks: Rearrange A String
// https://practice.geeksforgeeks.org/problems/rearrange-a-string/0
//******************************************************************************
package rearrange.a.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.isLetter;
import java.util.Arrays;

public class RearrangeAString
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            String input = in.readLine();
            
            // Variables used to hold the characters from the string, and the
            //  total from the numbers found from the string
            String output = "";
            int count = 0;
            
            for(int i = 0; i < input.length(); ++i)
            {
                // Determine if the character is a letter or a number
                if(isLetter(input.charAt(i)))
                {
                    // For now, just create a string of the letters
                    output += input.charAt(i);
                }
                else
                {
                    // Add the numbers together as they are found
                    count += Character.getNumericValue(input.charAt(i));
                }
            }
            
            // Convert the string of characters to a character array
            char tempArray[] = output.toCharArray();
            
            // Use the sort method to sort the characters
            Arrays.sort(tempArray);
            
            // Convert the character array back into a string
            output = new String(tempArray);
            
            // Output the string with the total concatonated
            System.out.printf("%s%n", output + count);
        }
    }
}