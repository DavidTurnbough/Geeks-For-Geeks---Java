//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 11, 2020
// Geeks For Geeks: Sum Of AP Series
// https://practice.geeksforgeeks.org/problems/sum-of-ap-series/0
//******************************************************************************
package sum.of.ap.series;

import java.util.Scanner;

public class SumOfAPSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            double a = in.nextDouble();
            double d = in.nextDouble();
            double n = in.nextDouble();
            double s = 0;
            
            for(int i = 0; i < n; ++i)
            {
                s += a + i * d;
            }
            
            System.out.printf("%.2f%n", s);
        }
    }
}