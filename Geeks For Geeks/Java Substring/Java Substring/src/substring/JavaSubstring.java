//******************************************************************************
// Name: David Turnbough
// Date: Sunday June 10, 2018
// Geeks For Geeks: Java Substring
// https://practice.geeksforgeeks.org/problems/java-substring/0
//******************************************************************************
package substring;

import java.util.Scanner;

public class JavaSubstring
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            String input = in.next();
            in.nextLine();
            
            int left = in.nextInt();
            int right = in.nextInt();
            
            System.out.println(input.subSequence(left, right + 1));
        }
    }
}