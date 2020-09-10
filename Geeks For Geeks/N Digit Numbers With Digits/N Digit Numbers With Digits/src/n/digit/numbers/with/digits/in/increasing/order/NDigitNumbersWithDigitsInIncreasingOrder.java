//******************************************************************************
// Name: David Turnbough
// Date: Tuesday July 28, 2020
// Geeks For Geeks: N Digit Numbers With Digits In Increasing Order
// https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order/0
//******************************************************************************
package n.digit.numbers.with.digits.in.increasing.order;

import java.util.Scanner;

public class NDigitNumbersWithDigitsInIncreasingOrder
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int maxLength = in.nextInt();

            int startingValue = (int) Math.pow(10, maxLength - 1);

            answer(startingValue, maxLength);
            System.out.println();
        }
    }

    public static void answer(int currentValue, int maxLength)
    {
        int temp = (int) Math.pow(10, maxLength);
        
        System.out.println(temp);
        
        
        if (currentValue >= (int) Math.pow(10, maxLength))
        {
            return;
        }
    }
}
