//******************************************************************************
// Name: David Turnbough
// Date: Sunday July 22, 2018
// Geeks for Geeks: Rightmost Different Bit
// https://practice.geeksforgeeks.org/problems/rightmost-different-bit/0
//******************************************************************************
package rightmost.different.bit;

import java.util.Scanner;

public class RightmostDifferentBit
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();

            int count = 0;

            if (firstValue == secondValue)
            {
                count = -1;
            }
            else
            {
                while (firstValue > 0 || secondValue > 0)
                {
                    count++;

                    int firstTemp = firstValue % 2;
                    int secondTemp = secondValue % 2;

                    firstValue /= 2;
                    secondValue /= 2;

                    if (firstTemp != secondTemp)
                    {
                        break;
                    }

                }
            }

            System.out.printf("%d%n", count);
        }
    }
}
