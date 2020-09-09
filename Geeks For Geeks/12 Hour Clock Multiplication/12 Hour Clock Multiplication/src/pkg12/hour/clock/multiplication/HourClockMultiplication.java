//******************************************************************************
// Name: David Turnbough
// Date: Wednesday August 14, 2019
// Geeks For Geeks: 12 Hour Clock Multiplication
// https://practice.geeksforgeeks.org/problems/12-hour-clock-multiplication/0
//******************************************************************************
package pkg12.hour.clock.multiplication;

import java.util.Scanner;

public class HourClockMultiplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int number1 = in.nextInt();
            int number2 = in.nextInt();
            
            System.out.printf("%d%n", (number1 * number2) % 12);
        }
    }
}