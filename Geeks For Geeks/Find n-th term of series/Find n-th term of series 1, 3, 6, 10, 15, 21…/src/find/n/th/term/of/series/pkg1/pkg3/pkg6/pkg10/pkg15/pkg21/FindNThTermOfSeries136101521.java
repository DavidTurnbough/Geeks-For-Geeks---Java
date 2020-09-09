//******************************************************************************
// Name: David Turnbough
// Date: January 8, 2018 Monday
// Geeks for Geeks: Find n-th term of series 1, 3, 6, 10, 15, 21…
// https://practice.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-21/0
//******************************************************************************
package find.n.th.term.of.series.pkg1.pkg3.pkg6.pkg10.pkg15.pkg21;

import java.util.Scanner;

public class FindNThTermOfSeries136101521
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int term = in.nextInt();
            
            int total = 1;
            
            for(int i = 2; i <= term; ++i)
            {
                total = total + i;
                
            }
            
            System.out.printf("%d%n", total);
            
        }
    }
}