// Name: David Turnbough
// Date: Monday October 19, 2020
// Geeks For Geeks: Meta Strings
// https://practice.geeksforgeeks.org/problems/meta-strings/0/?problemStatus=unsolved&problemType=full&difficulty[]=0&page=2&query=problemStatusunsolvedproblemTypefulldifficulty[]0page2
package meta.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetaStrings
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            // Get the two input strings for comparison
            String stringA = in.readLine();
            String stringB = in.readLine();

            int charA = 0;
            boolean charAFound = false;

            // Loop through each character of the strings, comparing the characters
            //  to each other, until the first set of characters not matching
            //  are found. The position of the non-matching character's index
            //  is saved, for later comparison.
            while (!charAFound && charA < stringA.length())
            {
                if (stringA.charAt(charA) != stringB.charAt(charA))
                {
                    charAFound = true;
                }
                else
                {
                    charA++;
                }
            }

            // Index of the characters to determine if they match, starting from
            //   the position of the last unmatching character, plus one index.
            //  Additionally, there is a flag used to exit the loop, when a
            //  mismatch between characters is found.
            int charB = charA + 1;
            boolean charBFound = false;

            // Loop through the characters of the string, looking for mismatches.
            while (!charBFound && charB < stringA.length())
            {
                if (stringA.charAt(charB) != stringB.charAt(charB))
                {
                    charBFound = true;
                }
                else
                {
                    charB++;
                }
            }

            // Flag used to determine if the strings are meta strings
            boolean isMetaString = false;

            // Checks to see if the two strings are meta strings.
            if (charB < stringA.length() && charA < stringA.length()
                    && stringA.charAt(charA) == stringB.charAt(charB)
                    && stringA.charAt(charB) == stringB.charAt(charA))
            {
                isMetaString = true;
            }

            // output the answer
            System.out.printf("%d%n", isMetaString ? 1 : 0);
        }

    }
}
