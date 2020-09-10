//******************************************************************************
// Name: David Turnbough
// Date: January 10, 2018 Wednesday
// Geeks for Geeks: Mr Modulo and Pairs
// https://practice.geeksforgeeks.org/problems/mr-modulo-and-pairs/0
//******************************************************************************
package mr.modulo.and.pairs;

import java.util.Scanner;

public class MrModuloAndPairs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases-- > 0)
        {
            int size = sc.nextInt();
            int remainder = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0; i < size; ++i)
            {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            
            for(int i = 0; i < size; ++i)
            {
                for(int j = 0; j < size; ++j)
                {
                    if(arr[i] % arr[j] == remainder)
                    {
                        count++;
                    }
                }
            }
            
            System.out.printf("%d%n", count);
            
        }
    }
}