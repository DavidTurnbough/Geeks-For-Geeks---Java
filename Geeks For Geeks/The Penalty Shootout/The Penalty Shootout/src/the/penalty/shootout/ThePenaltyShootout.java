//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 8, 2018
// Geeks for Geeks: The Penalty Shootout
// https://practice.geeksforgeeks.org/problems/the-penalty-shootout/0
//******************************************************************************
package the.penalty.shootout;

import java.util.Scanner;

public class ThePenaltyShootout
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            int count = 0;
            
            for(int i = 0; i < input.length(); ++i)
            {
                if(input.charAt(i) == '2')
                {
                    if(input.charAt(i + 1) == '1')
                    {
                        count++;
                    }
                }
            }
            
            System.out.printf("%d%n", count);
        }
    }
}