//******************************************************************************
// Name: David Turnbough
// Date: January 13, 2018 Saturday
// Geeks for Geeks: Special Series Sum
// https://practice.geeksforgeeks.org/problems/special-series-sum/0
//******************************************************************************
package special.series.sum;

import java.util.Scanner;

public class SpecialSeriesSum
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int value = in.nextInt();
            
            int total = 0;
            
            for(int i = 1; i <= value; ++i)
            {
                for(int j = 1; j <= i; ++j)
                {
                    total = total + j;
                }
            }
            
            System.out.printf("%d%n", total);
        }
    }
}