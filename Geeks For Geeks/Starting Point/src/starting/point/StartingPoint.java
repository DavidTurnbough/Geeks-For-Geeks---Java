// Name: David Turnbough
// Date: Tuesday December 22, 2020
// Geeks For Geeks: Starting Point
// https://practice.geeksforgeeks.org/problems/starting-point/0/?problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=problemStatusunsolvedproblemTypefulldifficulty[]-1page1
package starting.point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartingPoint
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            String[] currentPosition = in.readLine().split(" ");

            int currentX = Integer.parseInt(currentPosition[0]);
            int currentY = Integer.parseInt(currentPosition[1]);

            int pathsTravelled = Integer.parseInt(in.readLine());

            String[] rawPath = in.readLine().split(" ");

            int[] path = new int[pathsTravelled];

            for (int i = 0; i < pathsTravelled; ++i)
            {
                path[i] = Integer.parseInt(rawPath[i]);
            }

            for (int i = 0; i < pathsTravelled - 1; ++i)
            {
                currentX -= path[2 * i];
                currentY -= path[(2 * i) + 1];
            }

            System.out.printf("%d %d%n", currentX, currentY);
        }
    }
}
