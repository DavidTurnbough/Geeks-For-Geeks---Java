//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: Area of Rectangle, Right Angled Triangle and Circle
// https://practice.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle/0
//******************************************************************************
package area.of.rectangle.right.angled.triangle.and.circle;

import java.util.Scanner;

public class AreaOfRectangleRightAngledTriangleAndCircle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int lengthOfRectangle = in.nextInt();
            int widthOfRectangle = in.nextInt();
            int baseOfTriangle = in.nextInt();
            int perpendicularOfTriangle = in.nextInt();
            int radiusOfCircle = in.nextInt();
            
            int areaOfRectangle = lengthOfRectangle * widthOfRectangle;
            int areaOfTriangle = (int)(0.5 * baseOfTriangle * perpendicularOfTriangle);
            int areaOfCircle =  (int)(3.14 * radiusOfCircle * radiusOfCircle);
            
            System.out.printf("%d %d %d%n", areaOfRectangle, areaOfTriangle, areaOfCircle);
        }
    }
}