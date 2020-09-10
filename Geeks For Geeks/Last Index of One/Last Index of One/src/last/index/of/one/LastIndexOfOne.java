//******************************************************************************
// Name: David Turnbough
// Date: January 5, 2018 Friday
// Geeks for Geeks : Last Index of One
// https://practice.geeksforgeeks.org/problems/last-index-of-1/0
//******************************************************************************
package last.index.of.one;

import java.util.Scanner;

public class LastIndexOfOne
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String input = in.nextLine();
            
            int theLocation = -1;
            
            for(int i = 0; i < input.length(); ++i)
            {
                if(input.charAt(i) == '1')
                {
                    theLocation = i;
                }
            }

            System.out.printf("%d%n", theLocation);
        }
    }
}