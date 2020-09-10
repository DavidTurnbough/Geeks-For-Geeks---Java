//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Search an Element in an Array
// https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array/0
//******************************************************************************
package search.an.element.in.an.array;

import java.util.Scanner;

public class SearchAnElementInAnArray
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
            
            int element = in.nextInt();
            int index = -1;
            
            for(int i = 0; i < size; ++i)
            {
                if(arr[i] == element)
                {
                    index = i;
                    break;
                }
            }
            
            System.out.printf("%d%n", index);
            
        }
    }
}