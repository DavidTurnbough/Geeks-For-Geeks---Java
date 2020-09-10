//******************************************************************************
// Name: David Turnbough
// Date: January 5, 2018 Friday
// Geeks for Geeks : Sandwiched_Vowels
// https://practice.geeksforgeeks.org/problems/sandwiched-vowels/0
//******************************************************************************
package sandwiched_vowels;

import java.util.Scanner;

public class Sandwiched_Vowels
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {

            String input = in.nextLine();

            char[] arr = input.toCharArray();
            int size = input.length();

            String output = "";

            for (int i = 0; i < size; ++i)
            {
                if (i == 0 || i == size - 1 || isAConsonant(arr[i]))
                {
                    output += arr[i];
                }
                else if (isAConsonant(arr[i - 1]) && isAVowel(arr[i]) && isAConsonant(arr[i + 1]))
                {
                    // the current vowel is not added to the word
                }
                else
                {
                    output += arr[i];
                }
            }

            System.out.printf("%s%n", output);

        }
    }

    public static boolean isAVowel(char passedChar)
    {
        return (passedChar == 'a' || passedChar == 'e' || passedChar == 'i'
                || passedChar == 'o' || passedChar == 'u');

    }

    public static boolean isAConsonant(char passedChar)
    {
        return (passedChar != 'a' && passedChar != 'e' && passedChar != 'i'
                && passedChar != 'o' && passedChar != 'u');
    }
}
