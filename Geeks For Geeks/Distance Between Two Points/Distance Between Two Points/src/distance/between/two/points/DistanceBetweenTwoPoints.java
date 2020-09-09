//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 11, 2020
// Geeks For Geeks: Distance Between Two Points
// https://practice.geeksforgeeks.org/problems/distance-between-2-points/0
//******************************************************************************
package distance.between.two.points;

import java.util.Scanner;

public class DistanceBetweenTwoPoints
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
            
            int x = x2 - x1;
            int y = y2 - y1;
            
            int d = (int)Math.round(Math.sqrt((x * x) + (y * y)));
            
            System.out.printf("%d%n", d);
        }
    }
}