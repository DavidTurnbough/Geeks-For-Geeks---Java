// Geeks for Geeks : 
// https://practice.geeksforgeeks.org/problems/sum-of-array/0

package sum.of.array;

import java.util.Scanner;

public class SumOfArray
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
            
            int sum = 0;
            
            for(int i = 0; i < size; ++i)
            {
                sum += arr[i];
            }
            
            System.out.printf("%d%n", sum);
        }
    }
}