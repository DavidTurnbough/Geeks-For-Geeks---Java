//******************************************************************************
// Name: David Turnbough
// Date: Wednesday February 12, 2020
// Geeks For Geeks: Full Prime
// https://practice.geeksforgeeks.org/problems/full-prime/0
//******************************************************************************
package full.prime;

import java.math.BigInteger;
import java.util.Scanner;

public class FullPrime
{
    public static boolean isPrime(int input)
    {
        BigInteger value = new BigInteger(String.valueOf(input));
        
        return value.isProbablePrime(1);
    }
    
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int input = in.nextInt();
            
            boolean isPrime = isPrime(input);
            
            while(isPrime && input > 0)
            {
                int temp = input % 10;
                
                isPrime = isPrime(temp);
                
                input /= 10;
            }
            
            System.out.printf("%s%n", isPrime ? "Yes" : "No");
        }
    }
}