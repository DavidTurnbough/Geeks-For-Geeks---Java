//******************************************************************************
// Name: David Turnbough
// Date: Saturday June 8, 2019
// Geeks For Geeks: Multiples Power
// https://practice.geeksforgeeks.org/problems/multiples-power/0
//******************************************************************************
package multiples.power;

import java.util.Scanner;

public class MultiplesPower
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int input = in.nextInt();

            int total = 0;
            int multiple = 1;
            
            while ((multiple * 3 < input) || multiple * 7 < input)
            {
                if ((multiple * 3) < input)
                {
                    total += (multiple * 3);
                }
                else if ((multiple * 7) < input)
                {
                    total += (multiple * 7);
                }

                multiple++;
            }

            System.out.printf("%d%n", total);
        }
    }
}
