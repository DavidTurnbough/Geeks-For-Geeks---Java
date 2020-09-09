//******************************************************************************
// Name: David Turnbough
// Date: Monday May 21, 2018
// Geeks for Geeks: Arya And The Great War
// https://practice.geeksforgeeks.org/problems/arya-and-the-great-war/0
//******************************************************************************
package arya.and.the.great.war;

import java.util.Scanner;

public class AryaAndTheGreatWar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int whiteWalker = in.nextInt();
            
            int totalStabs = 0;
            
            while(whiteWalker > 0)
            {
                totalStabs += whiteWalker % 2;
                whiteWalker /= 2;
            }
            
            System.out.printf("%d%n", totalStabs);
        }
    }
}