//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 19, 2018
// Geeks for Geeks: 12 Hour Clock Addition
// https://practice.geeksforgeeks.org/problems/12-hour-clock-addition/0
//******************************************************************************
package pkg12.hour.clock.addition;

import java.util.Scanner;

public class HourClockAddition
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            
            System.out.printf("%d%n", (num1 + num2) % 12);
        }
    }
}