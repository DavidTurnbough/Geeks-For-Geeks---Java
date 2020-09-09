//******************************************************************************
// Name: David Turnbough
// Date: January 13, 2018 Saturday
// Geeks for Geeks: Addition of Two Numbers
// https://practice.geeksforgeeks.org/problems/addition-of-two-numbers/0/?ref=self
//******************************************************************************
package addition.of.two.numbers;

import java.util.Scanner;

public class AdditionOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();
            
            System.out.printf("%d%n", firstValue + secondValue);
        }
    }
}