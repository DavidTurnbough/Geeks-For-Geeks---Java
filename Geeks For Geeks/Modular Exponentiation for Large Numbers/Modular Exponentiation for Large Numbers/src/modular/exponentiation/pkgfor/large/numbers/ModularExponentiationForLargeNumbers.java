//******************************************************************************
// Name: David Turnbough
// Date: Wednesday May 23, 2018
// Geeks For Geeks: Modular Exponentiation for Large Numbers
// https://practice.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers/0
//******************************************************************************
package modular.exponentiation.pkgfor.large.numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class ModularExponentiationForLargeNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            BigInteger base = in.nextBigInteger();
            BigInteger exponent = in.nextBigInteger();
            BigInteger modulus = in.nextBigInteger();
            
            System.out.printf("%d%n", base.modPow(exponent, modulus));
        }
    }
}