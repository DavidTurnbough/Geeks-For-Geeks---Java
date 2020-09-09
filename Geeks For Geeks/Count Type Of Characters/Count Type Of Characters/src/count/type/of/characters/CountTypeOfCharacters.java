//******************************************************************************
// Name: David Turnbough
// Date: Wednesday June 17, 2020
// Geeks For Geeks: Count Type Of Characters
// https://practice.geeksforgeeks.org/problems/count-type-of-characters/0
//******************************************************************************
package count.type.of.characters;

import java.util.Scanner;

public class CountTypeOfCharacters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            int upperCase = 0;
            int lowerCase = 0;
            int numbers = 0;
            int specialChar = 0;
            
            for(int i = 0; i < input.length(); ++i)
            {
                char currentChar = input.charAt(i);
                if(Character.isLowerCase(currentChar))
                {
                    lowerCase++;
                }
                else if(Character.isUpperCase(currentChar))
                {
                    upperCase++;
                }
                else if(Character.isDigit(currentChar))
                {
                   numbers++; 
                }
                else
                {
                    specialChar++;
                }
            }
            
            System.out.printf("%d%n%d%n%d%n%d%n", upperCase, lowerCase, numbers, specialChar);
        }
    }
}