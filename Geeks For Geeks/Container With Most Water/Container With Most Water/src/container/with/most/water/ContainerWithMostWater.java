//******************************************************************************
// Name: David Turnbough
// Date: Tuesday May 22, 2018
// Geeks For Geeks: Container With Most Water
// https://practice.geeksforgeeks.org/problems/container-with-most-water/0
//******************************************************************************
package container.with.most.water;

import java.util.Scanner;

public class ContainerWithMostWater
{
    public static int min(int a, int b)
    {
        return a <= b ? a : b;
    }
    
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
            
            int area = 0;
            
            for(int i = 0; i < size - 1; ++i)
            {
                for(int j = i + 1; j < size; ++j)
                {
                    if(min(arr[i], arr[j]) * (j - i) > area)
                    {
                        area = min(arr[i], arr[j]) * (j - i);
                    }
                }
            }
            
            System.out.printf("%d%n", area);
        }
    }
}