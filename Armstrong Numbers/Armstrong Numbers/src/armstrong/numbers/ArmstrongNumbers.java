//******************************************************************************
// Name: David Turnbough
// Date: January 15, 2018 Monday
// Geeks for Geeks: Armstrong Numbers
// https://practice.geeksforgeeks.org/problems/armstrong-numbers/0/?ref=self
//******************************************************************************
package armstrong.numbers;

import java.util.Scanner;

public class ArmstrongNumbers
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while (testCases-- > 0)
        {
            int inputValue = in.nextInt();

            int total = 0;
            int copyOfInputValue = inputValue;
            int temp = Integer.MAX_VALUE;

            while (temp > 0)
            {
                temp = copyOfInputValue % 10;
                copyOfInputValue /= 10;
                total += temp * temp * temp;
            }

            if (total == inputValue)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
