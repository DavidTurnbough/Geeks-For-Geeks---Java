//******************************************************************************
// Name: David Turnbough
// Date: Janaury 13, 2018 Saturday
// Geeks for Geeks: Maximum Occuring Character
// https://practice.geeksforgeeks.org/problems/maximum-occuring-character/0/?ref=self
//******************************************************************************
package maximum.occuring.character;

import java.util.Scanner;

public class MaximumOccuringCharacter
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String word = in.nextLine();

            int maximumNumberOfOccurences = 0;
            char maximumOccuringCharacter = 'z';

            for (int i = 0; i < (word.length() - 1); ++i)
            {
                int count = 1;

                for (int j = (i + 1); j < word.length(); ++j)
                {
                    if (word.charAt(i) == word.charAt(j))
                    {
                        count++;
                    }
                }
                
                if (count > maximumNumberOfOccurences || count >= maximumNumberOfOccurences && maximumOccuringCharacter > word.charAt(i))
                {
                    maximumNumberOfOccurences = count;
                    maximumOccuringCharacter = word.charAt(i);
                }
            }

            System.out.printf("%c%n", maximumOccuringCharacter);
        }
    }
}
