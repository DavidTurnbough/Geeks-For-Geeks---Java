//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 5, 2018
// Geeks for Geeks - Remainder Evaluation
// https://practice.geeksforgeeks.org/problems/remainder-evaluation/0
//******************************************************************************
package remainder.evaluation;

import java.util.Scanner;

public class RemainderEvaluation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            
            System.out.printf("%d%n", (num1 % num2));
        }
        
    }
}