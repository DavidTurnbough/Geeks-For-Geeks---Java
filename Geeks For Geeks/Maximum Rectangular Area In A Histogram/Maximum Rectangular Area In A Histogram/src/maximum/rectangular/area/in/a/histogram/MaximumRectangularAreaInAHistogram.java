//******************************************************************************
// Name: David Turnbough
// Date:
// Geeks For Geeks: Maximum Rectangular Area In A Histogram
//
//******************************************************************************
package maximum.rectangular.area.in.a.histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumRectangularAreaInAHistogram
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0)
        {
            int size = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");

            Stack<Integer> stack = new Stack<>();

            int maxArea = Integer.MIN_VALUE;
            int currentMaxArea = Integer.MIN_VALUE;
            int smallestHeight = Integer.MAX_VALUE;

            for (int i = 0; i < size; ++i)
            {
                for (int j = i; j < size; ++j)
                {
                    
                }
            }

            System.out.println(maxArea);
        }
    }
}
