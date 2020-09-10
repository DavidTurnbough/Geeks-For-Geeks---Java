//******************************************************************************
// Name: David Turnbough
// Date: Thursday May 23, 2019
// Geeks For Geeks: Print The Left Element
// https://practice.geeksforgeeks.org/problems/print-the-left-element/0
//******************************************************************************
package print.the.left.element;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTheLeftElement
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] myArray = new int[size];
            
            for(int i = 0;i < size; ++i)
            {
                myArray[i] = in.nextInt();
            }
            
            Arrays.sort(myArray);
            
            int index = 0;
            
            if(size % 2 == 0)
            {
                index = (size / 2) - 1;
            }
            else
            {
                index = size / 2;
            }
            
            System.out.printf("%d%n", myArray[index]);
        }
    }
}