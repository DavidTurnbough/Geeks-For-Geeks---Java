//******************************************************************************
// Name: David Turnbough
// Date: January 6, 2018 Saturday
// Geeks for Geeks : Sum of Distinct Elements
// https://practice.geeksforgeeks.org/problems/sum-of-distinct-elements/0
//******************************************************************************
package sum.of.distinct.elements;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class SumOfDistinctElements
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            sort(arr);
            
            int sum = 0;
            
            for(int i = 0; i < size; ++i)
            {
                if(arr[i] != arr[i + 1])
                {
                    
                }
            }
            
            System.out.printf("%d%n", sum);
        }
    }
}
