//******************************************************************************
// Name: David Turnbough
// Date: Monday June 17, 2019
// Geeks For Geeks: Count Alphabets
// https://practice.geeksforgeeks.org/problems/count-alphabets/0
//******************************************************************************
package count.alphabets;

import java.util.Scanner;

public class CountAlphabets
{
    public static boolean isAlphabet(char input)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        
        return alphabet.contains(String.valueOf(input));
        
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            int totalCharacters = 0;
            
            for(int i = 0; i < input.length(); ++i)
            {
                if(isAlphabet(input.charAt(i)))
                {
                    totalCharacters++;
                }
            }
                
            System.out.printf("%d%n", totalCharacters);
        }
    }
}