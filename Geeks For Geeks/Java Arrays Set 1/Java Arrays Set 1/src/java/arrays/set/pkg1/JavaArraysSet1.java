//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 25, 2019
// Geeks For Geeks: Java Arrays | Set 1
// https://practice.geeksforgeeks.org/problems/java-arrays-set-1/0
//******************************************************************************
package java.arrays.set.pkg1;

import java.util.Scanner;

public class JavaArraysSet1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int sum = 0;
            
            for(int i = 0; i < size; ++i)
            {
                sum += in.nextInt();
            }
            
            System.out.printf("%d %.2f%n", sum, (sum / size));
            
        }
    }
}