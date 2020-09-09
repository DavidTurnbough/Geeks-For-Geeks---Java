//******************************************************************************
// Name: David Turnbough
// Date: Tuesday February 11, 2020
// Geeks For Geeks: Decimal To Binary
// https://practice.geeksforgeeks.org/problems/decimal-to-binary/0
//******************************************************************************
package decimal.to.binary;

import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            System.out.printf("%s%n", Integer.toBinaryString(input));
        }
    }
}