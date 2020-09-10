//******************************************************************************
// Name: David Turnbough
// Date: Wednesday June 5, 2019
// Geeks For Geeks: Java Switch Case Statement
// https://practice.geeksforgeeks.org/problems/java-switch-case-statement/0
//******************************************************************************
package jaba.pkgswitch.pkgcase.statement;

import java.util.Scanner;

public class JabaSwitchCaseStatement
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int option = in.nextInt();
            switch(option)
            {
                case 1: // Circle
                    int radius = in.nextInt();
                    System.out.println(Math.PI * radius * radius);
                    break;
                default: // Rectangle
                    int length = in.nextInt();
                    int width = in.nextInt();
                    System.out.printf("%d%n", (length * width));
            }
        }
    }
}