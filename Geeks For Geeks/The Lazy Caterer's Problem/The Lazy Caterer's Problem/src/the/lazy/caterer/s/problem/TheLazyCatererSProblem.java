//******************************************************************************
// Name: David Turnbough
// Date: Sunday June 10, 2018
// Geeks for Geeks: The Lazy Caterer's Problem
// https://www.geeksforgeeks.org/the-lazy-caterers-problem/
//******************************************************************************
package the.lazy.caterer.s.problem;

import java.util.Scanner;

public class TheLazyCatererSProblem
{
    
    public static int numberOfPieces(int numberOfCuts)
    {
        if(numberOfCuts <= 0)
        {
            return 1;
        }
        
        return (numberOfCuts + numberOfPieces(--numberOfCuts));
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int numberOfCuts = in.nextInt();
            
            System.out.printf("%d%n", numberOfPieces(numberOfCuts));
        }
    }
}