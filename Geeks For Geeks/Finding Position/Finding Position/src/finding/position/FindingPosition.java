//******************************************************************************
// Name: David Turnbough
// Date: Saturday September 19, 2020
// Geeks For Geeks: Finding Position
// https://practice.geeksforgeeks.org/problems/finding-position/0
//******************************************************************************
package finding.position;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingPosition
{
    // Recursively call the get position until the current call is longer than
    //  the line. The final position, the one longer than the line, is returned
    //  with one less. That is, it is reduced by one and returned. 
    public static int getPosition(int line, int currentPosition)
    {
        if(Math.pow(2, currentPosition) > line)
        {
            return (int)Math.pow(2, --currentPosition);
        }
        else
        {
            return getPosition(line, ++currentPosition);
        }
    }
    
    // Helper function.
    // Initializes the recursive function from the initial position.
    public static int getPosition(int line)
    {
        return getPosition(line, 1);
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(in.readLine());
        
        while(testCases-- > 0)
        {
            int line = Integer.parseInt(in.readLine());
            
            System.out.printf("%d%n", getPosition(line));
        }
    }
}