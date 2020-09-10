//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 25, 2019
// Geeks For Geeks: Lower Case To Upper Case
// https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case/0
//******************************************************************************
package lower.pkgcase.to.upper.pkgcase;

import java.util.Scanner;

public class LowerCaseToUpperCase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            System.out.printf("%S%n", input);
        }
    }   
}