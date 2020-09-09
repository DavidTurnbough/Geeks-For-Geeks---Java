//******************************************************************************
// Name: David Turnbough
// Date: Wednesday July 15, 2020
// Geeks For Geeks: Decimal To Any Base Conversion
// https://practice.geeksforgeeks.org/problems/decimal-to-any-base-conversion/0
//******************************************************************************
package decimal.to.any.base.conversion;

import java.util.Scanner;

public class DecimalToAnyBaseConversion
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        try
        {
            while (testCases-- > 0)
            {
                int base = in.nextInt();
                int input = in.nextInt();

                String output = "";

                while (input > 0)
                {
                    int remainder = input % base;

                    switch (remainder)
                    {
                        case 10:
                            output += "A";
                            break;
                        case 11:
                            output += "B";
                            break;
                        case 12:
                            output += "C";
                            break;
                        case 13:
                            output += "D";
                            break;
                        case 14:
                            output += "E";
                            break;
                        case 15:
                            output += "F";
                            break;
                        default:
                            output += Integer.toString(remainder);
                    }

                    input = input / base;
                }

                String temp = "";

                for (int i = output.length() - 1; i >= 0; --i)
                {
                    temp += output.charAt(i);
                }

                System.out.printf("%S%n", temp);

            }
        }
        catch (Exception e)
        {

        }
    }
}
