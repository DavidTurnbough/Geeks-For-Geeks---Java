//******************************************************************************
// Name: David Turnbough
// Date: Monday December 31, 2018
// Geeks for Geeks: Convert A List Of Characters Into A String
// https://practice.geeksforgeeks.org/problems/convert-a-list-of-characters-into-a-string/0
//******************************************************************************
package convert.a.list.of.characters.into.a.string;

import java.util.Scanner;

public class ConvertAListOfCharactersIntoAString
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int size = in.nextInt();
            char[] letters = new char[size];
            String output = "";

            for (int i = 0; i < letters.length; ++i)
            {
                letters[i] = in.next().charAt(0);
                output += letters[i];
            }

            System.out.printf("%s%n", output);
        }
    }
}
