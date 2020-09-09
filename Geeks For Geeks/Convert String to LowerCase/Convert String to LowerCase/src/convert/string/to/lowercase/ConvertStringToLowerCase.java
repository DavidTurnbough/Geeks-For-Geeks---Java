//******************************************************************************
// Name: David Turnbough
// Date: Sunday July 22, 2018
// Geeks for Geeks: Java Convert String to LowerCase
// https://practice.geeksforgeeks.org/problems/java-convert-string-to-lowercase/0
//******************************************************************************
package convert.string.to.lowercase;

import java.util.Scanner;

public class ConvertStringToLowerCase
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String input = in.nextLine();

            System.out.printf("%s%n", input.toLowerCase());
        }
    }
}
