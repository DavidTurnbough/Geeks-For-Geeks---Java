//******************************************************************************
// Name: David Turnbough
// Date: January 5, 2018 Friday
// Geeks for Geeks : Pair Array Product Sum
// https://practice.geeksforgeeks.org/problems/pair-array-product-sum/0
//******************************************************************************
package pair.array.product.sum;

import java.util.Scanner;

public class PairArrayProductSum
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
            
            int total = 0;
            
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = (i + 1); j < size; ++j)
                {
                    if(myArray[i] + myArray[j] < myArray[i] * myArray[j])
                    {
                        total++;
                    }
                }
            }
            
            System.out.printf("%d%n", total);
            
        }
    }
}
