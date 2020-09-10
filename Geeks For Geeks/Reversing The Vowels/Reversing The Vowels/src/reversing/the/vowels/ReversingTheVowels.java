//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 22, 2019
// Geeks For Geeks: Reversing The Vowels
// https://practice.geeksforgeeks.org/problems/reversing-the-vowels/0
//******************************************************************************
package reversing.the.vowels;

import java.util.Scanner;

public class ReversingTheVowels
{

    public static boolean isVowel(char character)
    {
        boolean vowel = false;
        
        switch(character)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                vowel = true;
        }
        
        return vowel;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String inputValue = in.nextLine();

            char[] input = inputValue.toCharArray();
            
            int last = input.length;
            
            for(int i = 0; i < input.length && i < last; ++i)
            {
                if(isVowel(input[i]))
                {
                    while(last-- >= 0)
                    {
                        if(isVowel(input[last]))
                        {
                            char temp = input[last];
                            input[last] = input[i];
                            input[i] = temp;
                            break;
                        }
                    }
                }
            }
            
            String output = new String(input);
            
            System.out.printf("%s%n", output);
        }
    }
}
