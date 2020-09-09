//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 21, 2019
// Geeks For Geeks: Count Of Camel Case Characters
// https://practice.geeksforgeeks.org/problems/find-the-camel/0
//******************************************************************************
package count.of.camel.pkgcase.characters;

import java.util.Scanner;

public class CountOfCamelCaseCharacters
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            int camelCaseTotal = 0;
            
            for(int i = 0; i < input.length(); ++i)
            {
                if(Character.isUpperCase(input.charAt(i)))
                {
                    camelCaseTotal++;
                }
            }
            
            System.out.printf("%d%n", camelCaseTotal);
        }
    }
}