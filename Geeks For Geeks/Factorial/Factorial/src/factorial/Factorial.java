//******************************************************************************
// Name: David Turnbough
// Date: January 5, 2018 Friday
// Geeks for Geeks : Factorial
// https://practice.geeksforgeeks.org/problems/factorial/0
//******************************************************************************
package factorial;

import java.math.BigInteger;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import java.util.Scanner;

public class Factorial
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            BigInteger input = in.nextBigInteger();
            
            BigInteger output = new BigInteger("1");
            
            while(!input.equals(ZERO))
            {
                output = output.multiply(input);
                input = input.subtract(ONE);
            }
            
            System.out.printf("%d%n", output);
        }
    }
}
