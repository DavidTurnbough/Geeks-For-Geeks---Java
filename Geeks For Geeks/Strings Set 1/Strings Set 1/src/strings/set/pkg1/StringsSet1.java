//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 26, 2018
// Geeks For Geeks: Java Strings Set 1
// https://practice.geeksforgeeks.org/problems/java-strings-set-1/0
//******************************************************************************
package strings.set.pkg1;

import java.util.Scanner;

public class StringsSet1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input1 = in.nextLine();
            String input2 = in.nextLine();
            
            input1 += input2;
            
            String output = "";
            
            for(int i = input1.length() - 1; i >= 0; --i)
            {
                output += input1.charAt(i);
            }
            
            System.out.printf("%s%n", output);
        }
    }
}