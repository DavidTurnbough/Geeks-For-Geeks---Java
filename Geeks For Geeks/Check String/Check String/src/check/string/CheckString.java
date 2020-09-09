//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geek For Geeks: Check String
// https://practice.geeksforgeeks.org/problems/check-string/0
//******************************************************************************
package check.string;

import java.util.Scanner;

public class CheckString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            char[] chars = input.toCharArray();
            
            boolean isSame = true;
            
            for(int i = 0; i < chars.length - 1 && isSame; ++i)
            {
                if(chars[i] != chars[i + 1])
                {
                    isSame = false;
                }
            }
            
            System.out.printf("%S%n", isSame ? "yes" : "no");
            
        }
    }
}