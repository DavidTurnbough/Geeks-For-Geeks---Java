//******************************************************************************
// Name: David Turnbough
// Date: Friday September 10, 2020
// Geeks For Geeks: Closing Bracket Index
// https://practice.geeksforgeeks.org/problems/closing-bracket-index/0
//******************************************************************************
package closing.bracket.index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingBracketIndex
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(br.readLine());
        
        while(testCases-- > 0)
        {
            String input = br.readLine();
            
            // Get the initial index to begin from, looking for the matching brace
            int currentIndex = Integer.parseInt(br.readLine().replaceAll("\\s", ""));
            
            // Count is used to keep track of the total number of braces. It is
            //  incremented when a brace is found, starting from the initial 
            //  brace, and subtracted when a matching brace is found.
            int count = 0;
            int finalIndex = 0;
            
            while(currentIndex < input.length())
            {
                if(input.charAt(currentIndex) == '[')
                {
                    count++;
                }
                else if(input.charAt(currentIndex) == ']')
                {
                    count--;
                }
                
                // When count reaches zero, there is a matching closing brace
                //  for every opening brace that has been seen.
                if(count == 0)
                {
                    finalIndex = currentIndex;
                    break;
                }
                
                currentIndex++;
            }
            
            System.out.print(finalIndex + "\n");
            
        }
    }
}