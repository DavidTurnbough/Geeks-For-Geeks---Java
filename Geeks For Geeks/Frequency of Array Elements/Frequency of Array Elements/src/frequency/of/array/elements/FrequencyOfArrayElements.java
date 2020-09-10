//******************************************************************************
// Name: David Turnbough
// Date: Sunday August 12, 2018
// Geeks for Geeks: Frequency of Array Elements
// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
//******************************************************************************
package frequency.of.array.elements;

import java.util.Scanner;

public class FrequencyOfArrayElements
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] foo = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                foo[i] = in.nextInt();
            }
            
            int[] bar = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                int index = foo[i];
                bar[index - 1] = bar[index - 1] + 1;
            }
            
            for(int i = 0; i < size; ++i)
            {
                System.out.printf("%d ", bar[i]);
            }
            
            System.out.printf("%n");
            
        }
        
    }
}