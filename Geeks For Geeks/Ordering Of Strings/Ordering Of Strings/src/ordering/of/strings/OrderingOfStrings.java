//******************************************************************************
// Name: David Turnbough
// Date: Thursday February 13, 2020
// Geeks For Geeks: Ordering Of Strings
// https://practice.geeksforgeeks.org/problems/ordering-of-strings/0
//******************************************************************************
package ordering.of.strings;

import java.util.Scanner;

public class OrderingOfStrings
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int numberOfStrings = in.nextInt();
            
            String smallest = in.next();
            String largest = smallest;
            
            for(int i = 0; i < numberOfStrings - 1; ++i)
            {
                String temp = in.next();
                
                if(largest.compareTo(temp) < 0)
                {
                    largest = temp;
                }
                else if(smallest.compareTo(temp) > 0)
                {
                    smallest = temp;
                }
            }
            
            System.out.printf("%s %s%n", smallest, largest);
        }
    }
}