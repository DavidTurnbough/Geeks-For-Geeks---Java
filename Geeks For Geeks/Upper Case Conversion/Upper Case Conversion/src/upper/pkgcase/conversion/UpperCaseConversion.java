//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geeks For Geeks: Upper Case Conversion
// https://practice.geeksforgeeks.org/problems/upper-case-conversion/0
//******************************************************************************
package upper.pkgcase.conversion;

import java.util.Scanner;

public class UpperCaseConversion
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String input = in.nextLine();
            char[] chars = input.toCharArray();
            
            chars[0] = Character.toUpperCase(chars[0]);

            for (int i = 1; i < chars.length; ++i)
            {
                if(chars[i - 1] == ' ')
                {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            
            input = String.valueOf(chars);

            System.out.printf("%s%n", input);
        }
    }
}
