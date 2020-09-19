//******************************************************************************
// Name: David Turnbough
// Date: Saturday September 19, 2020
// Geeks For Geeks: Maximum Sum LCM
// https://practice.geeksforgeeks.org/problems/maximum-sum-lcm/0
//******************************************************************************
package maximum.sum.lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSumLCM
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        while (testCases-- > 0)
        {
            int input = Integer.parseInt(in.readLine());

            int output = 0;
            int range = (int) Math.floor(Math.sqrt(input)) + 1;

            for (int i = 1; i < range; ++i)
            {
                // The current value is a factor of the input
                if (input % i == 0)
                {
                    // Running total of all factors found.
                    output += i + (input / i);
                    
                    // Special case where the factor of a value is the factor
                    //  times the same factor
                    if(i == (input / i))
                    {
                        output -= i;
                        break;
                    }
                }
            }

            System.out.printf("%d%n", output);
        }
    }
}
