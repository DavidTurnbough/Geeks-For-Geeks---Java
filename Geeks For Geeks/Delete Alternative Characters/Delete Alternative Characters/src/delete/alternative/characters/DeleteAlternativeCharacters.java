//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geeks for Geeks: Java Delete Alternative Characters
// https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters/0
//******************************************************************************
package delete.alternative.characters;

import java.util.Scanner;

public class DeleteAlternativeCharacters
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
            
            for(int i = 0; i < input.length(); ++i)
            {
                if(i % 2 == 0)
                {
                    output += input.charAt(i);
                }
            }
            
            System.out.printf("%s%n", output);
        }
    }
}