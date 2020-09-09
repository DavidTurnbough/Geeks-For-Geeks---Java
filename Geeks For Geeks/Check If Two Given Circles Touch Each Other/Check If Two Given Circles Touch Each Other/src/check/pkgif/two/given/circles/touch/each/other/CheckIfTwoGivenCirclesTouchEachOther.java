//******************************************************************************
// Name: David Turnbough
// Date: Sunday February 9, 2020
// Geeks For Geeks: Check If Two Given Circles Touch Each Other
// https://practice.geeksforgeeks.org/problems/checcheck-if-two-given-circles-touch-each-other/0
//******************************************************************************
package check.pkgif.two.given.circles.touch.each.other;

import java.util.Scanner;

public class CheckIfTwoGivenCirclesTouchEachOther
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r1 = in.nextInt();
            int r2 = in.nextInt();
            
            int distance = (int)Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
            int totalRadius = r1 + r2;
            
            if(totalRadius >= distance)
            {
                System.out.printf("%d%n", 1);
            }
            else
            {
                System.out.printf("%d%n", 0);
            }
        }
    }
}