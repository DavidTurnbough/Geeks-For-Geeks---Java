//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 8, 2018
// Geeks for Geeks - Sum of an AP
// https://practice.geeksforgeeks.org/problems/sum-of-an-ap/0
//******************************************************************************
package sum.of.an.ap;

import java.util.Scanner;

public class SumOfAnAP
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int numberOfTerms = in.nextInt();
            int firstTerm = in.nextInt();
            int commonDifference = in.nextInt();
            int total = 0;
            
            for(int i = 0; i < numberOfTerms; i++)
            {
                total += firstTerm + commonDifference * i;
            }
            
            System.out.printf("%d%n", total);
        }
    }
}