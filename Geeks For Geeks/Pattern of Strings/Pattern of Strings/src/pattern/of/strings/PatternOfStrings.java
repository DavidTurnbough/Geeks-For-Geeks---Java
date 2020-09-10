//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks of Geeks: Pattern of Strings
// https://practice.geeksforgeeks.org/problems/pattern-of-strings/0
//******************************************************************************
package pattern.of.strings;

import java.util.Scanner;

public class PatternOfStrings
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();
        
        while (testCases-- > 0)
        {
            String input = in.nextLine();

            for (int i = 0; i < input.length(); ++i)
            {
                System.out.printf("%s%n", input.substring(0, input.length() - i));
            }
        }
    }
}
