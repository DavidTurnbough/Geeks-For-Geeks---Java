//******************************************************************************
// Name: David Turnbough
// Date: Tuesday July 14, 2020
// Geeks For Geeks: Pascal Triangle
// https://practice.geeksforgeeks.org/problems/pascal-triangle/0
//******************************************************************************
package pascal.triangle;

import java.util.Scanner;
import java.math.BigInteger;

public class PascalTriangle
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int pascalTriangleRow = in.nextInt();

            for (int i = 0; i < pascalTriangleRow; ++i)
            {
                BigInteger numerator = factorial(pascalTriangleRow - 1);
                BigInteger denominator = factorial(i).multiply(factorial((pascalTriangleRow - 1) - i));

                BigInteger pascalTriangleValue = BigInteger.valueOf(1);

                if (denominator.intValue() != 0)
                {
                    pascalTriangleValue = numerator.divide(denominator);
                }

                System.out.printf("%d ", pascalTriangleValue);
            }

            System.out.printf("%n");
        }
    }

    private static BigInteger factorial(int value)
    {
        BigInteger returnValue = BigInteger.valueOf(value);

        for (int i = 1; i < value; ++i)
        {
            returnValue = returnValue.multiply(BigInteger.valueOf(i)); 
        }

        if (value == 0)
        {
            returnValue = BigInteger.valueOf(1);
        }

        return returnValue;
    }
}
