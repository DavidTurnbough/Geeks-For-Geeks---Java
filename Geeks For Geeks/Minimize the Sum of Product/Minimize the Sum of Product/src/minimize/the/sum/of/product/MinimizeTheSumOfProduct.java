//******************************************************************************
// Geeks for Geeks: Minimize the Sum of Product
// https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product/0
//******************************************************************************
package minimize.the.sum.of.product;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class MinimizeTheSumOfProduct
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int[] firstArray = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                firstArray[i] = in.nextInt();
            }
            
            sort(firstArray);
            
            int[] secondArray = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                secondArray[i] = in.nextInt();
            }
            
            sort(secondArray);
            
            int total = 0;
            
            for(int i = 0; i < size; ++i)
            {
                total += firstArray[i] * secondArray[(size - 1) - i];
            }
            
            System.out.println(total);
        }
    }
}