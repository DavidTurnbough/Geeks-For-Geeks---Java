//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 10, 2018
// Geeks for Geeks: Invert The Bits
// https://practice.geeksforgeeks.org/problems/invert-the-bits/0
//******************************************************************************
package invert.the.bits;

import java.util.Scanner;

public class InvertTheBits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            long value = in.nextInt();
            
            System.out.println((long)(Math.pow(2, 32) - 1) - value);
        }
    }
}