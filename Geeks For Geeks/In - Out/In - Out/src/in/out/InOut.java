//******************************************************************************
// Name: David Turnbough
// Date: Monday December 31, 2018
// Geeks for Geeks: Java Input/Output
// https://practice.geeksforgeeks.org/problems/java-inputoutput/0
//******************************************************************************
package in.out;

import java.util.Scanner;

public class InOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        in.nextLine();
        
        while(testCases-- > 0 )
        {
            String inputString = in.nextLine();
            int inputNumber = in.nextInt();
            in.nextLine();
            
            System.out.printf("The input string :%s%n", inputString);
            System.out.printf("The input integer :%d%n", inputNumber);
        }
    }
}