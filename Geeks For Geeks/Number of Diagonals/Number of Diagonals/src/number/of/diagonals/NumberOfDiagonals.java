//******************************************************************************
// Name: David Turnbough
// Date: Friday May 18, 2018
// Geeks for Geeks: Number of Diagonals
// https://practice.geeksforgeeks.org/problems/number-of-diagonals/0
//******************************************************************************
package number.of.diagonals;

import java.util.Scanner;

public class NumberOfDiagonals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            System.out.printf("%d%n", (input * (input - 3)) / 2);
        }
    }
}