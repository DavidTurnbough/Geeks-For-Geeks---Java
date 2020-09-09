//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 21, 2019
// Geeks For Geeks: Binary Number To Decimal Number
// https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number/0
//******************************************************************************
package binary.number.to.decimal.number;

import java.util.Scanner;

public class BinaryNumberToDecimalNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String input = in.nextLine();
            
            int output = 0;
            
            for(int i = input.length() - 1; i >= 0; --i)
            {
                if(input.charAt(i) == '1')
                {
                    output += Math.pow(2, (input.length() - 1) - i);
                }
            }
            
            System.out.printf("%d%n", output);
        }
    }
}