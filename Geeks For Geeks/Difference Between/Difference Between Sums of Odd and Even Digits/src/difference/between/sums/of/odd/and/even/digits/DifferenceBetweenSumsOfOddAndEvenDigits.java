//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 8, 2018
// Geeks for Geeks - Difference Between Sums of Odd and Even Digits
// https://practice.geeksforgeeks.org/problems/difference-between-sums-of-odd-and-even-digits/0
//******************************************************************************
package difference.between.sums.of.odd.and.even.digits;

import java.util.Scanner;

public class DifferenceBetweenSumsOfOddAndEvenDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            long input = in.nextLong();
            
            int evenSum = 0;
            int oddSum = 0;
            
            while(input > 0)
            {
                evenSum += input % 10;
                input /= 10;
                oddSum += input% 10;
                input /= 10;
            }
            
            System.out.printf("%s%n", evenSum - oddSum == 0 ? "Yes" : "No");
        }
    }
}