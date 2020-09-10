//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 17, 2018
// Geeks for Geeks: Reverse A String
// https://practice.geeksforgeeks.org/problems/reverse-the-string/0
//******************************************************************************
package reverse.a.string;

import java.util.Scanner;

public class ReverseAString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            String output = "";
            
            for(int i = input.length() - 1; i >= 0; --i)
            {
                output += input.charAt(i);
            }
            
            System.out.printf("%s%n", output);
        }
    }
}