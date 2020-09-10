//******************************************************************************
// Name: David Turnbough
// Date: Friday June 7, 2019
// Geeks For Geeks: Smaller And Larger
// https://practice.geeksforgeeks.org/problems/smaller-and-larger/0
//******************************************************************************
package smaller.and.larger;

import java.util.Scanner;

public class SmallerAndLarger
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        while(testCases-- > 0)
        {
            int size = in.nextInt();
            
            int value = in.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = in.nextInt();
            }
            
            int lessThanOrEqual = 0;
            int largerThan = 0;
            
            boolean isLessThan = true;
            
            for(int i = 0; i < size && isLessThan; ++i)
            {
                if(arr[i] == value)
                {
                    lessThanOrEqual++;
                    largerThan++;
                }
                else if(arr[i] < value)
                {
                    lessThanOrEqual++;
                }
                else
                {
                    largerThan += size - i;
                    isLessThan = false;
                }
            }
            
            System.out.printf("%d %d%n", lessThanOrEqual, largerThan);
        }
    }
}