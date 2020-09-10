//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 10, 2018
// Geeks for Geeks: Surface Area and Volume of Cuboid
// https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid/0
//******************************************************************************
package surface.area.and.volume.of.cuboid;

import java.util.Scanner;

public class SurfaceAreaAndVolumeOfCuboid
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int length = in.nextInt();
            int width = in.nextInt();
            int height = in.nextInt();
            int surfaceArea = 2 * (length * width) + 2 * (width * height) + 2 * (length * height);
            int volume = length * width * height;
            
            System.out.printf("%d %d%n", surfaceArea, volume);
        }
    }
}