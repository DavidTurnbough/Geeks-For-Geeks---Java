//******************************************************************************
// Name: David Turnbough
// Date: Friday May 18, 2018
// Geeks for Geeks: Matching Pair
// https://practice.geeksforgeeks.org/problems/matching-pair/0
//******************************************************************************
package matching.pair;

import java.util.Scanner;

public class MatchingPair
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            System.out.printf("%d%n", input + 1);
        }
    }
}