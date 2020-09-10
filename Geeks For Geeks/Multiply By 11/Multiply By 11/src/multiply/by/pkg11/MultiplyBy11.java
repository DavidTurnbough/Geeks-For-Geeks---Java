//******************************************************************************
// Name: David Turnbough
// Date: Monday May 15, 2018
// Geeks for Geeks: Multiply By 11
// https://practice.geeksforgeeks.org/problems/multiply-by-11/0
//******************************************************************************
package multiply.by.pkg11;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBy11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            BigInteger input = in.nextBigInteger();
            BigInteger offset = new BigInteger("10");
            
            System.out.printf("%d%n", input.add(input.multiply(offset)));
        }
    }
}