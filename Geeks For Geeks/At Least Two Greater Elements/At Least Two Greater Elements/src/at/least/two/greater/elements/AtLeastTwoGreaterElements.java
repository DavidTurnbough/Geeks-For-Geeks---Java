//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 21, 2019
// Geeks For Geeks: At Least Two Greater Elements
// https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements/0
//******************************************************************************
package at.least.two.greater.elements;

import java.util.Arrays;
import java.util.Scanner;

public class AtLeastTwoGreaterElements
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] myArray = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                myArray[i] = in.nextInt();
            }
            
            Arrays.sort(myArray);
            
            for(int i = 0; i < size - 2; ++i)
            {
                System.out.printf("%d ", myArray[i]);
            }
            System.out.printf("%n");
        }
    }
}