//******************************************************************************
// Name: David Turnbough
// Date: Saturday May 12, 2018
// Geeks for Geeks: Four Elements
// https://practice.geeksforgeeks.org/problems/four-elements/0
//******************************************************************************
package four.elements;

import java.util.Scanner;

public class FourElements
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
            
            int total = in.nextInt();
            
            boolean matchNotFound = true;
            
            for(int i = 0; i < size - 3 && matchNotFound; ++i)
            {
                if(arr[i] > total)
                {
                    continue;
                }
                for(int j = i + 1; j < size - 2 && matchNotFound; ++j)
                {
                    if(arr[i] + arr[j] > total)
                    {
                        continue;
                    }
                    for(int k = j + 1; k < size - 1 && matchNotFound; ++k)
                    {
                        if(arr[i] + arr[j] + arr[k] > total)
                        {
                            continue;
                        }
                        for(int l = k + 1; l < size && matchNotFound; ++l)
                        {
                            if(total == arr[i] + arr[j] + arr[k] + arr[l])
                            {
                                matchNotFound = false;
                            }
                        }
                    }
                }
            }
            
            if(matchNotFound)
            {
                System.out.printf("%d%n", 0);
            }
            else
            {
                System.out.printf("%d%n", 1);
            }
        }
    }
}