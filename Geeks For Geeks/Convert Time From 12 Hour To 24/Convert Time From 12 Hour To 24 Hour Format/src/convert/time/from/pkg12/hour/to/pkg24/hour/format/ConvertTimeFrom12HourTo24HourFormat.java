//******************************************************************************
// Name: David Turnbough
// Date: Monday June 17, 2019
// Geeks For Geeks: Convert Time From 12 Hour To 24 Hour Format
//https://practice.geeksforgeeks.org/problems/convert-time-from-12-hour-to-24-hour-format/0
//******************************************************************************
package convert.time.from.pkg12.hour.to.pkg24.hour.format;

import java.util.Scanner;

public class ConvertTimeFrom12HourTo24HourFormat
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0)
        {
            String time = in.nextLine();
            
            if(time.contains("PM"))
            {
                System.out.println("PM");
            }
            
            System.out.printf("%s%n", time);
        }
    }
}