//******************************************************************************
// Name: David Turnbough
// Date: Tuesday January 1, 2019
// Geeks For Geeks: Java - Loops | Set 1
// https://practice.geeksforgeeks.org/problems/java-loops-set-1/0
//******************************************************************************
package loops.set.pkg1;

import java.util.Scanner;

public class LoopsSet1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int inputValue = in.nextInt();
            int evenSum = 0;
            int oddSum = 0;
            
            for(int i = 0; i <= inputValue; ++i)
            {
                if(i % 2 == 0)
                {
                    evenSum += i;
                }
                else
                {
                    oddSum += i;
                }
            }
            
            System.out.printf("%d %d%n", evenSum, oddSum);
        }
    }   
}