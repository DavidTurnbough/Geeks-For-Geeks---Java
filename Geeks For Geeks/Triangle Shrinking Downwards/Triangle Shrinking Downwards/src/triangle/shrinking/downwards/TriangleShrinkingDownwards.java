//******************************************************************************
// Name: David Turnbough
// Date: Wednesday July 15, 2020
// Geeks For Geeks: Triangle Shrinking Downwards
// https://practice.geeksforgeeks.org/problems/triangle-shrinking-downwards/0
//******************************************************************************
package triangle.shrinking.downwards;

import java.util.Scanner;

public class TriangleShrinkingDownwards
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String input = in.nextLine();

            char[] inputValue = input.toCharArray();

            for (int i = 0; i < input.length(); ++i)
            {
                for (int j = 0; j < input.length(); ++j)
                {
                    System.out.printf("%s", inputValue[j]);
                }
                System.out.printf("%n");
                inputValue[i] = '.';
            }
        }
    }
}
