//******************************************************************************
// Name: David Turnbough
// Date: Wednesday February 12, 2020
// Geeks For Geeks: Leap Year
// https://practice.geeksforgeeks.org/problems/leap-year/0
//******************************************************************************
package leap.year;

import java.util.Scanner;

public class LeapYear
{
    public static boolean leapYear(int year)
    {
        boolean isLeapYear = false;
        
        if(year % 4 == 0)
        {
            isLeapYear = true;
            if(year % 100 == 0 && year % 400 != 0)
            {
                isLeapYear = false;
            }
        }
        
        return isLeapYear;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int year = in.nextInt();
            
            System.out.printf("%s%n", leapYear(year) ? "Yes" : "No");
        }
    }
}