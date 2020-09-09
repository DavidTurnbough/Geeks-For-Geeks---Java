//******************************************************************************
// Name: David Turnbough
// Date: Wednesday July 15, 2020
// Geeks For Geeks: Determine Focal Length Of A Spherical Mirror
// https://practice.geeksforgeeks.org/problems/determine-focal-length-of-a-spherical-mirror/0
//******************************************************************************
package determine.focal.length.of.a.spherical.mirror;

import java.util.Scanner;

public class DetermineFocalLengthOfASphericalMirror
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        in.nextLine();

        while (testCases-- > 0)
        {
            String type = in.nextLine();
            double radius = in.nextDouble();
            in.nextLine();

            double focalPoint = 0;

            if ("convex".equals(type))
            {
                radius = Math.ceil(radius);
                focalPoint = -Math.ceil(radius / 2.0);
            }
            else
            {
                focalPoint = Math.floor(radius / 2.0);
            }

            System.out.printf("%d%n", (int) focalPoint);
        }
    }
}
